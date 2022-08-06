package org.hrbust.materials.c.service;

import org.hrbust.materials.c.entity.income;
import org.hrbust.materials.c.mapper.CIncomeMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CIncomeServiceImpl implements IncomeService {
    private final CIncomeMapper CIncomeMapper;

    public CIncomeServiceImpl(CIncomeMapper CIncomeMapper){
        this.CIncomeMapper = CIncomeMapper;
    }

    @Override
    public List<income> getIncomes() {
        return this.CIncomeMapper.getIncomes();
    }
}
