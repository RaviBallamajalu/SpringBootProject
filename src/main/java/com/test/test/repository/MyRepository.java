package com.test.test.repository;

import com.test.test.model.MyStudent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyRepository extends JpaRepository<MyStudent,Integer> {
}
