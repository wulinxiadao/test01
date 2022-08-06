package org.hrbust.materials.b.service;

import org.hrbust.materials.b.entity.goods;
import org.hrbust.materials.b.mapper.BGoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BGoodsServiceImpl implements GoodsService {

    private final BGoodsMapper BGoodsMapper;

    @Autowired
    public BGoodsServiceImpl(BGoodsMapper BGoodsMapper){
        this.BGoodsMapper = BGoodsMapper;
    }

    @Override
    public List<goods> getGoods() {
        return this.BGoodsMapper.getGoods();
    }
}
