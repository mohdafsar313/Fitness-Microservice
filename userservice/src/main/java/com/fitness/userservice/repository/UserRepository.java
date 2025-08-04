package com.fitness.userservice.repository;

import com.fitness.userservice.model.User;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String> {

    boolean existsByEmail(@NotBlank(message = "email is required") @Email(message = "invalid email format") String email);
}
