package com.goorm.jejuPowerTest.app.avatar.dto;

import lombok.*;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ResponseAvatarDTO {
    String name;
    String image;
    int score;
}
