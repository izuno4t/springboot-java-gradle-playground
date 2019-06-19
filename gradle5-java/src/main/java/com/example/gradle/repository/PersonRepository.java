package com.example.gradle.repository;

import com.example.gradle.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Person エンティティのリポジトリです。
 */
public interface PersonRepository extends JpaRepository<Person, Integer> {
}
