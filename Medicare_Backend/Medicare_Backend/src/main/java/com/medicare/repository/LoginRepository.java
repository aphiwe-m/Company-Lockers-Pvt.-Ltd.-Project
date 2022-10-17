package com.medicare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicare.entity.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, String>{

}
