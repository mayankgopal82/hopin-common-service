package com.hopin.commonservice.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookingEvent {

    private BookingEventType type;
    private Long bookingId;
    private Long passengerId;
    private Long driverId;
}
