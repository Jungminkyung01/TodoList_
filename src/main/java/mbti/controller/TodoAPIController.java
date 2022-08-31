package mbti.controller;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import mbti.model.Member;
import mbti.model.Todo;
import mbti.service.TodoService;

@RestController
@RequestMapping("/api/todos")
@SessionAttributes("")
public class TodoAPIController {
	@Autowired
	private TodoService todoService;
	@GetMapping // 삭제
	public List<Todo> getTodos(){
		return todoService.getTodos();
	}
	@PostMapping // 추가
	public Todo addTodo(@RequestBody Todo todo,HttpSession session) {
		
		Member loginMember = (Member)session.getAttribute("loginUser");
		todo.setMember(loginMember);
		todoService.addTodo(todo);
		return todo;
	}
	@PutMapping // 업데이트
	public void updateTodo(@RequestBody Todo todo) {
		todoService.updateTodo(todo.getId());
	}
	@DeleteMapping // Javascript로 알맞는 메소드로 호출.
	public void deleteTodo(@RequestBody Todo todo) {
		todoService.delTodo(todo.getId());
	}
}
