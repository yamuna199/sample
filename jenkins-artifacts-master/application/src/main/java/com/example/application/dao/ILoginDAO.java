package com.example.application.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.application.bean.Login;


@Repository
public interface ILoginDAO extends JpaRepository<Login, Integer> {

}
