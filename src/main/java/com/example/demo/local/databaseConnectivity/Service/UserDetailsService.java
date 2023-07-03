package com.example.demo.local.databaseConnectivity.Service;

import com.example.demo.local.databaseConnectivity.Entity.UserDetailsEntity;
import com.example.demo.local.databaseConnectivity.Repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetailsService {
    @Autowired
    UserDetailsRepository userDetailsRepository;
    public void fetchAllEntries()
    {
        List<UserDetailsEntity> userList= (List<UserDetailsEntity>) userDetailsRepository.findAll();
        System.out.println("All Entries "+userList);
    }
    public void findById(int id)
    {
        UserDetailsEntity userList=userDetailsRepository.findById(id);
        System.out.println("Particular entry based on given ID" +userList.getEmail());
    }
    public void addEntries(UserDetailsEntity userDetails)
    {
        userDetailsRepository.save(userDetails);
    }
    public void deleteEntries(int id)
    {
        userDetailsRepository.deleteById(id);
    }
}
