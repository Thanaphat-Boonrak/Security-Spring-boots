package com.example.securitySpringboots.Repository;

import com.example.securitySpringboots.Entity.Notes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotesRepository extends JpaRepository<Notes, Long> {

    List<Notes> findByownerUsername(String OwnerUsername);
}
