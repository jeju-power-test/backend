package com.goorm.jejuPowerTest.app.base.db;

import com.goorm.jejuPowerTest.app.content.dto.ContentDTO;
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
            ContentDTO contentDTO1 = new ContentDTO("oneAnswer", "oneCommentary");
            ContentDTO contentDTO2 = new ContentDTO("twoAnswer", "twoCommentary");
            ContentDTO contentDTO3 = new ContentDTO("threeAnswer", "threeCommentary");
            ContentDTO contentDTO4 = new ContentDTO("fourAnswer", "fourCommentary");
            ContentDTO contentDTO5 = new ContentDTO("fiveAnswer", "fiveCommentary");
            ContentDTO contentDTO6 = new ContentDTO("sixAnswer", "sixCommentary");
            ContentDTO contentDTO7 = new ContentDTO("sevenAnswer", "sevenCommentary");
            ContentDTO contentDTO8 = new ContentDTO("eightAnswer", "eightCommentary");
            ContentDTO contentDTO9 = new ContentDTO("nineAnswer", "nineCommentary");
            ContentDTO contentDTO10 = new ContentDTO("tenAnswer", "tenCommentary");
            contentService.create(contentDTO1);
            contentService.create(contentDTO2);
            contentService.create(contentDTO3);
            contentService.create(contentDTO4);
            contentService.create(contentDTO5);
            contentService.create(contentDTO6);
            contentService.create(contentDTO7);
            contentService.create(contentDTO8);
            contentService.create(contentDTO9);
            contentService.create(contentDTO10);
        };
    }
}
