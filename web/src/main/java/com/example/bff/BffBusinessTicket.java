package com.example.bff;

import com.example.bff.dto.TicketDto;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.ticket.TicketOuterClass;
import org.ticket.TicketServiceGrpc;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Service
public class BffBusinessTicket {

    private static final Logger log = Logger.getLogger(BffBusinessTicket.class.toString());

    @GrpcClient("ticket")
    private TicketServiceGrpc.TicketServiceBlockingStub ticketClient;

    public BffBusinessTicket(TicketServiceGrpc.TicketServiceBlockingStub ticketClient) {
        this.ticketClient = ticketClient;
    }

    public List<TicketDto> getAllTickets() {
        var response = ticketClient.getAllTickets(TicketOuterClass.Empty.newBuilder().build());

        return response.getTicketsList().stream().map(item ->
                TicketDto.builder()
                        .id(item.getId())
                        .provider(item.getProvider())
                        .date(item.getDate())
                        .cityDeparture(item.getCityDeparture())
                        .cityArrival(item.getCityArrival())
                        .build())
                .collect(Collectors.toList());
    }

    public TicketDto getTicketById(String id) {
        var response = ticketClient.getTicketById(TicketOuterClass.TicketRequestId.newBuilder()
                .setId(id)
                .build());
        return TicketDto.builder()
                .id(response.getId())
                .provider(response.getProvider())
                .date(response.getDate())
                .cityDeparture(response.getCityDeparture())
                .cityArrival(response.getCityArrival())
                .build();
    }

    public TicketOuterClass.Empty removeTicket(String id){
        var response = ticketClient.removeTicket(TicketOuterClass.TicketRequestId.newBuilder()
                .setId(id)
                .build());
        return response;
    }

    public TicketOuterClass.Ticket createTicket(TicketDto ticket){
        TicketOuterClass.Ticket request = TicketOuterClass.Ticket.newBuilder()
                .setProvider(ticket.getProvider())
                .setDate(ticket.getDate())
                .setCityDeparture(ticket.getCityDeparture())
                .setCityArrival(ticket.getCityArrival())
                .build();

        var response = ticketClient.createTicket(request);
        return response;
    }

}
