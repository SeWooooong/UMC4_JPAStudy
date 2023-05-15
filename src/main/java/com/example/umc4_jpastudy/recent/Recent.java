package com.example.umc4_jpastudy.recent;

import com.example.umc4_jpastudy.member.Member;
import com.example.umc4_jpastudy.utils.BaseTimeEntity;
import com.example.umc4_jpastudy.work.Work;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Recent extends BaseTimeEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Member member;

    @ManyToOne
    private Work work;
}
