package org.homework.app.controller;

import lombok.extern.slf4j.Slf4j;
import org.homework.app.domain.dto.AppResponceDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@Slf4j
@RestController
public class AppController {

    @GetMapping("/app")
    public AppResponceDto health() {
        AppResponceDto responce = new AppResponceDto("Ok", LocalDateTime.now());
        LOG.info("GET /app {}", responce);
        return responce;
    }
}