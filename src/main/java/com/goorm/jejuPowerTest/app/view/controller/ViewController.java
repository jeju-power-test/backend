package com.goorm.jejuPowerTest.app.view.controller;

import com.goorm.jejuPowerTest.app.result.dto.ResponseResultDTO;
import com.goorm.jejuPowerTest.app.view.dto.ResponseViewDTO;
import com.goorm.jejuPowerTest.app.view.service.ViewService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class ViewController {

    private final ViewService viewService;

    @GetMapping("/view-count")
    public ResponseEntity<ResponseViewDTO> getView(){

        return new ResponseEntity<>(viewService.getView(), HttpStatus.OK);
    }
}