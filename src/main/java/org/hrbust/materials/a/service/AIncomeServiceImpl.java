package org.hrbust.materials.a.service;

import org.hrbust.materials.a.entity.income;
import org.hrbust.materials.a.mapper.AIncomeMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AIncomeServiceImpl implements IncomeService {
    private final AIncomeMapper AIncomeMapper;

    public AIncomeServiceImpl(AIncomeMapper AIncomeMapper){
        this.AIncomeMapper = AIncomeMapper;
    }

    @Override
    public List<income> getIncomes() {
        return this.AIncomeMapper.getIncomes();
    }
}
