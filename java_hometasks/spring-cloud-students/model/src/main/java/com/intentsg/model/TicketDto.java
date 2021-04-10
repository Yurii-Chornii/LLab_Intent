package com.intentsg.model;

import java.util.Date;

import lombok.Builder;

@Builder
public class TicketDto {
    int ticketId;
    int hallNumber;
    int placeNumber;
    Date date;
    int userId;
}
