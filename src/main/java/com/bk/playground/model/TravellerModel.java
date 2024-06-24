package com.bk.playground.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.Accessors;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "travelers")
@Accessors(chain = true)
public class TravellerModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String fistName;
    private String surName;
    private String originatingCountry;
    private String travellingToCountry;
    private String personalIDNumber;
    private String personalIDType;
}
