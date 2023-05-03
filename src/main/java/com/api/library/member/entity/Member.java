package com.api.library.member.entity;

import com.api.library.member.dto.MemberCreate;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String phone;

    private Member(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public static Member createByMemberCreate(MemberCreate memberCreate) {
        return new Member(
                memberCreate.getName(),
                memberCreate.getPhone());
    }
}
