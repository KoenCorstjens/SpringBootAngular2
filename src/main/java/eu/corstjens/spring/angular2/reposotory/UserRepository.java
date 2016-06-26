package eu.corstjens.spring.angular2.reposotory;

import org.springframework.data.repository.CrudRepository;
import eu.corstjens.spring.angular2.moddel.User;
import java.util.List;

/**
 * Created by koencorstjens on 6/09/15.
 */
public interface UserRepository extends CrudRepository<User, Long> {

    User findByEmail(String userName);

    List<User> findAll();
}
