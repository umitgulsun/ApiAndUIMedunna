package hooks;

import io.cucumber.java.Before;

import static base_urls.MedunnaBaseUrl.medunnaSpec;

public class Hook
{

        @Before()
        public void get01(){
            medunnaSpec();
        }
}
