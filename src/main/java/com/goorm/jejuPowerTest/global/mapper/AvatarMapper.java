package com.goorm.jejuPowerTest.global.mapper;

import com.goorm.jejuPowerTest.app.avatar.dto.CreateAvatarDTO;
import com.goorm.jejuPowerTest.app.avatar.entity.Avatar;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AvatarMapper {
    public Avatar dtoToEntity(CreateAvatarDTO createAvatarDTO){
        return Avatar.builder()
                .name(createAvatarDTO.getName())
                .image(createAvatarDTO.getImage())
                .build();
    }
}
