package com.example.atitude6430.dependeciesv2;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Atitude6430 on 2016-01-09.
 */
@Module
public class VehicleModule {
    @Provides
    @Singleton
    Motor provideMotor(){
        return new Motor();
    }

    @Provides @Singleton
    Vehicle provideVehicle(){
        return new Vehicle(new Motor());
    }
}
