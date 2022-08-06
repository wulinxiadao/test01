package org.hrbust.materials.c.controller;

import org.hrbust.materials.c.service.OutputService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/c/output")
public class COutputController {
    private final OutputService outputService;

    public COutputController(OutputService outputService){
        this.outputService=outputService;
    }

    @RequestMapping("list")
    public ModelAndView list(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("output",outputService.getOutputs());
        mv.setViewName("/WEB-INF/jsp/output-list.jsp");
        return mv;
    }
}
