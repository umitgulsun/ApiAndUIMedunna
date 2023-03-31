package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static authApi.MedunnaAuth.medAuth;

public class MedunnaBaseUrl
{
        public static RequestSpecification spec;
        public static void medunnaSpec()
        {
            spec = new RequestSpecBuilder().setContentType(ContentType.JSON).
                    addHeader("Authorization", "Bearer " + medAuth()).
                    setBaseUri("https://medunna.com").build();
        }

}