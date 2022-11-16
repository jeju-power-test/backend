package com.goorm.jejuPowerTest.app.base.db;

import com.goorm.jejuPowerTest.app.content.dto.CreatContentDTO;
import com.goorm.jejuPowerTest.app.content.service.ContentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IntiData {

    @Bean
    CommandLineRunner init(
            ContentService contentService
    ) {
        return args -> {
            CreatContentDTO creatContentDTO1 = new CreatContentDTO("oneAnswer", "oneCommentary");
            CreatContentDTO creatContentDTO2 = new CreatContentDTO("twoAnswer", "twoCommentary");
            CreatContentDTO creatContentDTO3 = new CreatContentDTO("threeAnswer", "threeCommentary");
            CreatContentDTO creatContentDTO4 = new CreatContentDTO("fourAnswer", "fourCommentary");
            CreatContentDTO creatContentDTO5 = new CreatContentDTO("fiveAnswer", "fiveCommentary");
            CreatContentDTO creatContentDTO6 = new CreatContentDTO("sixAnswer", "sixCommentary");
            CreatContentDTO creatContentDTO7 = new CreatContentDTO("sevenAnswer", "sevenCommentary");
            CreatContentDTO creatContentDTO8 = new CreatContentDTO("eightAnswer", "eightCommentary");
            CreatContentDTO creatContentDTO9 = new CreatContentDTO("nineAnswer", "nineCommentary");
            CreatContentDTO creatContentDTO10 = new CreatContentDTO("tenAnswer", "tenCommentary");
            contentService.create(creatContentDTO1);
            contentService.create(creatContentDTO2);
            contentService.create(creatContentDTO3);
            contentService.create(creatContentDTO4);
            contentService.create(creatContentDTO5);
            contentService.create(creatContentDTO6);
            contentService.create(creatContentDTO7);
            contentService.create(creatContentDTO8);
            contentService.create(creatContentDTO9);
            contentService.create(creatContentDTO10);
        };
    }
}
