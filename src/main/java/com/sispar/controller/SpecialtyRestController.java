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
import com.sispar.model.entities.Specialty;
import com.sispar.services.SpecialtyService;

@RestController
@Transactional
@RequestMapping(value = "/specialty")
public class SpecialtyRestController {

    @Autowired
    SpecialtyService specialtyService; 
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<List<Specialty>> findAll() {
        List<Specialty> specialties = specialtyService.findAll();
        if(specialties.isEmpty()){
            return new ResponseEntity<List<Specialty>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Specialty>>(specialties, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Specialty> findRequestById(@PathVariable( "id" ) Long id) {
    	Specialty Specialty = specialtyService.findById(id);
        if(Specialty==null){
            return new ResponseEntity<Specialty>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<Specialty>(Specialty, HttpStatus.OK);
    }
    
    @RequestMapping( method = RequestMethod.POST )
    @ResponseStatus( HttpStatus.CREATED )
    @ResponseBody
    public void create( @RequestBody Specialty Specialty ){
       Preconditions.checkNotNull( Specialty );
       specialtyService.create( Specialty );
    }
    
    @RequestMapping( value = "/{id}", method = RequestMethod.PUT )
    @ResponseStatus( HttpStatus.OK )
    public void update( @PathVariable( "id" ) Long id, @RequestBody Specialty Specialty ){
       Preconditions.checkNotNull( Specialty );
       Preconditions.checkNotNull( specialtyService.findById( Specialty.getId() ) );
       specialtyService.update( Specialty );
    }
    
    @RequestMapping( value = "/{id}", method = RequestMethod.DELETE )
    @ResponseStatus( HttpStatus.OK )
    public void delete( @PathVariable( "id" ) Long id, @RequestBody Specialty Specialty ){
        Preconditions.checkNotNull( Specialty );
        Preconditions.checkNotNull( specialtyService.findById( Specialty.getId() ) );
    	specialtyService.delete(Specialty);
    }
    
    @RequestMapping(value = "/examesList", method = RequestMethod.GET)
    public ResponseEntity<List<Specialty>> findAllSpecialtiesEnabledExames() {
        List<Specialty> specialties = specialtyService.findAllSpecialtiesEnabledExames();
        if(specialties.isEmpty()){
            return new ResponseEntity<List<Specialty>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Specialty>>(specialties, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/consultasList", method = RequestMethod.GET)
    public ResponseEntity<List<Specialty>> findAllSpecialtiesEnabledConsultas() {
        List<Specialty> specialties = specialtyService.findAllSpecialtiesEnabledConsultas();
        if(specialties.isEmpty()){
            return new ResponseEntity<List<Specialty>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Specialty>>(specialties, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/cirurgiasList", method = RequestMethod.GET)
    public ResponseEntity<List<Specialty>> findAllSpecialtiesEnabledCirurgias() {
        List<Specialty> specialties = specialtyService.findAllSpecialtiesEnabledCirurgias();
        if(specialties.isEmpty()){
            return new ResponseEntity<List<Specialty>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Specialty>>(specialties, HttpStatus.OK);
    }
    
}
