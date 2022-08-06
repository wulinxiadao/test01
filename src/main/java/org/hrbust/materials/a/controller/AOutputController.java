package org.hrbust.materials.a.controller;

import org.hrbust.materials.a.service.OutputService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/a/output")
public class AOutputController {
    private final OutputService outputService;

    public AOutputController(OutputService outputService){
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
