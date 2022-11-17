package com.goorm.jejuPowerTest.app.place.service;

import com.goorm.jejuPowerTest.app.place.dto.CreatePlaceDTO;
import com.goorm.jejuPowerTest.app.place.dto.ResponsePlaceDTO;
import com.goorm.jejuPowerTest.app.place.entity.Place;
import com.goorm.jejuPowerTest.app.place.respository.PlaceRepository;
import com.goorm.jejuPowerTest.app.result.dto.RequestDTO;
import com.goorm.jejuPowerTest.global.mapper.PlaceMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PlaceService {

    private final PlaceRepository placeRepository;

    private final PlaceMapper placeMapper;

    @Transactional
    public void create(CreatePlaceDTO createPlaceDTO){
        Place place = placeMapper.dtoToEntity(createPlaceDTO);
        placeRepository.save(place);
    }


}
