package org.hrbust.materials.b.service;

import org.hrbust.materials.b.entity.output;
import org.hrbust.materials.b.mapper.BOutputMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BOutputServiceImpl implements OutputService {
    private final BOutputMapper BOutputMapper;

    public BOutputServiceImpl(BOutputMapper BOutputMapper){
        this.BOutputMapper = BOutputMapper;
    }

    @Override
    public List<output> getOutputs() {
        return this.BOutputMapper.getOutputs();
    }
}
