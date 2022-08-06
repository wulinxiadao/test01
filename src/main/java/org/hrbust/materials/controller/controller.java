package org.hrbust.materials.controller;

import org.hrbust.materials.a.service.GoodsService;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping
public class controller {

    @RequestMapping(value = "/login",method = {RequestMethod.POST})
    public ModelAndView login(HttpSession session, @RequestParam(name="adname",required = false) String adname,@RequestParam(name="password",required = false) String pass ){
        ModelAndView mv = new ModelAndView();
        System.out.println(adname);
        System.out.println(pass);
        if(adname.equals("admin" ) && pass.equals("11111"))
        {
            System.out.println("111");
            session.setAttribute("adname",adname);
            session.setAttribute("pass",pass);
            mv.setViewName("/WEB-INF/jsp/admin.jsp");
        }
        else
        {
            if(!adname.equals("admin"))
            {
                mv.addObject("errname","用户名错误");
            }
            else if(!pass.equals("11111"))
            {
                mv.addObject("errpass","密码错误");
            }
            mv.setViewName("/index.jsp");
        }
        return mv;
    }

    @RequestMapping("/admin")
    public String admin(){
        return "WEB-INF/jsp/admin.jsp";
    }

    @RequestMapping("/adminlist")
    public String adminlist(){
        return "WEB-INF/jsp/adminlist.jsp";
    }

    @RequestMapping("/a")
    public String a(){
        return "WEB-INF/jsp/selectA.jsp";
    }
    @RequestMapping("/b")
    public String b(){
        return "WEB-INF/jsp/selectB.jsp";
    }
    @RequestMapping("/c")
    public String c(){
        return "WEB-INF/jsp/selectC.jsp";
    }
}
