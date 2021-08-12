package com.example;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.example.bean.MCourse;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.hateoas.PagedModel;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@AutoConfigureMockMvc
@Transactional
class MyTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void addStudent() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.post("/mCourses")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"courseName\":\"Java Intensive\"}");

        TypeReference<PagedModel<MCourse>> type = new TypeReference<>() {};
//        new ObjectMapper().readValue("[{\"courseName\":\"Java Intensive\"}]", new TypeReference<PagedModel<MCourse>>() {});

        MvcResult result = mockMvc.perform(request)
                .andDo(print())
                .andExpect(status().isCreated())
                .andReturn();

        MockHttpServletResponse response = result.getResponse();
    }
}
