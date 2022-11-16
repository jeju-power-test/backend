package com.goorm.jejuPowerTest.app.content.service;

import com.goorm.jejuPowerTest.app.content.dto.ContentDTO;
import com.goorm.jejuPowerTest.app.content.dto.RequestDTO;
import com.goorm.jejuPowerTest.app.content.dto.ResponseContentDTO;
import com.goorm.jejuPowerTest.app.content.entity.Content;
import com.goorm.jejuPowerTest.app.content.repository.ContentRepository;
import com.goorm.jejuPowerTest.global.mapper.ContentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ContentService {
    private final ContentRepository contentRepository;
    private final ContentMapper contentMapper;

    @Transactional
    public void create(ContentDTO contentDTO){
        Content content = contentMapper.contentDtoToEntity(contentDTO);
        contentRepository.save(content);
    }

    public List<ResponseContentDTO> getAnswers(RequestDTO[] requestDTO) {
        List<ResponseContentDTO> responseContentDTOS = new ArrayList<>();
        List<Content> contents = contentRepository.findAll();
        // TODO : stream으로 바꾸기
        for(int i = 0; i < contents.size(); i++){
            responseContentDTOS.add(contentMapper.entityToDto(contents.get(i), requestDTO));
        }
        return responseContentDTOS;
    }

}
