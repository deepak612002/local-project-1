package com.example.demo.local.databaseConnectivity.Controller;

import com.example.demo.local.databaseConnectivity.Entity.UserDetailsEntity;
import com.example.demo.local.databaseConnectivity.Service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(value = "/db")
public class UserDetailsController {
    @Autowired
    UserDetailsService userDetailsService;

    @RequestMapping(method = RequestMethod.GET, value = "/fechAllDetails")
    public void fetchAllEntries() {
        userDetailsService.fetchAllEntries();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/findById")
    public void findById(@RequestParam int id)
    {
        userDetailsService.findById(id);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/insertData")
    public void addEntries(@RequestBody UserDetailsEntity userDetails)
    {
        userDetailsService.addEntries(userDetails);
    }
    @RequestMapping(method = RequestMethod.GET,value = "/deleteEntryBasedOnID")
    public void deleteEntry(@RequestParam int id)
    {
        userDetailsService.deleteEntries(id);
    }
}
