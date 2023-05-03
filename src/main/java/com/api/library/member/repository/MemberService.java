package com.api.library.member.repository;

import com.api.library.member.dto.MemberCreate;
import com.api.library.member.entity.Member;
import com.api.library.member.service.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private static MemberRepository memberRepository;

    @Transactional
    public void createMember(MemberCreate memberCreate) {
        memberRepository.save(
                Member.createByMemberCreate(memberCreate));
    }
}
