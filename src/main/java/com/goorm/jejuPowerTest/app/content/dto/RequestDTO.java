package com.goorm.jejuPowerTest.app.content.dto;

import lombok.*;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RequestDTO {
    Long id;
    String answer;
}
