package mbti.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mbti.dao.MemberRepasitory;
import mbti.model.Member;

@Service
public class MemberService {
	@Autowired
	private MemberRepasitory memberRepository;

	public Member getMember(String id) {
		return memberRepository.findById(id).orElseThrow();
	}

	// @Transactional(readOnly = true)
	public List<Member> getMembers() {
		return memberRepository.findAll();
	}

	public void addMember(Member member) {
		memberRepository.save(member);
	}

	public void updateMember(Member member) {
		Member findMember = memberRepository.getOne(member.getId());
		findMember.setName(member.getName());
		findMember.setPassword(member.getPassword());
		findMember.setEmail(member.getEmail());
		findMember.setJoinDate(member.getJoinDate());
		findMember.setMbti(member.getMbti());
	}

	// 로그인
	@Transactional
	public Member login(String id, String psw) {
		Member findMember = memberRepository.getOne(id);

		if (findMember != null) {
			if (findMember.getPassword().equals(psw)) {
				return findMember;
			}
		}
		return null;
		// return memberRepository.findById(member.getId())
		// .filter(m -> m.getPassword().equals(member.getPassword()))
		// .orElse(null);
//    }
	}

}