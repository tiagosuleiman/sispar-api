package com.sispar.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.base.Preconditions;
import com.sispar.model.entities.Request;
import com.sispar.services.RequestService;

@RestController
@Transactional
@RequestMapping(value = "/request")
public class RequestRestController {

    @Autowired
    RequestService requestService; 
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<List<Request>> findAllRequests() {
        List<Request> requests = requestService.findAllRequests();
        if(requests.isEmpty()){
            return new ResponseEntity<List<Request>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Request>>(requests, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Request> findRequestById(@PathVariable( "id" ) Long id) {
        Request request = requestService.findById(id);
        if(request==null){
            return new ResponseEntity<Request>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<Request>(request, HttpStatus.OK);
    }
    
    @RequestMapping( method = RequestMethod.POST )
    @ResponseStatus( HttpStatus.CREATED )
    @ResponseBody
    public void create( @RequestBody Request request ){
       Preconditions.checkNotNull( request );
       requestService.create( request );
    }
    
    @RequestMapping( value = "/{id}", method = RequestMethod.PUT )
    @ResponseStatus( HttpStatus.OK )
    public void update( @PathVariable( "id" ) Long id, @RequestBody Request request ){
       Preconditions.checkNotNull( request );
       Preconditions.checkNotNull( requestService.findById( request.getId() ) );
       requestService.update( request );
    }
    
    @RequestMapping( value = "/{id}", method = RequestMethod.DELETE )
    @ResponseStatus( HttpStatus.OK )
    public void delete( @PathVariable( "id" ) Long id, @RequestBody Request request ){
        Preconditions.checkNotNull( request );
        Preconditions.checkNotNull( requestService.findById( request.getId() ) );
    	requestService.delete(request);
    }
    
    @RequestMapping(value="/csrf-token", method=RequestMethod.GET)
    public @ResponseBody String getCsrfToken(HttpServletRequest request) {
        CsrfToken token = (CsrfToken)request.getAttribute(CsrfToken.class.getName());
        return token.getToken();
    }
}
