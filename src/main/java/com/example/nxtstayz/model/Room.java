/*
 *
 * You can use the following import statements
 * 
 * import javax.persistence.*;
 * 
 */

// Write your code here


package com.example.nxtstayz.model;

import javax.persistence.*;

@Entity
@Table(name = "room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int roomId;
    @Column(name = "roomnumber")
    private String roomName;
    @Column(name = "type")
    private String type;
    @Column(name = "price")
    private Double price;
    @ManyToOne
    @JoinColumn(name = "hotelid")
    private Hotel hotel;

    public Room() {
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomType() {
        return type;
    }

    public void setRoomType(String roomType) {
        this.type = roomType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}
