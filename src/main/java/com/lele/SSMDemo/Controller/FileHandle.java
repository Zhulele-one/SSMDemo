package com.lele.SSMDemo.Controller;

import com.lele.SSMDemo.domain.Student;
import com.lele.SSMDemo.service.StudentService;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;


@Controller
public class FileHandle {
    @Autowired
    StudentService studentService;

    @RequestMapping(value="/upload",method= RequestMethod.POST)
    public String upload(Student student, HttpServletRequest req , Model model) throws Exception {

        //保存数据库的路径
        String sqlPath = null;

        //动态获取上传文件夹的路径
        ServletContext context = req.getServletContext();
        String localPath = context.getRealPath("/upload/");//获取本地存储位置的绝对路径
        //定义文件名
        String filename = null;
        if (!student.getFile().isEmpty()) {
            //生成uuid作为文件名称
            String uuid = UUID.randomUUID().toString().replaceAll("-", "");
            //获得文件类型（可以判断如果不是图片，禁止上传）
            String contentType = student.getFile().getContentType();
            //获得文件后缀名
            String suffixName = contentType.substring(contentType.indexOf("/") + 1);
            //得到 文件名
            filename = uuid + "." + suffixName;
            //文件保存路径
            student.getFile().transferTo(new File(localPath + filename));
        }
        //把图片的相对路径保存至数据库
        sqlPath = "/upload/" + filename;
        System.out.println(sqlPath+"----------");
        student.setNickname(sqlPath);
        studentService.insertStudent(student);
        model.addAttribute("student", student);
        return "redirect:show";

    }


    @RequestMapping(value = "/download", method = RequestMethod.GET)
    public ResponseEntity<byte[]> download(HttpServletRequest request, String filename) throws IOException {
        String realPath = request.getServletContext().getRealPath("/download");//获取下载文件的路径
        File file = new File(realPath, filename);//把下载文件构成一个文件处理   filename:前台传过来的文件名称

        HttpHeaders headers = new HttpHeaders();//设置头信息
        String downloadFileName = new String(filename.getBytes("UTF-8"), "iso-8859-1");//设置响应的文件名

        headers.setContentDispositionFormData("attachment", downloadFileName);
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);

        // MediaType:互联网媒介类型 contentType：具体请求中的媒体类型信息
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, HttpStatus.CREATED);
    }





    public static final String FILESERVERURL = "http://www.zhulele.site/images/";
    /**
     * 文件上传，保存文件到不同服务器
     */
    @RequestMapping("/fileUpload2")
    public String testResponseJson(String picname,MultipartFile uploadFile) throws Exception{
        //定义文件名
        String fileName = "";
        //1.获取原始文件名
        String uploadFileName = uploadFile.getOriginalFilename();
        //2.截取文件扩展名
        String extendName = uploadFileName.substring(uploadFileName.lastIndexOf(".")+1, uploadFileName.length());
        //3.把文件加上随机数，防止文件重复
        String uuid = UUID.randomUUID().toString().replace("-", "").toUpperCase();
        //4.判断是否输入了文件名
        if(!StringUtils.isEmpty(picname)) {
            fileName = uuid+"_"+picname+"."+extendName; }else {
            fileName = uuid+"_"+uploadFileName; }
        System.out.println(fileName);
        //5.创建 sun 公司提供的 jersey 包中的 Client 对象
        Client client = Client.create();
        //6.指定上传文件的地址，该地址是 web 路径
        WebResource resource = client.resource(FILESERVERURL+fileName);
        //7.实现上传
        String result = resource.put(String.class,uploadFile.getBytes());
        System.out.println(result);
        return "success"; }
}
