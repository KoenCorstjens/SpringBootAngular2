package eu.corstjens.spring.angular2.reposotory;

import eu.corstjens.spring.angular2.moddel.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by koencorstjens on 6/09/15.
 */
public interface UserRepository extends CrudRepository<User, Long> {

    User findByEmail(String userName);

    List<User> findAll();
}
