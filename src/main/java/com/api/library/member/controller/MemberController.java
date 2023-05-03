package com.api.library.member.controller;

import com.api.library.member.dto.MemberCreate;
import com.api.library.member.repository.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/members")
public class MemberController {

    private static MemberService memberService;

    public ResponseEntity createMember(@RequestBody MemberCreate memberCreate) {
        memberService.createMember(memberCreate);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .build();
    }
}
