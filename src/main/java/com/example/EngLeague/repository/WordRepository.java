package com.example.EngLeague.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EngLeague.entity.Word;

public interface WordRepository extends JpaRepository<Word, Integer> {

}
