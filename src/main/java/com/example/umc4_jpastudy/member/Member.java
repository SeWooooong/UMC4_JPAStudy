package com.example.umc4_jpastudy.member;

import com.example.umc4_jpastudy.utils.BaseTimeEntity;
import com.example.umc4_jpastudy.member.dto.MemberDtoReq;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Member extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nickName;

    private String profileImage;

    @Column(nullable = false)
    private String joinDate;

    public static Member createMember(MemberDtoReq memberDtoReq){
        Member member = new Member();
        member.nickName = memberDtoReq.getNickName();
        member.profileImage = memberDtoReq.getProfileImage();
        member.joinDate = memberDtoReq.getJoinDate();
        return member;
    }

}
