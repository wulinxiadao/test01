package org.hrbust.materials.b.service;

import org.hrbust.materials.b.entity.income;
import org.hrbust.materials.b.mapper.BIncomeMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BIncomeServiceImpl implements IncomeService {
    private final BIncomeMapper BIncomeMapper;

    public BIncomeServiceImpl(BIncomeMapper BIncomeMapper){
        this.BIncomeMapper = BIncomeMapper;
    }

    @Override
    public List<income> getIncomes() {
        return this.BIncomeMapper.getIncomes();
    }
}
