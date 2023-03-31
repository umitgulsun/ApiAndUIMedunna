package utilities;

import org.codehaus.jackson.map.ObjectMapper;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.chrono.ChronoLocalDateTime;
import java.time.chrono.ChronoZonedDateTime;
import java.time.temporal.ChronoUnit;


public class ObjectMapper01
{

    public static <T> T convertToJson(String json, Class<T> cls) {//Generic Method

        try {
            return new ObjectMapper().readValue(json, cls);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
