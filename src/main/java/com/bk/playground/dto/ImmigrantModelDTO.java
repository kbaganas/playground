package com.bk.playground.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class ImmigrantModelDTO {
    private String fistName;
    private String surName;
    private String originatingCountry;
    private String personalIDNumber;
    private String personalIDType;
}
