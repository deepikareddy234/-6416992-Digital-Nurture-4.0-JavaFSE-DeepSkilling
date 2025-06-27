package com.advexample.junitparamdemo;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class WeatherServiceTest {

    @Test
    public void testVerifyWeatherApiCalled() {
        // 1. Create a mock WeatherApi
        WeatherApi mockApi = mock(WeatherApi.class);

        // 2. Inject into service
        WeatherService service = new WeatherService(mockApi);

        // 3. Call the method
        service.fetchWeather();

        // 4. Verify it was called
        verify(mockApi).getWeather();  // ✅ Test passes if called
    }
}

