package org.hrbust.materials.c.service;

import org.hrbust.materials.c.entity.output;
import org.hrbust.materials.c.mapper.COutputMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class COutputServiceImpl implements OutputService {
    private final COutputMapper COutputMapper;

    public COutputServiceImpl(COutputMapper COutputMapper){
        this.COutputMapper = COutputMapper;
    }

    @Override
    public List<output> getOutputs() {
        return this.COutputMapper.getOutputs();
    }
}
