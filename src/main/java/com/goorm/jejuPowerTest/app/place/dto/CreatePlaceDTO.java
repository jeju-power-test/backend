package com.goorm.jejuPowerTest.app.place.dto;

import lombok.*;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CreatePlaceDTO {
    String title;
    String description;
    String url;
    String image;
    String category;
}
