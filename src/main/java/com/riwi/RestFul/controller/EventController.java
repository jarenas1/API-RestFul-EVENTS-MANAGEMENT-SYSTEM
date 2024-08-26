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

    @PostMapping("/new")
    public EventEntity create(@RequestBody EventEntity eventEntity){
        return eventService.saveEvent(eventEntity);
    }
    @PutMapping("/update")
    public EventEntity update(@RequestBody EventEntity eventEntity){
        return eventService.saveEvent(eventEntity);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable String id){
        eventService.deleteEvent(id);
    }

    @GetMapping("/findId")
    public EventEntity findByID(@RequestParam String id){
        return eventService.getEventById(id);
    }
}
