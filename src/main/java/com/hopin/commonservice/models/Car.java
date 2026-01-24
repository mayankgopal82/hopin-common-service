package com.hopin.commonservice.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Car extends BaseClass{

    @Column(unique = true,nullable = false)
    private String numberPlate;
    private String model;
    private String brand;

    @Enumerated(value= EnumType.STRING)
    private CarType type;

    @OneToOne
    Driver driver;


}
