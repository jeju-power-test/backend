package com.goorm.jejuPowerTest.app.avatar.dto;

import lombok.*;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CreateAvatarDTO {
    String name;
    String image;
}

