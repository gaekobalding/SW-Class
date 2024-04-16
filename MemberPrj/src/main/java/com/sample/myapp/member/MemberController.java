package com.sample.myapp.member;

import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
	IMemberService memberService;

	public void setMemberService(IMemberService memberService) {
		this.memberService = memberService;
	}

	public void printInfo() {
		Member member = memberService.getMemberInfo();
		System.out.println(member);
	}
}
