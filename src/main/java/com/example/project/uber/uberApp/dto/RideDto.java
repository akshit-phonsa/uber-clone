package com.example.project.uber.uberApp.dto;

import com.example.project.uber.uberApp.entities.enums.PaymentMethod;
import com.example.project.uber.uberApp.entities.enums.RideStatus;
import lombok.Data;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
public class RideDto {

    private Long id;

    private PointDto pickupLocation;

    private PointDto dropoffLocation;

    private LocalDateTime createdTime;

    private RiderDto rider;

    private DriverDto driver;

    private PaymentMethod paymentMethod;

    private RideStatus rideStatus;

    private Double fare;
    private String otp;

    private LocalDateTime startAt;
    private LocalDateTime endedAt;
}
