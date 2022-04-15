package br.edu.ifpb.dac.trainee.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import br.edu.ifpb.dac.trainee.controller.service.TaskService;
import br.edu.ifpb.dac.trainee.model.Category;
import br.edu.ifpb.dac.trainee.model.Task;

public class TaskFormAdd {

	@NotNull
	@NotEmpty
	private String description;
	private boolean done;
	private long categoryID;
	@Autowired
	private TaskService taskService;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public void setcategoryID(long categoryID) {
		this.categoryID = categoryID;
	}

	public Task converter() {

		Task task = null;

		Category category = taskService.getCategory(categoryID);
		
		task = new Task(description, done, category);
		
		return task;

	}

}
