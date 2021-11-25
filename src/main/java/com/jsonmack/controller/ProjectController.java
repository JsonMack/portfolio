package com.jsonmack.controller;

import com.jsonmack.entity.Project;
import com.jsonmack.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Jason MacKeigan
 */
@RestController()
@RequestMapping("api/")
public class ProjectController {

    private final ProjectRepository repository;

    @Autowired
    public ProjectController(ProjectRepository repository) {
        this.repository = repository;
    }

    @GetMapping("projects")
    public List<Project> getProjects() {
        return repository.findAll();
    }
}
