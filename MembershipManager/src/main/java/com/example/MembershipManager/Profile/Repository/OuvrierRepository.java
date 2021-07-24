package com.example.MembershipManager.Profile.Repository;

import com.example.MembershipManager.Profile.Model.Ouvrier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OuvrierRepository extends JpaRepository<Ouvrier,Long> {
}
