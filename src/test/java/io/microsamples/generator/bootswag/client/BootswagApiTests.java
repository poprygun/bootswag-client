package io.microsamples.generator.bootswag.client;


import io.microsamples.generator.bootswag.ApiClient;
import io.microsamples.generator.bootswag.api.DesertControllerApi;
import io.microsamples.generator.bootswag.model.Donut;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BootswagApiTests {
    private DesertControllerApi api;

    @BeforeEach
    public void setup() {
        final ApiClient apiClient = new ApiClient();
        apiClient.setBasePath("http://localhost:8080/api");
        api = apiClient.buildClient(DesertControllerApi.class);
    }


    /**
     * Add a new donut
     *
     *
     */
    @Test
    public void addDonutTest() {
        Donut body = null;
        // api.addDonut(body);

        // TODO: test validations
    }


    /**
     * Available Donuts
     *
     * All generated donuts returned.
     */
    @Test
    public void myDonutsTest() {
         List<Donut> response = api.myDonuts();

        // TODO: test validations
    }

}
