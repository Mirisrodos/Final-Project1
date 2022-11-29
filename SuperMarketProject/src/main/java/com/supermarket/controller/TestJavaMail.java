package com.supermarket.controller;

import com.supermarket.util.SendEmailUtil;

public class TestJavaMail {
    public static void main(String[] args) {
//        Nếu không tìm được mail thì tìm trong thư mục thư rác
//        final String username = "truongthuanhoa25@outlook.com.vn";
//        final String password = "12312321";
//
//        Properties prop = new Properties();
//        prop.put("mail.smtp.host", "smtp-mail.outlook.com");
//        prop.put("mail.smtp.port", "587");
//        prop.put("mail.smtp.auth", "true");
//        prop.put("mail.smtp.starttls.enable", "true"); //TLS
//
//        Session session = Session.getInstance(prop,
//                new Authenticator() {
//                    protected PasswordAuthentication getPasswordAuthentication() {
//                        return new PasswordAuthentication(username, password);
//                    }
//                });
//
//        String userMail = "20110485@student.hcmute.edu.vn";
//        String subject = "Test Java Mail";
//        String text = "Nothing";
//
//        try {
//            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress("truongthuanhoa25@outlook.com.vn"));
//            message.setRecipients(
//                    Message.RecipientType.TO,
//                    InternetAddress.parse(userMail)
//            );
//            message.setSubject(subject);
//            message.setText(text);
//
//            Transport.send(message);
//            System.out.println("Done");
//        } catch (MessagingException e) {
//            e.printStackTrace();
//        }

        SendEmailUtil email = new SendEmailUtil();

        System.out.println(SendEmailUtil.sendEmail("truongthuanhoa23@gmail.com",
                "Test Java Mail", "This mail to test Java Mail for my web"));
    }
}
