package com.bk.playground.dto;

import lombok.*;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class TravellerModelDTO {
    private String fistName;
    private String surName;
    private String originatingCountry;
    private String travellingToCountry;
    private String personalIDNumber;
    private String personalIDType;
}
