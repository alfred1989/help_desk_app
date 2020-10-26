package com.example.help_desk_app.repository;

import com.example.help_desk_app.model.Applications;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationsRepository extends CrudRepository<Applications, Long> {
}