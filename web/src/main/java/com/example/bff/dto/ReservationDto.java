package com.example.bff.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ReservationDto {
    @JsonProperty("id")
    String id;

    @JsonProperty("date")
    String date;

    @JsonProperty("userId")
    String userId;

    @JsonProperty("ticketId")
    String ticketId;
}
