package com.atlas.Atlas_Project_Service.controller;

import com.atlas.Atlas_Project_Service.dto.createProjectDTO;
import com.atlas.Atlas_Project_Service.model.Project;
import com.atlas.Atlas_Project_Service.model.ProjectStatus;
import com.atlas.Atlas_Project_Service.service.ProjectService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/atlas/project")
public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }


    @PostMapping
    public ResponseEntity<Project> createProject (@RequestBody Project project) {
        System.out.println("Recebendo no controller: " + project);
        Project savedProject = projectService.createProject(project);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedProject);
    }

    @GetMapping
    public List<Project> getAllProjects() {
        return projectService.getAll();
    }

    @DeleteMapping("/{id}")
    public void deleteProject(@PathVariable Long id) {
        projectService.deleteProject(id);
    }


    @PutMapping("/updateStatus/{id}")
    public ResponseEntity<Void> updateStatusProject(@PathVariable Long id, ProjectStatus status) {
        projectService.updateStatusProject(id, status);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public Project update (@PathVariable Long id, @RequestBody Project project) {
        return projectService.update(id, project);
    }

}
