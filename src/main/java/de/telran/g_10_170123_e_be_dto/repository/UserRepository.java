package de.telran.g_10_170123_e_be_dto.repository;

import de.telran.g_10_170123_e_be_dto.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}