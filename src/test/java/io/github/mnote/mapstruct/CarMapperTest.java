package io.github.mnote.mapstruct;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CarMapperTest {

    @Test
    public void shouldMapCarToDto() {

        //given
        Car car = new Car();
        car.setMake("Morris");
        car.setNumberOfSeats(5);
        car.setType(CarType.SEDAN);

        //when
        CarDto carDto = CarMapper.INSTANCE.carToCarDto( car );

        //then
        assertNotNull(carDto);
        assertEquals(carDto.getMake(), "Morris" );
        assertEquals(carDto.getSeatCount(), 5);
        assertEquals(carDto.getType(), "SEDAN");

    }

}
