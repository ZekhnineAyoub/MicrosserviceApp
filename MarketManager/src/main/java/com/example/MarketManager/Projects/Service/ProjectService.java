package com.example.MarketManager.Projects.Service;

import com.example.MarketManager.Projects.Model.Project;
import com.example.MarketManager.Projects.Repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProjectService {

    private final ProjectRepository projectRepository;

    @Autowired
    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public void AddProject(Project project) {

        projectRepository.save(project);

    }

    public List<Project> FindAllProjects() {

        return projectRepository.findAll();
    }
}
