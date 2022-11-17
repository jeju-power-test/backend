package com.goorm.jejuPowerTest.app.place.dto;

import lombok.*;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ResponsePlaceDTO {
    String title;
    String description;
    String url;
    String image;
}
