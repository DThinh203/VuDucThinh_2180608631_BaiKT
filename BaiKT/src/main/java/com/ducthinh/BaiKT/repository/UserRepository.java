package com.ducthinh.BaiKT.repository;
import com.ducthinh.BaiKT.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
