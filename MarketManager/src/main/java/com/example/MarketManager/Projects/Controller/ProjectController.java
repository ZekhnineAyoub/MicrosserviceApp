package com.example.MarketManager.Projects.Controller;


import com.example.MarketManager.Projects.Model.Project;
import com.example.MarketManager.Projects.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "Project")
public class ProjectController {

    private final ProjectService projectService;
    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @PostMapping("/")
    public void AddNewProject(@RequestBody Project project){

        projectService.AddProject(project);
    }

    @GetMapping("/")
    public List<Project> GetAllProjects(){

        return projectService.FindAllProjects();
    }

    @GetMapping("/{id}")
    public Optional<Project> GetProjectById(@PathVariable Long id){

        return projectService.GetProjectID(id);
    }

    @DeleteMapping("/{id}")

    public void DeleteProjectById(@PathVariable Long id){

        projectService.DeleteProject(id);

    }


}
