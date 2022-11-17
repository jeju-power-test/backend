package com.goorm.jejuPowerTest.app.result.dto;

import com.goorm.jejuPowerTest.app.avatar.dto.ResponseAvatarDTO;
import com.goorm.jejuPowerTest.app.avatar.dto.ResponseAvatarFriendDTO;
import com.goorm.jejuPowerTest.app.content.dto.ResponseContentDTO;
import com.goorm.jejuPowerTest.app.place.dto.ResponsePlaceDTO;
import lombok.*;

import java.util.List;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ResponseResultDTO {
    List<ResponseContentDTO> contents;
    List<ResponsePlaceDTO> places;
    ResponseAvatarDTO avatar;
    ResponseAvatarFriendDTO friend;
}
