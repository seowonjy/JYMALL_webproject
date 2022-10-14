package com.shop.mapper;

import com.shop.model.MemberVO;

public interface MemberMapper {
	public void memberJoin(MemberVO member);
	public int idCheck(String memberId);
	 public MemberVO memberLogin(MemberVO member);
}
