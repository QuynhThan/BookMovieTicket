package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Room;
import com.example.demo.model.Seat;

public interface RoomService extends ModelService<Room> {
    List<Seat> getSeatList(Room room);
}
