package com.carsandtea;

import org.springframework.boot.SpringApplication;

public class TestCarsAndTeaApplication {

    public static void main(String[] args) {
        SpringApplication.from(CarsAndTeaApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
