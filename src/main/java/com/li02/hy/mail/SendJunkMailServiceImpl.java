/*
package com.li02.hy.mail;

*/
/*
 *@Author: lihaoyu
 *@Date:2019/3/9,14:01
 *@Description:
 *@Modified:
 *//*



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.List;
@Service
public class SendJunkMailServiceImpl implements SendJunkMailService {
    @Autowired
    JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String form ;
    */
/** logger *//*

    private final static Logger logger = LoggerFactory.getLogger(SendJunkMailServiceImpl.class);

    @Override
    public boolean sendJunkMail(List<AyUser> ayUsers) {

        if(ayUsers==null||ayUsers.size()<=0){
            return  Boolean.FALSE;
        }
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage);
        try {
            messageHelper.setFrom(form);
            messageHelper.setTo("lihaoyughabc@qq.com");
            messageHelper.setText(ayUsers.toString());
            mailSender.send(mimeMessage);
        } catch (MessagingException e) {
            logger.info("发送邮件异常");
            e.printStackTrace();
            return Boolean.FALSE;
        }


        return Boolean.TRUE;
    }
}
*/
