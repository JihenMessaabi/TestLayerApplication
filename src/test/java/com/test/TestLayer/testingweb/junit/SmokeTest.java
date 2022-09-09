package com.test.TestLayer.testingweb.junit;

import com.test.TestLayer.controller.HomeController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class SmokeTest{

    @Autowired
    private HomeController controller; ///the controller is injected before the test methods are run

    /*
    * A nice feature of the Spring Test support is that the application context
    *  is cached between tests. That way, if you have multiple methods in a test
    *  case or multiple test cases with the same configuration,
    *  they incur the cost of starting the application only once.
    *  You can control the cache by using the @DirtiesContext annotation.*/

    @Test
    public void contextLoads() throws Exception {
        assertThat(controller).isNotNull();
    }
}
