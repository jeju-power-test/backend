package com.goorm.jejuPowerTest.global.mapper;

import com.goorm.jejuPowerTest.app.place.dto.CreatePlaceDTO;
import com.goorm.jejuPowerTest.app.place.dto.ResponsePlaceDTO;
import com.goorm.jejuPowerTest.app.place.entity.Place;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PlaceMapper {
    public Place dtoToEntity(CreatePlaceDTO createPlaceDTO){
        return Place.builder()
                .title(createPlaceDTO.getTitle())
                .description(createPlaceDTO.getDescription())
                .url(createPlaceDTO.getUrl())
                .image(createPlaceDTO.getImage())
                .category(createPlaceDTO.getCategory())
                .build();
    }

    public ResponsePlaceDTO entityToDto(Place place){
        return ResponsePlaceDTO.builder()
                .title(place.getTitle())
                .description(place.getDescription())
                .url(place.getUrl())
                .image(place.getImage())
                .build();
    }
}
