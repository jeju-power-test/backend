package com.goorm.jejuPowerTest.app.content.dto;

import lombok.*;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ResponseContentDTO {
    Long id;
    String answer;
    String commentary;
    String correct;
}
