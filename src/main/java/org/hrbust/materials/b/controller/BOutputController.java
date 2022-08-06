package org.hrbust.materials.b.controller;

import org.hrbust.materials.b.service.OutputService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/b/output")
public class BOutputController {
    private final OutputService outputService;

    public BOutputController(OutputService outputService){
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
