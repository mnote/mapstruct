package io.github.mnote.mapstruct;

import lombok.Data;

@Data
public class Car {

    private String make;
    private int numberOfSeats;
    private CarType type;

}
