package mbti.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mbti.model.Member;

public interface MemberRepasitory extends JpaRepository<Member, String> {
	
}
