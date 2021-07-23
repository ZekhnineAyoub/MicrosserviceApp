package com.example.MarketManager.Projects.Controller;


import com.example.MarketManager.Projects.Model.Project;
import com.example.MarketManager.Projects.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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


}
