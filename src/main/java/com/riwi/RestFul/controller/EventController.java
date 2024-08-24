package com.riwi.RestFul.controller;

import com.riwi.RestFul.entities.EventEntity;
import com.riwi.RestFul.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {
    //INYECTAMOS LA DEPENDENCIA DE SERVICE
    @Autowired
    private EventService eventService;

    @GetMapping("/all")
    public List<EventEntity> readAll(){
        return eventService.getAll();
    }

    @GetMapping("/new")
    public EventEntity create(@RequestParam String name, @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date date, @RequestParam String ubication, @RequestParam Integer capacity){
        EventEntity eventEntity = new EventEntity();
        eventEntity.setName(name);
        eventEntity.setDate(date);
        eventEntity.setUbication(ubication);
        eventEntity.setCapacity(capacity);
        eventService.saveEvent(eventEntity);
        return eventEntity;
    }
    @GetMapping("/update")
    public EventEntity update(@RequestParam String id, @RequestParam String name, @RequestParam  @DateTimeFormat(pattern = "yyyy-MM-dd") Date date, @RequestParam String ubication, @RequestParam Integer capacity){
        EventEntity eventEntity = new EventEntity();
        eventEntity.setId(id);
        eventEntity.setName(name);
        eventEntity.setDate(date);
        eventEntity.setUbication(ubication);
        eventEntity.setCapacity(capacity);
        eventService.saveEvent(eventEntity);
        return eventEntity;
    }

    @GetMapping("delete/{id}")
    public void delete(@PathVariable String id){
        eventService.deleteEvent(id);
    }
}
