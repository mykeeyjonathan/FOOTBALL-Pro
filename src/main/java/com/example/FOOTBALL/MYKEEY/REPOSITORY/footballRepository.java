package com.example.FOOTBALL.MYKEEY.REPOSITORY;

import com.example.FOOTBALL.MYKEEY.ENTITY.Football;
import org.springframework.data.jpa.repository.JpaRepository;

public interface footballRepository extends JpaRepository<Football, Long> {
}
