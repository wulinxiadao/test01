package org.hrbust.materials.b.controller;

import org.hrbust.materials.b.service.IncomeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/b/income")
public class BIncomeController {
    private final IncomeService incomeService;

    public BIncomeController(IncomeService incomeService){
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
