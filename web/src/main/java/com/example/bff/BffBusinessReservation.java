package com.example.bff;

import com.example.bff.dto.ReservationDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import java.util.logging.Logger;

@Service
public class BffBusinessReservation {
    @Value("http://localhost:8080") //TODO url
    private String reservationsServiceUrl;

    private static final Logger log = Logger.getLogger(BffBusinessReservation.class.toString());

    public void ReservationsService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    RestTemplate restTemplate = new RestTemplate();

    public ResponseEntity<String> getReservations() {
        return restTemplate.getForEntity(reservationsServiceUrl + "/reservations", String.class);
    }

    public ResponseEntity<ReservationDto> postReservation(ReservationDto reservation) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<ReservationDto> request = new HttpEntity<>(reservation, headers);

        return restTemplate.postForEntity(reservationsServiceUrl + "/reservations", request, ReservationDto.class);
    }

    public ResponseEntity<String> deleteReservation(String id) {
        try {
            restTemplate.delete(reservationsServiceUrl + "/reservations/" + id);
            return ResponseEntity.noContent().build();
        } catch (HttpClientErrorException.NotFound e) {
            System.err.println("Error deleting reservation, not found: " + e.getMessage());
            return ResponseEntity.notFound().build();
        } catch (RestClientException e) {
            System.err.println("Error deleting reservation: " + e.getMessage());
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Error handling request", e);
        }
    }
}
