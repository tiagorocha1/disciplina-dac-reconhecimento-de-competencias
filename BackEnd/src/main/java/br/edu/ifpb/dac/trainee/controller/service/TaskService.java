package br.edu.ifpb.dac.trainee.controller.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import br.edu.ifpb.dac.trainee.exception.TaskFormException;
import br.edu.ifpb.dac.trainee.model.Category;
import br.edu.ifpb.dac.trainee.model.Task;
import br.edu.ifpb.dac.trainee.repository.CategoryRepository;
import br.edu.ifpb.dac.trainee.repository.TaskRepository;

public class TaskService {

	@Autowired
	private CategoryRepository categoryRepsitory;

	@Autowired
	private TaskRepository taskRepository;

	public Category getCategory(long categoryID) {

		Optional<Category> optional = categoryRepsitory.findById(categoryID);

		if (optional.isPresent()) {

			return optional.get();

		} else {

			throw new TaskFormException(now() + "TaskService: Category is null");
		}

	}

	public Task getTask(Long id) {

		Optional<Task> optional = taskRepository.findById(id);

		if (optional.isPresent()) {
			return optional.get();
		} else {
			throw new TaskFormException(now() + "TaskService: Task is null");
		}

	}

	private String now() {
		return "[ " + LocalDateTime.now().toLocalTime() + " ]";
	}

	public Task update(Task task) {
		return taskRepository.save(task);
		
	}

	public List<Task> listAll() {

		return taskRepository.findAll();
	}

	public List<Task> searchDescription(String search) {

		return taskRepository.findByDescriptionContains(search);
	}

	public Task save(Task task) {
		return taskRepository.save(task);		
	}

	public Optional<Task> getOptionalTask(Long id) {
	
		return taskRepository.findById(id);
	}

	public void delete(Long id) {
		taskRepository.deleteById(id);		
	}

}
