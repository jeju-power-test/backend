package com.goorm.jejuPowerTest.app.base.db;

import com.goorm.jejuPowerTest.app.avatar.dto.CreateAvatarDTO;
import com.goorm.jejuPowerTest.app.avatar.service.AvatarService;
import com.goorm.jejuPowerTest.app.content.dto.CreatContentDTO;
import com.goorm.jejuPowerTest.app.content.service.ContentService;
import com.goorm.jejuPowerTest.app.place.dto.CreatePlaceDTO;
import com.goorm.jejuPowerTest.app.place.service.PlaceService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IntiData {

    @Bean
    CommandLineRunner init(
            ContentService contentService, PlaceService placeService, AvatarService avatarService
    ) {
        return args -> {
            // 문제 정답
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

            // 장소
            CreatePlaceDTO history = new CreatePlaceDTO("historyTitle", "historyDescription", "historyUrl", "historyImage", "history");
            CreatePlaceDTO region = new CreatePlaceDTO("regionTitle", "regionDescription", "regionUrl", "regionImage", "region");
            CreatePlaceDTO dialect = new CreatePlaceDTO("dialectTitle", "dialectDescription", "dialectUrl", "dialectImage", "dialect");
            placeService.create(history);
            placeService.create(region);
            placeService.create(dialect);

            // 결과 별 유형
            CreateAvatarDTO createAvatarDTO1 = new CreateAvatarDTO("321", "321img", "history", "dialect");
            CreateAvatarDTO createAvatarDTO2 = new CreateAvatarDTO("312", "312img", "history", "region");
            CreateAvatarDTO createAvatarDTO3 = new CreateAvatarDTO("231", "231img", "region", "dialect");
            CreateAvatarDTO createAvatarDTO4 = new CreateAvatarDTO("213", "213img", "dialect", "region");
            CreateAvatarDTO createAvatarDTO5 = new CreateAvatarDTO("132", "132img", "region", "history");
            CreateAvatarDTO createAvatarDTO6 = new CreateAvatarDTO("123", "123img", "dialect", "history");
            CreateAvatarDTO createAvatarDTO7 = new CreateAvatarDTO("333", "333img", null, null);
            CreateAvatarDTO createAvatarDTO8 = new CreateAvatarDTO("222", "222img", null, null);
            CreateAvatarDTO createAvatarDTO9 = new CreateAvatarDTO("111", "111img", null, null);
            CreateAvatarDTO createAvatarDTO10 = new CreateAvatarDTO("000", "000img", null, null);
            avatarService.create(createAvatarDTO1);
            avatarService.create(createAvatarDTO2);
            avatarService.create(createAvatarDTO3);
            avatarService.create(createAvatarDTO4);
            avatarService.create(createAvatarDTO5);
            avatarService.create(createAvatarDTO6);
            avatarService.create(createAvatarDTO7);
            avatarService.create(createAvatarDTO8);
            avatarService.create(createAvatarDTO9);
            avatarService.create(createAvatarDTO10);
        };
    }
}
