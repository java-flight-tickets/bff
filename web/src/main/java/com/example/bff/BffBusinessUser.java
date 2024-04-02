package com.example.bff;

import com.example.bff.dto.UserDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import java.util.logging.Logger;

@Service
public class BffBusinessUser {
    @Value("http://localhost:8081")
    private String usersServiceUrl;

    private static final Logger log = Logger.getLogger(BffBusinessUser.class.toString());

    public void UsersService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    RestTemplate restTemplate = new RestTemplate();

    public ResponseEntity<String> getUsers() {
        return restTemplate.getForEntity(usersServiceUrl + "/users", String.class);
    }

    public ResponseEntity<String> getUserById(String id) {
        return restTemplate.getForEntity(usersServiceUrl + "/users/" + id, String.class);
    }

    public ResponseEntity<UserDto> postUser(UserDto user) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<UserDto> request = new HttpEntity<>(user, headers);

        return restTemplate.postForEntity(usersServiceUrl + "/users", request, UserDto.class);
    }

    public ResponseEntity<String> deleteUser(String id) {
        ResponseEntity<String> user = getUserById(id);
        try {
            restTemplate.delete(usersServiceUrl + "/users/" + id, UserDto.class);
        } catch(Exception e){
            System.err.println("Error deleting user: " + e.getMessage());
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Error handling request");
        }
        return user;
    }
}

