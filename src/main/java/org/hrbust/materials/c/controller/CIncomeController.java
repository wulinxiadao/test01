package org.hrbust.materials.c.controller;

import org.hrbust.materials.c.service.IncomeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/c/income")
public class CIncomeController {
    private final IncomeService incomeService;

    public CIncomeController(IncomeService incomeService){
        this.incomeService=incomeService;
    }

    @RequestMapping("list")
    public ModelAndView list(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("income",incomeService.getIncomes());
        mv.setViewName("/WEB-INF/jsp/income-list.jsp");
        return mv;
    }
}
