package com.example.umc4_jpastudy.member;

import com.example.umc4_jpastudy.member.dto.MemberDtoReq;
import com.example.umc4_jpastudy.member.dto.MemberDtoRes;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    @Transactional
    public String createMember(MemberDtoReq memberDtoReq){
        Member member = Member.createMember(memberDtoReq);
        memberRepository.save(member);
        return "멤버를 성공적으로 저장을 했습니다!";
    }

    public MemberDtoRes getMember(){
        Member member = memberRepository.getReferenceById(1L);
        return new MemberDtoRes(member);
    }

}
