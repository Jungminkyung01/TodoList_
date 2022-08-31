package mbti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mbti.model.Member;
import mbti.service.MemberService;

@RestController
@RequestMapping("/api/members")
public class MemberAPIController {
	@Autowired
	private MemberService memberService;
	
	@GetMapping("{/id}")
	public Member getMember(String id){
		return memberService.getMember(id);
	}
	
	@GetMapping
	public List<Member> getMember(){
		return memberService.getMembers();
	}
	@PostMapping
	public void addMember(@RequestBody Member member) {
		memberService.addMember(member);
	}
	@PutMapping
	public void updateMember(@RequestBody Member member) {
		memberService.updateMember(member);
	}
}
