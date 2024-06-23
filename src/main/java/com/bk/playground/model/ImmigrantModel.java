package com.bk.playground.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class ImmigrantModel {
    // The model class represents the database schema for the entity we are interacting with
    private String fistName;
    private String surName;
    private String originatingCountry;
    private String personalIDNumber;
    private String personalIDType;
}
