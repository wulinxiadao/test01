package org.hrbust.materials.a.controller;

import org.hrbust.materials.a.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/a/goods")
public class AGoodsController {
    private final GoodsService goodsService;

    public AGoodsController(GoodsService goodsService){
        this.goodsService=goodsService;
    }

    @RequestMapping("/list")
    public ModelAndView list(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("goods",goodsService.getGoods());
        mv.addObject("count",goodsService.getGoods().size());
        mv.setViewName("/WEB-INF/jsp/goods-list.jsp");
        return mv;
    }
}
