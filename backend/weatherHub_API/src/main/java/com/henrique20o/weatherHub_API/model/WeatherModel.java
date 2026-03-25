package com.henrique20o.weatherHub_API.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table
public class WeatherModel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column (nullable = false)
    private UUID userId;
    @Column(nullable = false, length = 100)
    private  String city;
    @Column
    private String country;
    @Column (nullable = false, length = 100)
    private float temperature;
    @Column (nullable = false)
    private float humidity;
    @Column (nullable = false)
    private float precipitation;
    @Column (nullable = false)
    private float wind;
    @Column (nullable = false)
    private LocalDate searchDate;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public LocalDate getSearchDate() {
        return searchDate;
    }

    public void setSearchDate(LocalDate searchDate) {
        this.searchDate = searchDate;
    }

    protected WeatherModel() {
    }

}
