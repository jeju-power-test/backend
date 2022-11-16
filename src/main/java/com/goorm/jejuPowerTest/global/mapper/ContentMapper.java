package com.goorm.jejuPowerTest.global.mapper;

import com.goorm.jejuPowerTest.app.content.dto.CreatContentDTO;
import com.goorm.jejuPowerTest.app.content.dto.RequestDTO;
import com.goorm.jejuPowerTest.app.content.dto.ResponseAnswerDTO;
import com.goorm.jejuPowerTest.app.content.entity.Content;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ContentMapper {
    public Content contentDtoToEntity(CreatContentDTO creatContentDTO){
        Content content = Content.builder()
                .answer(creatContentDTO.getAnswer())
                .commentary(creatContentDTO.getCommentary())
                .build();
        return content;
    }
    public ResponseAnswerDTO entityToDto(Content content, RequestDTO[] requestDTO){
        return ResponseAnswerDTO.builder()
                .id(content.getId())
                .answer(content.getAnswer())
                .commentary(content.getCommentary())
                .correct(requestDTO[(int) (content.getId() - 1)].getAnswer().equals(content.getAnswer()))
                .build();
    }
}
