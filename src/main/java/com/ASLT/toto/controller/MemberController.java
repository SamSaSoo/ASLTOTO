package com.ASLT.toto.controller;

import com.ASLT.toto.domain.Member;
import com.ASLT.toto.repository.MemberRepository;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/members")
@Transactional
public class MemberController {

    private final MemberRepository memberRepository;

    public MemberController(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @PostMapping("")
    public Member saveMember(@RequestBody Member member) {
        return memberRepository.save(member);
    }

    @GetMapping("/{id}")
    public Member findMember(@PathVariable Long id) {
        return memberRepository.findById(id);
    }






}
