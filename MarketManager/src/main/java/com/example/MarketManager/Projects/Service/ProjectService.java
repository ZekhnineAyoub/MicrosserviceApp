package com.example.MarketManager.Projects.Service;

import com.example.MarketManager.Projects.Model.Project;
import com.example.MarketManager.Projects.Repository.ProjectRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;


@Service
public class ProjectService {

    private final ProjectRepository projectRepository;

    private RestTemplate restTemplate;


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

    public Optional<Project> GetProjectID(Long id) {

         return  projectRepository.findById(id);
    }

    public void DeleteProject(Long id) {

        projectRepository.deleteById(id);
    }


}
