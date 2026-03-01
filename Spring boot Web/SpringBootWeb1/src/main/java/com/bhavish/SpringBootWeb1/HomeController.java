package com.bhavish.SpringBootWeb1;


import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        System.out.println("Home method called");
        return "index.jsp";
        
    }
//    @RequestMapping("add")
//    public String add(HttpServletRequest req, HttpSession session){
//
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
//        int result = num1 + num2;
//        session.setAttribute("result",result);
////        System.out.println(result);
//        System.out.println("Called Add");
//        return "result.jsp";
//    }
// OR
//    @RequestMapping("add")
//    //public String add(int num1,int num2, HttpSession session){
//    //OR
//    public String add(@RequestParam("num1") int num1,@RequestParam("num2") int num2, HttpSession session){
//
//    //    int num1 = Integer.parseInt(req.getParameter("num1"));
//    //    int num2 = Integer.parseInt(req.getParameter("num2"));
//        int result = num1 + num2;
//        session.setAttribute("result",result);
//    //        System.out.println(result);
//        System.out.println("Called Add");
//        return "result.jsp";
//    }
    @RequestMapping("add")
    //public String add(int num1,int num2, HttpSession session){
    //OR
    public String add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model){

        //    int num1 = Integer.parseInt(req.getParameter("num1"));
        //    int num2 = Integer.parseInt(req.getParameter("num2"));
        int result = num1 + num2;
        model.addAttribute("result",result);
//        session.setAttribute("result",result);
        //        System.out.println(result);
        System.out.println("Called Add");
        return "result.jsp";
    }
}
