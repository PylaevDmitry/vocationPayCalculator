package com.neoflex.school.vocationPayCalculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SuppressWarnings("unused")
@SpringBootTest
@AutoConfigureMockMvc
class PayControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    void calculateIsOk() throws Exception {
        this.mvc.perform(get("/calculate?avg=10.0&n=15"))
                .andExpect(status().isOk())
                .andExpect(content().json("{'payValue':5.0}"));
    }

    @Test
    void calculateReject() throws Exception {
        this.mvc.perform(get("/calculate?avg=10.0&n=15.6"))
                .andExpect(status().isBadRequest());
    }
}