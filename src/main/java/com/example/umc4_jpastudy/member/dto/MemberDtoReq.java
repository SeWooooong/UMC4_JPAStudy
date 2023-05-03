package com.example.umc4_jpastudy.member.dto;

import lombok.Getter;

@Getter
public class MemberDtoReq {
    private String nickName;
    private String profileImage;
    private String joinDate;
    public MemberDtoReq(String nickName, String profileImage, String joinDate){
        this.nickName = nickName;
        this.profileImage = profileImage;
        this.joinDate = joinDate;
    }
}
