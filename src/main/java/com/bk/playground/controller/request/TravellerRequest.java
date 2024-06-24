package com.bk.playground.controller.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class TravellerRequest {
    private String fistName;
    private String surName;
    private String originatingCountry;
    private String travellingToCountry;
    private String personalIDNumber;
    private String personalIDType;
}
