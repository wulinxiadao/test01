package org.hrbust.materials.b.controller;

import org.hrbust.materials.b.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/b/goods")
public class BGoodsController {
    private final GoodsService goodsService;

    public BGoodsController(GoodsService goodsService){
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
