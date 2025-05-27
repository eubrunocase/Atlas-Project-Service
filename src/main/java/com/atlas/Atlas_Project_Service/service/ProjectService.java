package com.atlas.Atlas_Project_Service.service;

import com.atlas.Atlas_Project_Service.dto.createProjectDTO;
import com.atlas.Atlas_Project_Service.model.Project;
import com.atlas.Atlas_Project_Service.model.ProjectStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ProjectService {

    private final JpaRepository<Project, Long> projectRepository;

    public ProjectService(JpaRepository<Project, Long> projectRepository) {
        this.projectRepository = projectRepository;
    }

    public Project createProject(@RequestBody Project project) {
        project.setStatus(ProjectStatus.AGUARDANDO_ANALISE_PRELIMINAR);
        return projectRepository.save(project);
    }

    public void updateStatusProject(@PathVariable Long id, ProjectStatus status) {
        Project project = projectRepository.findById(id).get();
        project.setStatus(status);
        projectRepository.save(project);
    }

    public List<Project> getAll () {
        return projectRepository.findAll();
    }

    public void deleteProject(@PathVariable Long id) {
        projectRepository.deleteById(id);
    }


    public Project update (@PathVariable Long id, @RequestBody Project project) {
        return projectRepository.save(project);
    }

}
