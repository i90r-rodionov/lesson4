package org.homework.app.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class AppResponceDto {

    private final String status;
    private final LocalDateTime localDateTime;

    public AppResponceDto(String status, LocalDateTime localDateTime) {
        this.status = status;
        this.localDateTime = localDateTime;
    }

}
