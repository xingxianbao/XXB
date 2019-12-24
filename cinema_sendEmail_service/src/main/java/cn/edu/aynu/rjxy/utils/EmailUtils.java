package cn.edu.aynu.rjxy.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
@Component
public class EmailUtils {
        @Autowired
        private JavaMailSender mailSender;

        public void semdText(String toEamil,String message){
            //创建一个基本的邮件发送消息对象
            SimpleMailMessage mailMessage = new SimpleMailMessage();
            //需要设置邮件的发送者 接收者 标题 内容
            mailMessage.setFrom("250658406@qq.com");
            mailMessage.setTo(toEamil);
            mailMessage.setSubject("滴滴你好啊，好久不见");
            mailMessage.setText(message);
            mailSender.send(mailMessage);
            System.out.println("----send ok ---邮件已经成功的发送出去了...");
        }

    public void sendRegisterCode(String toEamil,String message){
        //创建一个基本的邮件发送消息对象
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        //需要设置邮件的发送者 接收者 标题 内容
        mailMessage.setFrom("250658406@qq.com");
        mailMessage.setTo(toEamil);
        mailMessage.setSubject("验证码");
        mailMessage.setText(message);
        mailSender.send(mailMessage);
        System.out.println("----send ok ---验证码邮件已经成功的发送出去了...");
    }






}
