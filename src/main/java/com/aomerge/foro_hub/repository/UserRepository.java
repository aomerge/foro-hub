package com.aomerge.foro_hub.repository;

import com.aomerge.foro_hub.model.USER;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<USER, Long>{
}
