package br.edu.ifpb.dac.trainee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.edu.ifpb.dac.trainee.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

	@Query("select t from Task t where t.description like %:description%")
	List<Task> findByDescriptionContains(String description);	

}
