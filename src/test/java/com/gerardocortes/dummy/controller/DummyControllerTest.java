package com.gerardocortes.dummy.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

@SpringBootTest
@AutoConfigureMockMvc
class DummyControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void ping() throws Exception {
        // given
        MockHttpServletRequestBuilder requestBuilder = get("/v1/dummy/ping");

        //when
        ResultActions resultActions = mockMvc.perform(requestBuilder);

        // then
        resultActions
                .andExpect(status().isOk())
                .andExpect(result -> assertEquals("pong", result.getResponse().getContentAsString()));
    }
}