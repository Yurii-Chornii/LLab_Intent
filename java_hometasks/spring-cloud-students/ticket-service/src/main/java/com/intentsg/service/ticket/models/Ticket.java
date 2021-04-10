package com.intentsg.service.ticket.models;

import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Ticket {
    int ticketId;
    int hallNumber;
    int placeNumber;
    Date date;
    int userId;
}
