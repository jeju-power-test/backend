package com.goorm.jejuPowerTest.app.content.controller;

import com.goorm.jejuPowerTest.app.result.dto.RequestDTO;
import com.goorm.jejuPowerTest.app.content.dto.ResponseContentDTO;
import com.goorm.jejuPowerTest.app.content.service.ContentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/content")
public class ContentController {

    private final ContentService contentService;

    @PostMapping("/answer")
    public ResponseEntity<List<ResponseContentDTO>> getAnswer(@RequestBody RequestDTO[] requestDTO){
        return new ResponseEntity<>(contentService.getAnswers(requestDTO), HttpStatus.OK);
    }
}
