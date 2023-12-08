//package org.example;
//
//import com.jcraft.jsch.JSch;
//import com.jcraft.jsch.JSchException;
//import com.jcraft.jsch.Session;
//
//
//public class Sftp {
//
//
//    public static void f() throws JSchException {
//
//        String password = "aaaa";
//
//        JSch jsch = new JSch();
//        Session session = jsch.getSession("ubuntu", "192.69.69.69", 22);
//        // ruleid: jsch-hardcoded-secret
//        session.setPassword("aaaaa");
//        // ruleid: jsch-hardcoded-secret
//        session.setPassword(password);
//        session.connect();
//
//    }
//
//}