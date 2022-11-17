package com.goorm.jejuPowerTest.global.mapper;

import com.goorm.jejuPowerTest.app.view.dto.ResponseViewDTO;
import com.goorm.jejuPowerTest.app.view.entity.View;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ViewMapper {
    public ResponseViewDTO entityToDto(View view){
        return ResponseViewDTO.builder()
                .view(view.getCount())
                .build();
    }
}
