package eu.corstjens.spring.angular2.reposotory;

import eu.corstjens.spring.angular2.moddel.Project;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by koencorstjens on 6/09/15.
 */
public interface ProjectRepository extends CrudRepository<Project, Long> {

    @Query("select p from Project p where p.manager.id = ?#{principal.id}")
    List<Project> findForCurrentUser();

    List<Project> findAll();
}
