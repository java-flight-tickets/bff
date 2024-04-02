package com.example.bff.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class TicketDto {
    @JsonProperty("id")
    String id;

    @JsonProperty("provider")
    String provider;

    @JsonProperty("date")
    String date;

    @JsonProperty("cityDeparture")
    String cityDeparture;

    @JsonProperty("cityArrival")
    String cityArrival;
}
