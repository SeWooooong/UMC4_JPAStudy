package com.example.umc4_jpastudy.author;

import com.example.umc4_jpastudy.utils.BaseTimeEntity;
import com.example.umc4_jpastudy.work.Work;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Getter
@NoArgsConstructor
@Entity
public class Author extends BaseTimeEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "author")
    private List<Work> works = new ArrayList<>();
}
