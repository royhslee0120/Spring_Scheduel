package com.schedule.dto;

import lombok.Getter;

@Getter
public class ScheduleCreateRequest {

    private String title;
    private String content;
    private String authorName;
    private String password;
}
