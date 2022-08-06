package org.hrbust.materials.c.controller;

import org.hrbust.materials.c.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/c/goods")
public class CGoodsController {
    private final GoodsService goodsService;

    public CGoodsController(GoodsService goodsService){
        this.goodsService=goodsService;
    }

    @RequestMapping("/list")
    public ModelAndView list(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("goods",goodsService.getGoods());
        mv.setViewName("/WEB-INF/jsp/goods-list.jsp");
        return mv;
    }
}
