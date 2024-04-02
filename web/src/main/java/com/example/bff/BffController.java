package com.example.bff;

import com.example.bff.dto.ReservationDto;
import com.example.bff.dto.TicketDto;
import com.example.bff.dto.UserDto;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.logging.Logger;

@RestController
@CrossOrigin("*")
@RequestMapping("/")
public class BffController {

    private static final Logger log = Logger.getLogger(BffController.class.toString());

    private final BffBusinessUser businessUser;

    private final BffBusinessTicket businessTicket;

    private final BffBusinessReservation businessReservation;

    @Autowired
    public BffController(BffBusinessUser businessUser, BffBusinessTicket businessTicket, BffBusinessReservation businessReservation) {
        this.businessUser = businessUser;
        this.businessTicket = businessTicket;
        this.businessReservation = businessReservation;
    }

    @GetMapping("/users")
    public ResponseEntity<String> getUsers() {
        try {
            ResponseEntity<String> data = businessUser.getUsers();
            if (!data.getStatusCode().is2xxSuccessful()) {
                throw new ResponseStatusException(HttpStatus.valueOf(data.getStatusCodeValue()), "Error getting users");
            }

            return ResponseEntity
                    .ok()
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(data.getBody());
        } catch (Exception e) {
            log.severe("Error getting users: " + e.getMessage());
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Error handling request");
        }
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<String> getUserById(@PathVariable String id) {
        try {
            ResponseEntity<String> data = businessUser.getUserById(id);
            if (!data.getStatusCode().is2xxSuccessful()) {
                throw new ResponseStatusException(HttpStatus.valueOf(data.getStatusCodeValue()), "Error getting user");
            }

            return ResponseEntity
                    .ok()
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(data.getBody());
        } catch (Exception e) {
            log.severe("Error getting user: " + e.getMessage());
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Error handling request");
        }
    }

    @PostMapping("/users")
    public ResponseEntity<UserDto> postUser(@RequestBody UserDto user) {
        try {
            UserDto createdUser = businessUser.postUser(user).getBody();
            return ResponseEntity
                    .ok()
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(createdUser);
        } catch (Exception e) {
            log.severe("Error posting user1: " + e.getMessage());
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Error handling request");
        }
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable String id) {
        try {
            ResponseEntity<String> user = businessUser.deleteUser(id);
            return ResponseEntity
                    .ok()
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(user.getBody());
        } catch (Exception e){
            log.severe("Error deleting user1: " + e.getMessage());
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Error handling request");
        }
    }

    @GetMapping("/tickets")
    ResponseEntity<?> getAllTickets() {
        var data = businessTicket.getAllTickets();
        return ResponseEntity.ok(BffResponse.builder().data(data).build());
    }

    @GetMapping("/tickets/{id}")
    ResponseEntity<BffResponse<Object>> getTicketById(@PathVariable String id) {
        var data = businessTicket.getTicketById(id);
        return ResponseEntity.ok(BffResponse.builder().data(data).build());
    }

    @DeleteMapping("/tickets/{id}")
    ResponseEntity<?> removeTicket(@PathVariable String id) {
        businessTicket.removeTicket(id);
        return ResponseEntity.ok(BffResponse.builder().build());
    }

    @PostMapping("/tickets")
    ResponseEntity<?> createTicket(@Valid @RequestBody TicketDto ticket) {
        var data = businessTicket.createTicket(ticket);
        return ResponseEntity.ok(BffResponse.builder().data(data).build());
    }


    @GetMapping("/reservations")
    public ResponseEntity<String> getReservations() {
        try {
            ResponseEntity<String> data = businessReservation.getReservations();
            if (!data.getStatusCode().is2xxSuccessful()) {
                throw new ResponseStatusException(HttpStatus.valueOf(data.getStatusCodeValue()), "Error getting reservations");
            }

            return ResponseEntity
                    .ok()
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(data.getBody());
        } catch (Exception e) {
            log.severe("Error getting users: " + e.getMessage());
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Error handling request");
        }
    }

    @PostMapping("/reservations")
    public ResponseEntity<ReservationDto> postReservation(@RequestBody ReservationDto reservation) {
        try {
            ReservationDto createdReservation = businessReservation.postReservation(reservation).getBody();
            return ResponseEntity
                    .ok()
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(createdReservation);
        } catch (Exception e) {
            log.severe("Error posting reservation: " + e.getMessage());
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Error handling request");
        }
    }

    @DeleteMapping("/reservations/{id}")
    public ResponseEntity<?> deleteReservation(@PathVariable String id) {
        try {
            ResponseEntity<?> response = businessReservation.deleteReservation(id);

            if (!response.getStatusCode().is2xxSuccessful()) {
                log.severe("Error deleting reservation, received status: " + response.getStatusCode());
                return ResponseEntity
                        .status(response.getStatusCode())
                        .body(response.getBody());
            }

            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            log.severe("Error deleting reservation: " + e.getMessage());
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Error handling request");
        }
    }

 //MOBILE?
    @GetMapping("/mobile/reservations")
    public ResponseEntity<String> getReservationsMobile() {
        try {
            ResponseEntity<String> data = businessReservation.getReservations();
            if (!data.getStatusCode().is2xxSuccessful()) {
                throw new ResponseStatusException(HttpStatus.valueOf(data.getStatusCodeValue()), "Error getting reservations");
            }

            return ResponseEntity
                    .ok()
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(data.getBody());
        } catch (Exception e) {
            log.severe("Error getting users: " + e.getMessage());
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Error handling request");
        }
    }

    @GetMapping("/mobile/tickets")
    ResponseEntity<?> getAllTicketsMobile() {
        var data = businessTicket.getAllTickets();
        return ResponseEntity.ok(BffResponse.builder().data(data).build());
    }

    @GetMapping("/mobile/users")
    public ResponseEntity<String> getUsersMobile() {
        try {
            ResponseEntity<String> data = businessUser.getUsers();
            if (!data.getStatusCode().is2xxSuccessful()) {
                throw new ResponseStatusException(HttpStatus.valueOf(data.getStatusCodeValue()), "Error getting users");
            }

            return ResponseEntity
                    .ok()
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(data.getBody());
        } catch (Exception e) {
            log.severe("Error getting users: " + e.getMessage());
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Error handling request");
        }
    }

}
