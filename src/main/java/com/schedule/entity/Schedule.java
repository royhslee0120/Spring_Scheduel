package com.schedule.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Table(name = "schedules")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Schedule extends BaseEntity{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title; // 일정 제목
    private String content; // 일정 내용
    private String authorName; // 작성자명
    private String password; // 비밀번호 (응답 제외)

    public Schedule(String title) {
        this.title = title;
    }
}
