package com.goorm.jejuPowerTest.global.mapper;

import com.goorm.jejuPowerTest.app.content.dto.ContentDTO;
import com.goorm.jejuPowerTest.app.content.dto.RequestDTO;
import com.goorm.jejuPowerTest.app.content.dto.ResponseContentDTO;
import com.goorm.jejuPowerTest.app.content.entity.Content;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ContentMapper {
    public Content contentDtoToEntity(ContentDTO contentDTO){
        Content content = Content.builder()
                .answer(contentDTO.getAnswer())
                .commentary(contentDTO.getCommentary())
                .build();
        return content;
    }
    public ResponseContentDTO entityToDto(Content content, RequestDTO[] requestDTO){
        return ResponseContentDTO.builder()
                .id(content.getId())
                .answer(content.getAnswer())
                .commentary(content.getCommentary())
                .correct(requestDTO[(int) (content.getId() - 1)].isCorrect())
                .build();
    }
}
