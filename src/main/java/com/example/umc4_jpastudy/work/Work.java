package com.example.umc4_jpastudy.work;

import com.example.umc4_jpastudy.author.Author;
import com.example.umc4_jpastudy.recent.Recent;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn
@Entity
public abstract class Work {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String day;
    private double GPA;
    @Enumerated(EnumType.STRING)
    private genre genre;
    @ManyToOne
    private Author author;
    @OneToMany(mappedBy = "work")
    private List<Recent> recentWorks = new ArrayList<>();
}
