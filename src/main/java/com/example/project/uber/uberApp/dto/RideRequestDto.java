package com.example.project.uber.uberApp.dto;

import com.example.project.uber.uberApp.entities.enums.PaymentMethod;
import com.example.project.uber.uberApp.entities.enums.RideRequestStatus;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RideRequestDto {

    private Long id;

    private PointDto pickupLocation;

    private PointDto dropoffLocation;

    private PaymentMethod paymentMethod;

    private LocalDateTime requestedTime;

    private RiderDto rider;
    private Double fare;

    private RideRequestStatus rideRequestStatus;
}
