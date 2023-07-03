package com.example.demo.local.databaseConnectivity.Repository;

import com.example.demo.local.databaseConnectivity.Entity.UserDetailsEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserDetailsRepository extends CrudRepository<UserDetailsEntity,Integer> {
    public UserDetailsEntity findById(int id);

}
