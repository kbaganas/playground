package com.bk.playground.controller.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class TravellerRequest {
    private String fistName;
    private String surName;
    private String originatingCountry;
    private String travellingToCountry;
    private String personalIDNumber;
    private String personalIDType;
}
