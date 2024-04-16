package com.sample.myapp.member;

public class MemberService implements IMemberService {

	@Override
	public Member getMemberInfo() {
		Member member = new Member();
		member.setMemberId("1234567");
		member.setName("홍길동");
		member.setAge(20);
		member.setEmail("hong@gm.sas");
		return member;
	}

	
}
