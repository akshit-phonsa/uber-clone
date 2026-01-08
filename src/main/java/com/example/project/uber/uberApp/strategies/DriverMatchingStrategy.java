package com.example.project.uber.uberApp.strategies;

import com.example.project.uber.uberApp.entities.Driver;
import com.example.project.uber.uberApp.entities.RideRequest;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDriver(RideRequest rideRequest);
}
