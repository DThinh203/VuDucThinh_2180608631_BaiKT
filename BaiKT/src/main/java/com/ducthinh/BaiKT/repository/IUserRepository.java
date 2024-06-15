package com.ducthinh.BaiKT.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ducthinh.BaiKT.model.User;
import java.util.Optional;

public interface IUserRepository extends JpaRepository<User, String> {
    Optional<User> findByUsername(String username);
}
