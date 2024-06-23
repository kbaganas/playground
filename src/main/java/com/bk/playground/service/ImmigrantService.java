package com.bk.playground.service;

import com.bk.playground.dto.ImmigrantModelDTO;
import com.bk.playground.model.mapper.ImmigrantDTO2ModelMapper;
import com.bk.playground.repository.ImmigrantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImmigrantService {
    @Autowired
    private ImmigrantRepository repository;
    public boolean createImmigrantRecord (ImmigrantModelDTO dto) {
        return  repository.createImmigrantRecord(new ImmigrantDTO2ModelMapper().mapToModel(dto));
    }
}
