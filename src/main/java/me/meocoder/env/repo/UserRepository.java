package me.meocoder.env.repo;

import me.meocoder.env.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
