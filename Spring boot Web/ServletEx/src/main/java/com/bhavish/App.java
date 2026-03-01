package com.bhavish;

import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;

import java.io.File;

public class App {

    public static void main(String[] args) throws Exception {

        System.out.println("Hello World!");

        Tomcat tomcat = new Tomcat();

        // base dir
        tomcat.setBaseDir(System.getProperty("java.io.tmpdir"));

        Connector connector = new Connector();
        connector.setPort(8080);
        tomcat.setConnector(connector);

        // context
        String docBase = new File(".").getAbsolutePath();
        Context context = tomcat.addContext("", docBase);

        Tomcat.addServlet(context, "HelloServlet", new HelloServlet());
        context.addServletMappingDecoded("/hello", "HelloServlet");

        tomcat.start();
        tomcat.getServer().await();
    }
}