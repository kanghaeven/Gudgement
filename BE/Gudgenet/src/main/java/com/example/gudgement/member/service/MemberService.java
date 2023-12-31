package com.example.gudgement.member.service;

import com.example.gudgement.member.dto.Rate;
import com.example.gudgement.member.dto.request.LoginDto;
import com.example.gudgement.member.dto.request.MemberCreateDto;
import com.example.gudgement.member.dto.response.MemberResponseDto;
import com.example.gudgement.member.dto.response.MemberVerifyResponseDto;
import com.example.gudgement.member.entity.Member;
import org.springframework.scheduling.annotation.Scheduled;

public interface MemberService {
    // Test 계정 생성
    MemberResponseDto memberCreate(MemberCreateDto memberCreateDto);
    MemberVerifyResponseDto verifyMember(LoginDto loginDto);
    MemberResponseDto loadInfo(Long id);
    Rate memberRating(Member member);
    void updateRefreshToken(String email, String refreshToken);
    void updateEmail(Long id, String email);
    void updateNickname(Long id, String nickname);
    boolean validNickname(String nickname);

    @Scheduled(cron = "0 0 0 1 * ?")
    void updateGradeAuto();

    void updateGrade(Member member);
    void addTiggle(Long id);
    void initializeProgressAndInventory(Long id);
    void deleteMember(String email);

    void addProgress(Long id);
}
