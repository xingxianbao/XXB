package cn.edu.aynu.rjxy.upload.controller;

import cn.edu.aynu.rjxy.entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class UploadController {

    private String path = "./src/main//webapp/upload/";
//    @CrossOrigin(origins="http://localhost:9101",allowCredentials="true")
    @RequestMapping("uploadFile")
    public Result upload(MultipartFile file,HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin","*");
        //获取file的原始文件名称
        String fileName = file.getOriginalFilename();
        //截取它的后缀
        int index = fileName.lastIndexOf(".");
        String ext = fileName.substring(index + 1);
        //调用文件上传的工具类
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String str = simpleDateFormat.format(new Date());

        if (!file.isEmpty()) {
            try {
                File filepath = new File(path+str);
                if (!filepath.exists())
                    filepath.mkdirs();
                // 文件保存路径
                long name = System.currentTimeMillis();
                String savePath = path+str+"/"+ name +"."+ext;
                // 转存文件
                file.transferTo(new File(savePath));
                return new Result(true, "http://127.0.0.1:8100/upload/"+str+"/"+name+"."+ext);
            } catch (Exception e) {
                e.printStackTrace();
                return new Result(false, "上传失败请稍后尝试");
            }
        }else{
            return new Result(false, "不能上传空文件");
        }



    }
}
