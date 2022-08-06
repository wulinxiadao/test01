package org.hrbust.materials.a.controller;

import org.hrbust.materials.a.service.IncomeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/a/income")
public class AIncomeController {
    private final IncomeService incomeService;

    public AIncomeController(IncomeService incomeService){
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
