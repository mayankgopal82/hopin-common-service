package com.hopin.commonservice.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(indexes = {@Index(columnList = "driver_id")})
public class Booking extends BaseClass {

    @Enumerated(value = EnumType.STRING)
    private BookingStatus bookingStatus;

    private Instant  startTime;

    private Instant endTime;

    @OneToOne
    private ExactLocation startLocation;
    @OneToOne
    private ExactLocation endLocation;

    private long totalDistance;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "diver_id")
    private Driver driver;

    @OneToOne
    private Review review;

    @ManyToOne
    private Passenger passenger;

}
