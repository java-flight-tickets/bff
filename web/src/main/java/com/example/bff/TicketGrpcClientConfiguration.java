package com.example.bff;
import io.grpc.Channel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.ticket.TicketServiceGrpc;

@Configuration
public class TicketGrpcClientConfiguration {

    @Bean
    public TicketServiceGrpc.TicketServiceBlockingStub ticketServiceStub(Channel channel) {
        return TicketServiceGrpc.newBlockingStub(channel);
    }

    @Bean
    public BffBusinessTicket bffBusinessTicket(TicketServiceGrpc.TicketServiceBlockingStub ticketServiceStub) {
        return new BffBusinessTicket(ticketServiceStub);
    }
}