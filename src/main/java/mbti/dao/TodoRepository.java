package mbti.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mbti.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
	// 실제로 구현은 hiberate가 !!!

}
