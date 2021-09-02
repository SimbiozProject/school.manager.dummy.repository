package com.example.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.example.common.BaseSpringTest;
import com.example.bean.MUserProfile;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.transaction.annotation.Transactional;

@Transactional
class MUserProfileRepositoryTest extends BaseSpringTest {

    @Autowired
    MUserProfileRepository userProfileRepository;
    @Autowired
    MockMvc mockMvc;

    @Test
    @Sql
    void findByUserName() {
        MUserProfile result = userProfileRepository.findByUserName("max").get();
        MUserProfile expected = MUserProfile.builder()
                .chatId(123456L)
                .userName("max")
                .idUserProfile(1L)
                .build();

        assertEquals(expected, result);
    }

    @Test
        //tobe moved in integration tests
    void saveUserProfile() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.post("/mUserProfiles")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"chatId\":\"123456\", \"userName\":\"@jrrby\"}");

        mockMvc.perform(request)
                .andDo(print())
                .andExpect(status().isCreated());

        assertEquals(makeExpectedUsers(), userProfileRepository.findAll());
    }

    //tobe moved in integration tests
    private List<MUserProfile> makeExpectedUsers() {
        return List.of(MUserProfile.builder()
                .chatId(123456L)
                .userName("@jrrby")
                .idUserProfile(1L)
                .build());
    }
}
