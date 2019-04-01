package com.li02.hy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.internet.MimeMessage;

/*
 *@Author: lihaoyu
 *@Date:2019/3/9,11:18
 *@Description:
 *@Modified:
 */
@RestController
@RequestMapping("/mail")
public class MailController {
    @Autowired
    JavaMailSender mailSender;

    @ResponseBody
    @RequestMapping("/send")
    public Object sendEmail() {
        try {
            final MimeMessage mimeMessage = this.mailSender.createMimeMessage();
            final MimeMessageHelper message = new MimeMessageHelper(mimeMessage);
            message.setFrom("lihaoyulihaoyu@qq.com");
            message.setTo("lihaoyulihaoyu@qq.com");
            message.setSubject("测试邮件主题李浩宇");
            message.setText("测试邮件内容李浩宇");
            this.mailSender.send(mimeMessage);

            return "sucesss";
        } catch (Exception ex) {
            ex.printStackTrace();
            return "error";
        }
    }
}