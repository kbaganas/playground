package com.bk.playground.model.mapper;

import com.bk.playground.dto.ImmigrantModelDTO;
import com.bk.playground.model.ImmigrantModel;

public class ImmigrantDTO2ModelMapper {
    public ImmigrantModel mapToModel (ImmigrantModelDTO dto) {
        // This will map any data to the Model.
        return new ImmigrantModel()
                .setFistName(dto.getFistName())
                .setSurName(dto.getSurName())
                .setOriginatingCountry(dto.getOriginatingCountry())
                .setPersonalIDNumber(dto.getPersonalIDNumber())
                .setPersonalIDType(dto.getPersonalIDType());
    }
}
