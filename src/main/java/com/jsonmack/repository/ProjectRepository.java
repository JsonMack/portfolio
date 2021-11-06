package com.jsonmack.repository;

import com.jsonmack.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Jason MacKeigan
 */
@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {
}
