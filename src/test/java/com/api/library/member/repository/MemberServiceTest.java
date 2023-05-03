package com.api.library.member.repository;

import com.api.library.member.dto.MemberCreate;
import com.api.library.member.entity.Member;
import com.api.library.member.service.MemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class MemberServiceTest {

    @Autowired MemberService memberService;
    @Autowired MemberRepository memberRepository;

    @Test
    @DisplayName("MemberCreate 를 이용해 맴버가 정상적으로 생성이 됩니다.")
    public void createMemberSuccess() throws Exception {
        //given
        MemberCreate memberCreate = new MemberCreate("홍길동", "010-0000-0000");

        //when
        memberService.createMember(memberCreate);

        //then
        Member findMember = memberRepository.findById(1L)
                .orElse(Member.createByMemberCreate(new MemberCreate("", "")));

        Assertions.assertThat(findMember.getName())
                .isEqualTo(memberCreate.getName());
        Assertions.assertThat(findMember.getPhone())
                .isEqualTo(memberCreate.getPhone());
    }

}