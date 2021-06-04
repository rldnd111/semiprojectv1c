package qkrrldnd.spring.dao;

import qkrrldnd.spring.vo.Member;

public interface MemberDAO {
	
	int insertMember(Member m);
	int selectLogin(Member m);
	Member selectOneMember(String mno);

}
