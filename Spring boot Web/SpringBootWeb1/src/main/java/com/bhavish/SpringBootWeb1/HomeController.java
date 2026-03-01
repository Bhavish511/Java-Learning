package com.bhavish.SpringBootWeb1;


import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @ModelAttribute("course")
    public String courseName(){
        return "Java";
    }
    @RequestMapping("/")
    public String home(){
        System.out.println("Home method called");
//        return "index.jsp";
        return "index";


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
    public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView mv){

        //    int num1 = Integer.parseInt(req.getParameter("num1"));
        //    int num2 = Integer.parseInt(req.getParameter("num2"));
        int result = num1 + num2;
//        model.addAttribute("result",result);
        mv.addObject("result",result);
        mv.setViewName("result");
//        session.setAttribute("result",result);
        //        System.out.println(result);
        System.out.println("Called Add");
//        return "result.jsp";
//        return "result";
        return mv;

    }
//    @RequestMapping("addAlien")
//    public ModelAndView addAlien(@RequestParam("aid") int aid, @RequestParam("aname") String aname, ModelAndView mv){
//
//        Alien alien = new Alien();
//        alien.setAid(aid);
//        alien.setAname(aname);
//        mv.addObject("alien",alien);
//        mv.setViewName("result");
//
//        System.out.println("Called Add");
//        return mv;
//
//    }

    // ABove using ModelAttribute
    @RequestMapping("addAlien")
    // ModelAttribute is Optional, It is something that comes behind the scene, It is responsible to add your data to the model object
    // If you want give the different name then you can use ModelAttribute like:
//    public String addAlien(@ModelAttribute("alien1") Alien alien) --> you want alien1 object name
    public String addAlien(Alien alien){

//        Alien alien = new Alien();
//        alien.setAid(aid);
//        alien.setAname(aname);
//        mv.addObject("alien",alien);
//        mv.setViewName("result");
//
//        System.out.println("Called Add");
//        return mv;
        return "result";

    }
}
