package eu.corstjens.spring.angular2;

import eu.corstjens.spring.angular2.reposotory.ProjectRepository;
import eu.corstjens.spring.angular2.reposotory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import eu.corstjens.spring.angular2.moddel.*;

/**
 * Created by koencorstjens on 22/06/16.
 */

@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    private ProjectRepository projectRepository;
    @Autowired
    private UserRepository userRepository;



    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    public void run(String... strings) throws Exception {
        // save a couple of projects
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        User user1 = new User("Koen", "Corstjens", "kcorstjens@example.eu", bCryptPasswordEncoder.encode("password"), false);
        User user2 = new User("Kris", "Robbrecht", "krobbrecht@example.eu", bCryptPasswordEncoder.encode("password"), true);
        userRepository.save(user1);
        userRepository.save(user2);

        projectRepository.save(new Project("Ovam", user1));
        projectRepository.save(new Project("ING", user1));
        projectRepository.save(new Project("Fortis", user1));

        projectRepository.save(new Project("Architectuur", user2));
        projectRepository.save(new Project("Java", user2));
        projectRepository.save(new Project("Net", user2));

    }
}
