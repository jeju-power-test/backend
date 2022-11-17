package com.goorm.jejuPowerTest.app.result.controller;

import com.goorm.jejuPowerTest.app.avatar.dto.ResponseAvatarDTO;
import com.goorm.jejuPowerTest.app.avatar.service.AvatarService;
import com.goorm.jejuPowerTest.app.place.dto.ResponsePlaceDTO;
import com.goorm.jejuPowerTest.app.place.entity.Place;
import com.goorm.jejuPowerTest.app.place.service.PlaceService;
import com.goorm.jejuPowerTest.app.result.dto.RequestDTO;
import com.goorm.jejuPowerTest.app.content.dto.ResponseContentDTO;
import com.goorm.jejuPowerTest.app.content.service.ContentService;
import com.goorm.jejuPowerTest.app.result.dto.ResponseResultDTO;
import com.goorm.jejuPowerTest.app.result.service.ResultService;
import com.goorm.jejuPowerTest.app.view.service.ViewService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ResultController {
    private final ResultService resultService;

    private final ViewService viewService;

    @PostMapping("/result")
    public ResponseEntity<ResponseResultDTO> getAnswer(@RequestBody RequestDTO[] requestDTO){
//        List<ResponseContentDTO> contentDTOS = contentService.getAnswers(requestDTO);
//        ResponseAvatarDTO avatarDTO;
//        ResponsePlaceDTO placeDTO = placeService.getAnswer(requestDTO);
        ResponseResultDTO responseResultDTO = resultService.getAnswers(requestDTO);
        viewService.increaseView();
        return new ResponseEntity<>(resultService.getAnswers(requestDTO), HttpStatus.OK);
    }
}
