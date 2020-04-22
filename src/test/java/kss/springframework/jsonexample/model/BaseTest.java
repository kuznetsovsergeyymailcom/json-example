package kss.springframework.jsonexample.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

public class BaseTest {

    BeerDto getDeerDto(){
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("New Beer")
                .version(1)
                .createdDate(OffsetDateTime.now())
                .lastModifiedDate(OffsetDateTime.now())
                .price(new BigDecimal("23.21"))
                .upc(5687123L)
                .quantityOnHand(12)
                .localDate(LocalDate.now())
                .build();
    }
}
