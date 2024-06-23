package com.bk.playground.dto.mapper;

import com.bk.playground.controller.request.ImmigrantRequest;
import com.bk.playground.dto.ImmigrantModelDTO;

public class ImmigrantRequest2ModelDTOMapper {
    public ImmigrantModelDTO mapToModel(ImmigrantRequest request) {
        // This will map any data to DTOs.
        return new ImmigrantModelDTO()
                .setFistName(request.getFistName())
                .setSurName(request.getSurName())
                .setOriginatingCountry(request.getOriginatingCountry())
                .setPersonalIDNumber(request.getPersonalIDNumber())
                .setPersonalIDType(request.getPersonalIDType());
    }
}
