package com.example.atitude6430.dependeciesv2;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Atitude6430 on 2016-01-09.
 */
@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {
    Vehicle provideVehicle();
}
