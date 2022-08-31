package mbti.controller;

import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import mbti.model.Member;
import mbti.service.MemberService;


@Controller
@RequestMapping("/member")

public class MemberController {
	@Autowired
	private MemberService memberService;
	@RequestMapping("/list")
	public String list(Model model) {
		//model.addAttribute("msg","Member List �Դϴ�.");
		model.addAttribute("members",memberService.getMembers());
		return "member/list";
	}
	@PostMapping("/add")
	public String add(@ModelAttribute Member member, RedirectAttributes redirectAttr) {
		memberService.addMember(member);
		JOptionPane.showMessageDialog(null,"회원가입 완료!!!");
		return "redirect:/member/login";
	}
	
	
	@GetMapping("/add")
	public String addForm() {
		return "member/memberForm";
	}
	
	@GetMapping("/login")
	public String loginForm() {
		return "member/login";
	}
	
	@PostMapping("/login")
	public String login(String id, String psw, HttpSession session,RedirectAttributes redirectAttr) {
		Member member = memberService.login(id,psw);
		if(member != null) {
			//여기에서 선언한 세션을 사용하는데
			//sessionId라는 세션에 받아온 id를 저장
			session.setAttribute("loginUser", member);
			//sessionPsw라는 세션에 받아온 psw를 저장
//			session.setAttribute("sessionPsw", psw);
			//저장하고 main으로 이동
			return "redirect:/main";
		} 
		else {
			//얘는 errorMessage에 변수를 전달하기 위해 사용한다.
			redirectAttr.addFlashAttribute("errorMessage", "암호가 틀렸습니다.");
			return "redirect:/member/login";
		}
		/*
//		System.out.println("id:::::::::::::::::::::"+id);
		if(memberService.login(id,psw) == 1) {
			//로그인 상태를 유지하기 위한 코드!!!  
			//세션에 값을 저장한다던지... 등등!!! 
			return "redirect:/main";
		}else 
			return "redirect:/member/list";
		
//		return null;
 
		 */
	}
	
}

