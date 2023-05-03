package com.example.umc4_jpastudy.member.dto;

import com.example.umc4_jpastudy.member.Member;
import lombok.Getter;

@Getter
public class MemberDtoRes {
    private Long id;
    private String nickName;
    private String profileImage;
    private String joinDate;

    public MemberDtoRes(Member member){
        this.id = member.getId();
        this.nickName = member.getNickName();
        this.profileImage = member.getProfileImage();
        this.joinDate = member.getJoinDate();
    }
}
