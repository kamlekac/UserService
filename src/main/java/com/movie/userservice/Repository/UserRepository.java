package com.movie.userservice.Repository;

import com.movie.userservice.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Integer> {
}
