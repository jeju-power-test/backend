package com.goorm.jejuPowerTest.app.content.dto;

import lombok.*;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CreatContentDTO {
    String answer;
    String commentary;
    String imageA;
    String imageB;
}
