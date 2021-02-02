package com.example.application.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.application.bean.NewApplication;
@Repository
public interface INewApplicationDAO extends CrudRepository<NewApplication, Integer> {

}
