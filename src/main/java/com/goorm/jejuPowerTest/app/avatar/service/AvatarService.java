package com.goorm.jejuPowerTest.app.avatar.service;

import com.goorm.jejuPowerTest.app.avatar.dto.CreateAvatarDTO;
import com.goorm.jejuPowerTest.app.avatar.entity.Avatar;
import com.goorm.jejuPowerTest.app.avatar.repository.AvatarRepository;
import com.goorm.jejuPowerTest.global.mapper.AvatarMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class AvatarService {

    private final AvatarRepository avatarRepository;

    private final AvatarMapper avatarMapper;

    @Transactional
    public void create(CreateAvatarDTO createAvatarDTO){
        Avatar avatar = avatarMapper.dtoToEntity(createAvatarDTO);
        avatarRepository.save(avatar);
    }
}
