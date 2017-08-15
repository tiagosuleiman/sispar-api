package com.sispar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.base.Preconditions;
import com.sispar.model.entities.Parliamentary;
import com.sispar.services.ParliamentaryService;

@RestController
@Transactional
@RequestMapping(value = "/parliamentary")
public class ParliamentaryRestController {

    @Autowired
    ParliamentaryService parliamentaryService; 
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<List<Parliamentary>> findAll() {
        List<Parliamentary> parliamentaries = parliamentaryService.findAll();
        if(parliamentaries.isEmpty()){
            return new ResponseEntity<List<Parliamentary>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Parliamentary>>(parliamentaries, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/enabledList", method = RequestMethod.GET)
    public ResponseEntity<List<Parliamentary>> findAllEnabled() {
        List<Parliamentary> parliamentaries = parliamentaryService.findParliamentariesEnabled();
        if(parliamentaries.isEmpty()){
            return new ResponseEntity<List<Parliamentary>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Parliamentary>>(parliamentaries, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Parliamentary> findRequestById(@PathVariable( "id" ) Long id) {
    	Parliamentary parliamentary = parliamentaryService.findById(id);
        if(parliamentary==null){
            return new ResponseEntity<Parliamentary>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<Parliamentary>(parliamentary, HttpStatus.OK);
    }
    
    @RequestMapping( method = RequestMethod.POST )
    @ResponseStatus( HttpStatus.CREATED )
    @ResponseBody
    public void create( @RequestBody Parliamentary parliamentary ){
       Preconditions.checkNotNull( parliamentary );
       parliamentaryService.create( parliamentary );
    }
    
    @RequestMapping( value = "/{id}", method = RequestMethod.PUT )
    @ResponseStatus( HttpStatus.OK )
    public void update( @PathVariable( "id" ) Long id, @RequestBody Parliamentary parliamentary ){
       Preconditions.checkNotNull( parliamentary );
       Preconditions.checkNotNull( parliamentaryService.findById( parliamentary.getId() ) );
       parliamentaryService.update( parliamentary );
    }
    
    @RequestMapping( value = "/{id}", method = RequestMethod.DELETE )
    @ResponseStatus( HttpStatus.OK )
    public void delete( @PathVariable( "id" ) Long id, @RequestBody Parliamentary parliamentary ){
        Preconditions.checkNotNull( parliamentary );
        Preconditions.checkNotNull( parliamentaryService.findById( parliamentary.getId() ) );
    	parliamentaryService.delete(parliamentary);
    }
    
}
