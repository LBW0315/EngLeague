package com.example.EngLeague.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EngLeague.entity.Word;

public interface WordRepository extends JpaRepository<Word, Integer> {
	public Page<Word> findByUnitLike(String unit, Pageable pageable);
}
