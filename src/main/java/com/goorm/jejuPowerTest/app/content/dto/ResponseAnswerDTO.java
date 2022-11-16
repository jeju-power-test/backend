package com.goorm.jejuPowerTest.app.content.dto;

import lombok.*;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ResponseAnswerDTO {
    Long id;
    String answer;
    String commentary;
    boolean correct;
}
