package mbti.service;

import java.time.LocalDateTime;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mbti.dao.TodoRepository;
import mbti.model.Todo;

@Service
public class TodoService {
	@Autowired // 필요한 의존 객체의 “타입"에 해당하는 빈을 찾아 주입한다.
	private TodoRepository todoRepository;
	
	public void addTodo(Todo todo) {
		todoRepository.save(todo);
	}
	
	public List<Todo> getTodos(){
		return todoRepository.findAll();
	}
	
	public Todo getTodo(Long id) {
		return todoRepository.getOne(id);
	}
	@Transactional
	public void updateTodo(Long id) {
		Todo todo =  todoRepository.getOne(id);
		if(todo.getEndDate() != null)
			todo.setEndDate(null);
		else
			todo.setEndDate(LocalDateTime.now());
//		todoRepository.save(todo);
	}
	@Transactional
	public void delTodo(Long id) {
		todoRepository.delete(todoRepository.getOne(id));
	}
	
	
}