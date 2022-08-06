package org.hrbust.materials.a.service;

import org.hrbust.materials.a.entity.goods;
import org.hrbust.materials.a.mapper.AGoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AGoodsServiceImpl implements GoodsService {

    private final AGoodsMapper AGoodsMapper;

    @Autowired
    public AGoodsServiceImpl(AGoodsMapper AGoodsMapper){
        this.AGoodsMapper = AGoodsMapper;
    }

    @Override
    public List<goods> getGoods() {
        return this.AGoodsMapper.getGoods();
    }
}
