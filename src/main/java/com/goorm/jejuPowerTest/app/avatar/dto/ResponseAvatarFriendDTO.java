package com.goorm.jejuPowerTest.app.avatar.dto;

import lombok.*;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ResponseAvatarFriendDTO {
    String name;
    String image;
}
