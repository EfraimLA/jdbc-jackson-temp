package io.efraim.quarkus.services;

import io.efraim.quarkus.models.User;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
@Transactional
public class UserService {

    public List<User> findAll() {
        return User.listAll();
    }

    public void persist(final User user) {
        User.persist(user);
    }
}
