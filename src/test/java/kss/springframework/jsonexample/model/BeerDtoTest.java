package kss.springframework.jsonexample.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

@JsonTest
class BeerDtoTest extends BaseTest{

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void serial() throws JsonProcessingException {
        BeerDto beerDto = getDeerDto();
        String serialized_beerDto = objectMapper.writeValueAsString(beerDto);
        System.out.println(serialized_beerDto);
    }

    @Test
    void deserialize() throws JsonProcessingException {
        String json = "{\"version\":1,\"beerName\":\"New Beer\",\"upc\":5687123,\"price\":\"23.21\",\"createdDate\":\"2020-04-22T13:01:22+0300\",\"lastModifiedDate\":\"2020-04-22T13:01:22.926362+03:00\",\"quantityOnHand\":12,\"localDate\":\"20200422\",\"beerId\":\"c8072673-5658-4d26-bcc1-d436dc4f66b1\"}";

        BeerDto beerDto = objectMapper.readValue(json, BeerDto.class);
        System.out.println(beerDto);
    }
}