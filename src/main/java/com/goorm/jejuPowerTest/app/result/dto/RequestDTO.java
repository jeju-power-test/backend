package com.goorm.jejuPowerTest.app.result.dto;

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
