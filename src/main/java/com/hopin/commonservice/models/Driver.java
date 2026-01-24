package com.hopin.commonservice.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Driver extends BaseClass{

    private String name;

    @Column(nullable = false)
    private long licenseNumber;

    @OneToMany(mappedBy ="driver",fetch = FetchType.LAZY)
    @Fetch(FetchMode.SUBSELECT)
    private List<Review> reviews;

    @OneToMany(mappedBy = "driver",fetch= FetchType.LAZY)
    private List<Booking> booking;

    @OneToOne(mappedBy = "driver")
    private Car car;

    @OneToOne(fetch=FetchType.LAZY)
    private ExactLocation location;

    private String activeCity;

    @Enumerated(value=EnumType.STRING)
    private DriverApprovalStatus approvalStatus;
    //periodically it will be updated-
    private double rating;

    private String aadharCard;

    @OneToOne
    private Booking activeBooking;

}
