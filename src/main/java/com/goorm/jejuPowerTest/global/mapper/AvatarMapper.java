package com.goorm.jejuPowerTest.global.mapper;

import com.goorm.jejuPowerTest.app.avatar.dto.CreateAvatarDTO;
import com.goorm.jejuPowerTest.app.avatar.dto.ResponseAvatarDTO;
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
                .positive(createAvatarDTO.getPositive())
                .negative(createAvatarDTO.getNegative())
                .build();
    }
    public ResponseAvatarDTO entityToDto(Avatar avatar, int sum){
        return ResponseAvatarDTO.builder()
                .name(avatar.getName())
                .image(avatar.getImage())
                .score(sum*10)
                .build();
    }
}
