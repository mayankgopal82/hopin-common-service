package com.hopin.commonservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Passenger extends BaseClass {

    @OneToMany
    private List<Review> review;
}
