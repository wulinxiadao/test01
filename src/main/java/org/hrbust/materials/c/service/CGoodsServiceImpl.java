package org.hrbust.materials.c.service;

import org.hrbust.materials.c.entity.goods;
import org.hrbust.materials.c.mapper.CGoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CGoodsServiceImpl implements GoodsService {

    private final CGoodsMapper CGoodsMapper;

    @Autowired
    public CGoodsServiceImpl(CGoodsMapper CGoodsMapper){
        this.CGoodsMapper = CGoodsMapper;
    }

    @Override
    public List<goods> getGoods() {
        return this.CGoodsMapper.getGoods();
    }
}
