package com.intentsg.service.ticket.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long ticketId;

    @NotEmpty
    int hallNumber;

    @NotEmpty
    int placeNumber;

    @NotEmpty
    Date date;

    @NotEmpty
    int userId;
}
