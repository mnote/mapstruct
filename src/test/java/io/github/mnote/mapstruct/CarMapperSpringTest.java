package io.github.mnote.mapstruct;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@ContextConfiguration(locations = "classpath:context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class CarMapperSpringTest {

    @Resource
    private CarMapper carMapper;

    @Test
    public void shouldMapCarToDto() {

        //given
        Car car = new Car();
        car.setMake("Morris");
        car.setNumberOfSeats(5);
        car.setType(CarType.SEDAN);

        System.out.println(car);

        //when
        CarDto carDto = carMapper.carToCarDto( car );

        System.out.println(carDto);

        //then
        assertNotNull(carDto);
        assertEquals(carDto.getMake(), "Morris" );
        assertEquals(carDto.getSeatCount(), 5);
        assertEquals(carDto.getType(), "SEDAN");

    }

}
