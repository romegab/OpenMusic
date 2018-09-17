package com.music.demo.repository;

import com.music.demo.model.Question;
import com.music.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
