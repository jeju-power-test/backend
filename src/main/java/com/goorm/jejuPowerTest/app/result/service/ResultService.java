package com.goorm.jejuPowerTest.app.result.service;

import com.goorm.jejuPowerTest.app.avatar.dto.ResponseAvatarDTO;
import com.goorm.jejuPowerTest.app.avatar.entity.Avatar;
import com.goorm.jejuPowerTest.app.avatar.service.AvatarService;
import com.goorm.jejuPowerTest.app.content.dto.ResponseContentDTO;
import com.goorm.jejuPowerTest.app.content.service.ContentService;
import com.goorm.jejuPowerTest.app.place.dto.ResponsePlaceDTO;
import com.goorm.jejuPowerTest.app.place.service.PlaceService;
import com.goorm.jejuPowerTest.app.result.dto.RequestDTO;
import com.goorm.jejuPowerTest.app.result.dto.ResponseResultDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ResultService {

    private final ContentService contentService;
    private final AvatarService avatarService;

    private final PlaceService placeService;
    public ResponseResultDTO getAnswers(RequestDTO[] requestDTO) {
        List<ResponseContentDTO> contentDTOS = contentService.getAnswers(requestDTO);
        int history = contentService.getCorrect(requestDTO, 0);
        int region = contentService.getCorrect(requestDTO, 3);
        int dialect = contentService.getCorrect(requestDTO, 6);
        int hidden = contentService.getCorrectHidden(requestDTO, 9);
        int sum = history + region + dialect + hidden;
        // TODO : entity를 넘기는 거 수정
        Avatar avatar = avatarService.getAnswer(history, region, dialect);
        ResponseAvatarDTO avatarDTO = avatarService.getDto(avatar, sum);
        List<ResponsePlaceDTO> responsePlaceDTO = placeService.getAnswer(requestDTO, history, region, dialect);
        ResponseResultDTO responseResultDTO = new ResponseResultDTO(contentDTOS, avatarDTO, responsePlaceDTO);
        return responseResultDTO;
    }
}
