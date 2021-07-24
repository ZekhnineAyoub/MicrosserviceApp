package com.example.MarketManager.Projects.Repository;


import com.example.MarketManager.Projects.Model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Long> {

}
