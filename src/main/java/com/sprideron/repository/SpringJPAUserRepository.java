package com.sprideron.repository;

import com.sprideron.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringJPAUserRepository extends JpaRepository<Users, Long> {
}
