package kss.springframework.jsonexample.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("kebab")
@JsonTest
public class JsonNamingStrategyTest extends BaseTest {

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void serialize() throws JsonProcessingException {
        BeerDto beerDto = getDeerDto();
        String serialized_beerDto = objectMapper.writeValueAsString(beerDto);
        System.out.println(serialized_beerDto);
    }
}
