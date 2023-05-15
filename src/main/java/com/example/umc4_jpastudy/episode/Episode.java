package com.example.umc4_jpastudy.episode;

import com.example.umc4_jpastudy.utils.BaseTimeEntity;
import com.example.umc4_jpastudy.work.Work;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Episode extends BaseTimeEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Double GPA;

    @ManyToOne
    private Work work;
}
