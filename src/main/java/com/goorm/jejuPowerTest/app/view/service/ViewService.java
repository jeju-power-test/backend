package com.goorm.jejuPowerTest.app.view.service;

import com.goorm.jejuPowerTest.app.view.dto.ResponseViewDTO;
import com.goorm.jejuPowerTest.app.view.entity.View;
import com.goorm.jejuPowerTest.app.view.repository.ViewRepository;
import com.goorm.jejuPowerTest.global.mapper.ViewMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ViewService {

    private final ViewRepository viewRepository;

    private final ViewMapper viewMapper;

    @Transactional
    public void create(View view){
        viewRepository.save(view);
    }

    public ResponseViewDTO getView(){
        View view = viewRepository.findById(1L).get();
        return viewMapper.entityToDto(view);
    }

    @Transactional
    public void increaseView(){
        View view = viewRepository.findById(1L).get();
        view.setCount(view.getCount() + 1L);
    }


}
