package com.henrique20o.weatherHub_API.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.UUID;

public class WeatherSearchModel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, length = 100)
    private  String city;
    @Column (nullable = false, length = 100)
    private float temperature;
    @Column (nullable = false)
    private float humidity;
    @Column (nullable = false)

}
