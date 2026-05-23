package com.touristreview.backend.repository;

import com.touristreview.backend.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {

    Optional<Role> findByName(Role.RoleName name);

}