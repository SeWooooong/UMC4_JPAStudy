package com.example.umc4_jpastudy.member;

import com.example.umc4_jpastudy.member.dto.MemberDtoReq;
import com.example.umc4_jpastudy.member.dto.MemberDtoRes;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    /**
     * Member 저장
     */
    @PostMapping("/create")
    public String createMember(@RequestBody MemberDtoReq memberDtoReq){
        return memberService.createMember(memberDtoReq);
    }

    /**
     * Member 출력
     */
    @GetMapping("/member")
    public MemberDtoRes getMember(){
        return memberService.getMember();
    }
}
