/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.whitelist.controllers;

import com.example.whitelist.models.TblFixedWhitelist;
import com.example.whitelist.models.TblIspWhitelist;
import com.example.whitelist.models.TblMobileWhitelist;
import com.example.whitelist.models.TblUsers;
import com.example.whitelist.repos.TblFixedWhitelistRepo;
import com.example.whitelist.repos.TblIspWhitelistRepo;
import com.example.whitelist.repos.TblMobileWhitelistRepo;
import com.example.whitelist.repos.TblUsersRepo;
import static com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat.URI;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 *
 * @author Muthuvel P <pmuthuvel@gmail.com>
 */

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class ApiController {
    
    private final Logger log = LoggerFactory.getLogger(ApiController.class);
    
    @Autowired 
    private TblMobileWhitelistRepo tblMobileWhitelistRepo;
    
    @Autowired 
    private TblFixedWhitelistRepo tblFixedWhitelistRepo;
    
    @Autowired 
    private TblIspWhitelistRepo tblIspWhitelistRepo;
    
    @Autowired
    private TblUsersRepo tblUsersRepo ;
    
    @PostMapping("/createMobile")
    public ResponseEntity<TblMobileWhitelist> createMobile(@RequestBody TblMobileWhitelist tblMobileWhitelistArg) throws URISyntaxException {
        tblMobileWhitelistArg.setCreatedBy("SYSTEM");
        tblMobileWhitelistArg.setCreatedOn(new Date());
        tblMobileWhitelistArg.setUpdatedBy("SYSTEM");
        tblMobileWhitelistArg.setUpdatedOn(new Date());
        TblMobileWhitelist tblMobileWhitelistNew = tblMobileWhitelistRepo.save(tblMobileWhitelistArg);
        return ResponseEntity.created(new URI("/api/createMobile/" + tblMobileWhitelistNew.getMobileId()))
                .body(tblMobileWhitelistNew);
    }
    
    @GetMapping("/getAllMobile")
    public List<TblMobileWhitelist> getAllTblMobileWhitelist(){
        return tblMobileWhitelistRepo.findAll();
    }
    
    @GetMapping("/getMobileById/{id}")
    public ResponseEntity<?> getMobileById(@PathVariable Long id) {
        Optional<TblMobileWhitelist> tblMobileWhitelistOptional = tblMobileWhitelistRepo.findById(id);
        return tblMobileWhitelistOptional.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    
    @PutMapping("/updateMobile")
    public ResponseEntity<TblMobileWhitelist> updateMobile(@RequestBody TblMobileWhitelist tblMobileWhitelistArg){
       TblMobileWhitelist tblMobileWhitelistNew = tblMobileWhitelistRepo.save(tblMobileWhitelistArg);
       return ResponseEntity.ok().body(tblMobileWhitelistNew);
    }
    
    @DeleteMapping("/deleteMobile")
    public ResponseEntity<?> deleteMobile(@PathVariable Long id){
        log.info("Request to delete group: {}", id);
        tblMobileWhitelistRepo.deleteById(id);
        return ResponseEntity.ok().build();
    }
    
    
    
    
    @PostMapping("/createFixed")
    public ResponseEntity<TblFixedWhitelist> createFixed(@RequestBody TblFixedWhitelist tblFixedWhitelistArg) throws URISyntaxException {
    	tblFixedWhitelistArg.setCreatedBy("SYSTEM");
    	tblFixedWhitelistArg.setCreatedOn(new Date());
    	tblFixedWhitelistArg.setUpdatedBy("SYSTEM");
    	tblFixedWhitelistArg.setUpdatedOn(new Date());
        TblFixedWhitelist tblFixedWhitelistNew = tblFixedWhitelistRepo.save(tblFixedWhitelistArg);
        return ResponseEntity.created(new URI("/api/createFixed/" + tblFixedWhitelistNew.getFixedId()))
                .body(tblFixedWhitelistNew);
    }
    
    @GetMapping("/getAllFixed")
    public List<TblFixedWhitelist> getAllFixed(){
        return tblFixedWhitelistRepo.findAll();
    }
    
    @GetMapping("/getFixedById/{id}")
    public ResponseEntity<?> getFixedById(@PathVariable Long id) {
        Optional<TblFixedWhitelist> tblFixedWhitelistOptional = tblFixedWhitelistRepo.findById(id);
        return tblFixedWhitelistOptional.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    
    @PutMapping("/updateFixed")
    public ResponseEntity<TblFixedWhitelist> updateFixed(@RequestBody TblFixedWhitelist tblFixedWhitelistArg){
    	TblFixedWhitelist tblFixedWhitelistNew = tblFixedWhitelistRepo.save(tblFixedWhitelistArg);
       return ResponseEntity.ok().body(tblFixedWhitelistNew);
    }
    
    @DeleteMapping("/deleteFixed")
    public ResponseEntity<?> deleteFixed(@PathVariable Long id){
        log.info("Request to delete Fixed: {}", id);
        tblFixedWhitelistRepo.deleteById(id);
        return ResponseEntity.ok().build();
    }
    
    
    @PostMapping("/createIsp")
    public ResponseEntity<TblIspWhitelist> createIsp(@RequestBody TblIspWhitelist tblIspWhitelistArg) throws URISyntaxException {
    	tblIspWhitelistArg.setCreatedBy("SYSTEM");
    	tblIspWhitelistArg.setCreatedOn(new Date());
    	tblIspWhitelistArg.setUpdatedBy("SYSTEM");
    	tblIspWhitelistArg.setUpdatedOn(new Date());
    	TblIspWhitelist tblIspWhitelistNew = tblIspWhitelistRepo.save(tblIspWhitelistArg);
        return ResponseEntity.created(new URI("/api/createFixed/" + tblIspWhitelistNew.getIspId()))
                .body(tblIspWhitelistNew);
    }
    

    @GetMapping("/getAllIsp")
    public List<TblIspWhitelist> getAllIsp(){
        return tblIspWhitelistRepo.findAll();
    }
    
    @GetMapping("/getIspById/{id}")
    public ResponseEntity<?> getIspById(@PathVariable Long id) {
        Optional<TblIspWhitelist> tblIspWhitelistOptioal = tblIspWhitelistRepo.findById(id);
        return tblIspWhitelistOptioal.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    
    @PutMapping("/updateIsp")
    public ResponseEntity<TblIspWhitelist> updateIsp(@RequestBody TblIspWhitelist tblIspWhitelistArg){
    	TblIspWhitelist TblIspWhitelistNew = tblIspWhitelistRepo.save(tblIspWhitelistArg);
       return ResponseEntity.ok().body(TblIspWhitelistNew);
    }
    
    @DeleteMapping("/deleteIsp")
    public ResponseEntity<?> deleteIsp(@PathVariable Long id){
        log.info("Request to delete group: {}", id);
        tblIspWhitelistRepo.deleteById(id);
        return ResponseEntity.ok().build();
    }
    
   
    
    @PostMapping("/createUser")
    public ResponseEntity<TblUsers> createUser(@RequestBody TblUsers tblUsersArg) throws URISyntaxException {
    	tblUsersArg.setCreatedBy("SYSTEM");
    	tblUsersArg.setCreatedOn(new Date());
    	tblUsersArg.setUpdatedBy("SYSTEM");
    	tblUsersArg.setUpdatedOn(new Date());
    	TblUsers tblUsersNew = tblUsersRepo.save(tblUsersArg);
        return ResponseEntity.created(new URI("/api/createUser/" + tblUsersNew.getUserId()))
                .body(tblUsersNew);
    }
    
    @GetMapping("/getAllUsers")
    public List<TblUsers> getAllUsers(){
        return tblUsersRepo.findAll();
    }
    
    @GetMapping("/getUserById/{id}")
    public ResponseEntity<?> getUserById(@PathVariable Long id) {
        Optional<TblUsers> tblIspWhitelistOptioal = tblUsersRepo.findById(id);
        return tblIspWhitelistOptioal.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    
    @PutMapping("/updateUser")
    public ResponseEntity<TblUsers> updateUser(@RequestBody TblUsers tblUsersArg){
    	TblUsers TblUsersNew = tblUsersRepo.save(tblUsersArg);
       return ResponseEntity.ok().body(TblUsersNew);
    }
    
    @DeleteMapping("/deleteUser")
    public ResponseEntity<?> deleteUser(@PathVariable Long id){
        log.info("Request to delete group: {}", id);
        tblUsersRepo.deleteById(id);
        return ResponseEntity.ok().build();
    }
    
}
