package com.ducthinh.BaiKT.repository;

import com.ducthinh.BaiKT.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepository extends JpaRepository<Role, Long> {
    Role findRoleById(Long id);
}
