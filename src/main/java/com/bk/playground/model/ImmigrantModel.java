package com.bk.playground.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.Accessors;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "immigrants")
@Accessors(chain = true)
public class ImmigrantModel {
    // The model class represents the database schema for the entity we are interacting with
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String fistName;
    private String surName;
    private String originatingCountry;
    private String personalIDNumber;
    private String personalIDType;
}
