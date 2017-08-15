package com.sispar.controller;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
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
import com.sispar.model.entities.User;
import com.sispar.services.UserService;
import com.sispar.util.Util;

@RestController
@Transactional
@RequestMapping(value = "/user")
public class UserRestController {

    @Autowired
    UserService userService; 
    
    @Autowired
    HttpServletRequest request;
        
	@RequestMapping(value = "/authUser", method = RequestMethod.POST)
    public ResponseEntity<User> authUser( @RequestBody User user ) 
    		throws NoSuchAlgorithmException, UnsupportedEncodingException{
        Preconditions.checkNotNull( user );
        if(user==null 
        	|| user.getUsername()==null 
        		|| user.getPassword()==null)
            return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
        
        user.setPassword(Util.cryptoStrHex(user.getPassword()));
        User baseUser = userService.authenticateUser(user);
        if(baseUser!=null 
        	&&user.getUsername().trim()
        		.equals(baseUser.getUsername().trim()) 
        			&& user.getPassword().trim()
        				.equals(baseUser.getPassword().trim())){        
        	user.setPassword(null);
        	StringBuffer tokenizer = new StringBuffer();
        	tokenizer.append(request.getRemoteHost()).append(";")
        	.append(user.getUsername()).append(";")
        	.append(Util.newDateToString());
        	user.setToken(Util.cryptoStrHex(tokenizer.toString()));
        	user.setProfile(baseUser.getProfile());
        }
        return new ResponseEntity<User>(user, HttpStatus.OK);
     }
    
	
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<List<User>> findAllUsers() {
        List<User> users = userService.findAllUsers();
        if(users.isEmpty()){
            return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }
    
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<User> findRequestById(@PathVariable( "id" ) Long id) {
        User user = userService.findById(id);
        if(user==null){
            return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }
    
    
    @RequestMapping( method = RequestMethod.POST )
    @ResponseStatus( HttpStatus.CREATED )
    @ResponseBody
    public void create( @RequestBody User user ) 
    		throws NoSuchAlgorithmException, UnsupportedEncodingException{
       user.setCreated(new Date());
       user.setUpdated(new Date());
       user.setPassword(Util.cryptoStrHex(user.getPassword()));
       Preconditions.checkNotNull( user );
       userService.create( user );
    }
    
    
    @RequestMapping( value = "/{id}", method = RequestMethod.PUT )
    @ResponseStatus( HttpStatus.OK )
    public void update( @PathVariable( "id" ) Long id, @RequestBody User user ) 
    		throws NoSuchAlgorithmException, UnsupportedEncodingException{
       Preconditions.checkNotNull( user );
       user.setUpdated(new Date());
       user.setPassword(Util.cryptoStrHex(user.getPassword()));
       Preconditions.checkNotNull( userService.findById( user.getId() ) );
       userService.update( user );
    }
    
    
    @RequestMapping( value = "/{id}", method = RequestMethod.DELETE )
    @ResponseStatus( HttpStatus.OK )
    public void delete( @PathVariable( "id" ) Long id, @RequestBody User user ){
        Preconditions.checkNotNull( user );
        Preconditions.checkNotNull( userService.findById( user.getId() ) );
    	userService.delete(user);
    }
    
    
    @RequestMapping(value="/csrf-token", method=RequestMethod.GET)
    public @ResponseBody String getCsrfToken(HttpServletRequest request) {
        CsrfToken token = (CsrfToken)request.getAttribute(CsrfToken.class.getName());
        return token.getToken();
    }
    
}
