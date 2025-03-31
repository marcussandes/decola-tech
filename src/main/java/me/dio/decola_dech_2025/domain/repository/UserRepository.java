package me.dio.decola_dech_2025.domain.repository;

import me.dio.decola_dech_2025.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
