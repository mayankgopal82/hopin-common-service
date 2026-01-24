package com.hopin.commonservice.models;

import jakarta.persistence.*;
//import jakarta.validation.constraints.NotEmpty;
//import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Review extends BaseClass  {

//    @OneToOne
//    @JoinColumn(nullable = false)
//    @NotNull
//    @NotEmpty
//    private Booking booking;
//
//    private String content;
//
//    @Column(nullable = false)
//    @NotNull
//    @NotEmpty
//    private Double rating;
//
//    @ManyToOne
//    @NotNull
//    @NotEmpty
//    private Driver driver;
//
//    @ManyToOne
//    @NotNull
//    @NotEmpty
//    private Passenger passenger;

//    @NotNull
//    @NotEmpty
    @JoinColumn(name ="booking_id")
    @OneToOne
    private Booking booking;

    private String content;

//    @NotNull
    private Double rating;

//    @NotNull
    @JoinColumn(name="driver_id")
    @ManyToOne
    private Driver driver;

//    @NotNull
    @JoinColumn(name="passenger_id")
    @ManyToOne
    private Passenger passengerId;

}
