package com.bhavish;


import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res)
            throws java.io.IOException {
        System.out.println("In Service");
        res.getWriter().println("Hello Servlet Working");
    }
}
