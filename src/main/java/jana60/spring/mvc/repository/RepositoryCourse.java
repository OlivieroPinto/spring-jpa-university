package jana60.spring.mvc.repository;

import org.springframework.data.repository.CrudRepository;

import jana60.spring.mvc.model.ModelCourse;

public interface RepositoryCourse extends CrudRepository<ModelCourse, Integer> {

}
