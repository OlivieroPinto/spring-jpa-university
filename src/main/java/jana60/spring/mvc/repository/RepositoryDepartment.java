package jana60.spring.mvc.repository;

import org.springframework.data.repository.CrudRepository;

import jana60.spring.mvc.model.ModelDepartment;

public interface RepositoryDepartment extends CrudRepository<ModelDepartment, Integer> {

}
