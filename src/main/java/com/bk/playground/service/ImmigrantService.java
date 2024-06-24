package com.bk.playground.service;

import com.bk.playground.dto.ImmigrantModelDTO;
import com.bk.playground.kafka.producer.MessageProducer;
import com.bk.playground.model.ImmigrantModel;
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

    public ImmigrantModel getImmigrantRecord (Integer id) {
        return  repository.getImmigrantRecord(id);
    }

    @Autowired
    private MessageProducer messageProducer;
    public boolean sendImmigrantMessage (ImmigrantModelDTO dto) {
        ImmigrantModel model = new ImmigrantDTO2ModelMapper().mapToModel(dto);
        String message = model.getFistName() + " " + model.getSurName() +
                ", coming from " + model.getOriginatingCountry() +
                " with ID: " + model.getPersonalIDNumber() + ", ID Type: " + model.getPersonalIDType();
        messageProducer.sendMessage("immigrants", message);
        return true;
    }
}
