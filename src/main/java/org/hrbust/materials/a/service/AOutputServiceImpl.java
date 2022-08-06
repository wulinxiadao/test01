package org.hrbust.materials.a.service;

import org.hrbust.materials.a.entity.output;
import org.hrbust.materials.a.mapper.AOutputMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AOutputServiceImpl implements OutputService {
    private final AOutputMapper AOutputMapper;

    public AOutputServiceImpl(AOutputMapper AOutputMapper){
        this.AOutputMapper = AOutputMapper;
    }

    @Override
    public List<output> getOutputs() {
        return this.AOutputMapper.getOutputs();
    }
}
