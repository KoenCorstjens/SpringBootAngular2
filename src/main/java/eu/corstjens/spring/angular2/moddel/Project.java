package eu.corstjens.spring.angular2.moddel;


import javax.persistence.*;

/**
 * Created by koencorstjens on 29/04/15.
 */
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    @ManyToOne
    private User manager;

    protected Project() {
    }

    public Project(String name, User user) {
        this.name = name;
        this.manager = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getManager() {
        return manager;
    }

    public void setManager(User manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return String.format(
            "Customer[id=%d, firstName='%s', lastName='%s']",
            id, name, manager.getId());
    }
}
