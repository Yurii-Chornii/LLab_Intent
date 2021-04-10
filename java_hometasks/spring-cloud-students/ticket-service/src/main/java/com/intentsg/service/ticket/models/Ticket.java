package com.intentsg.service.ticket.models;

import java.util.Date;

public class Ticket {
    int ticketId;
    int hallNumber;
    int placeNumber;
    Date date;
    int userId;

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public int getHallNumber() {
        return hallNumber;
    }

    public void setHallNumber(int hallNumber) {
        this.hallNumber = hallNumber;
    }

    public int getPlaceNumber() {
        return placeNumber;
    }

    public void setPlaceNumber(int placeNumber) {
        this.placeNumber = placeNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ticket ticket = (Ticket) o;

        if (ticketId != ticket.ticketId) return false;
        if (hallNumber != ticket.hallNumber) return false;
        if (placeNumber != ticket.placeNumber) return false;
        if (userId != ticket.userId) return false;
        return date != null ? date.equals(ticket.date) : ticket.date == null;
    }

    @Override
    public int hashCode() {
        int result = ticketId;
        result = 31 * result + hallNumber;
        result = 31 * result + placeNumber;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + userId;
        return result;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId=" + ticketId +
                ", hallNumber=" + hallNumber +
                ", placeNumber=" + placeNumber +
                ", date=" + date +
                ", userId=" + userId +
                '}';
    }
}
