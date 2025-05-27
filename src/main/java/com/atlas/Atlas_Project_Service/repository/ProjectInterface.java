package com.atlas.Atlas_Project_Service.repository;

import com.atlas.Atlas_Project_Service.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectInterface extends JpaRepository<Project, Long> {



}
