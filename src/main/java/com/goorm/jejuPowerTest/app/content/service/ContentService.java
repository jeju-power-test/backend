package com.goorm.jejuPowerTest.app.content.service;

import com.goorm.jejuPowerTest.app.content.dto.CreatContentDTO;
import com.goorm.jejuPowerTest.app.result.dto.RequestDTO;
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
    public void create(CreatContentDTO creatContentDTO){
        Content content = contentMapper.contentDtoToEntity(creatContentDTO);
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

    public int getCorrect(RequestDTO[] requestDTO, int start) {
        int cnt = 0;
        for(int i = start; i < start + 3; i++){
            Content content = contentRepository.findById(requestDTO[i].getId()).get();
            if(content.getAnswer().equals(requestDTO[i].getAnswer())){
                cnt++;
            }
        }
        return cnt;
    }
    public int getCorrectHidden(RequestDTO[] requestDTO, int index) {
        Content content = contentRepository.findById(requestDTO[index].getId()).get();
        int cnt = content.getAnswer().equals(requestDTO[index].getAnswer()) ? 1 : 0;
        return cnt;
    }
}
