package com.example.umc4_jpastudy.work.type;

import com.example.umc4_jpastudy.work.Work;
import jakarta.persistence.Entity;

@Entity
public class Completion extends Work {
    private Integer chapterComplet; // 완결 까지 총 횟수
}
