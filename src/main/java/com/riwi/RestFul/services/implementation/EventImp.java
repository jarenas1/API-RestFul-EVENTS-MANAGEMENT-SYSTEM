package com.riwi.RestFul.services.implementation;

import com.riwi.RestFul.entities.EventEntity;
import com.riwi.RestFul.repositories.EventRepository;
import com.riwi.RestFul.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EventImp implements EventService {

    //INYECTAMOS REPO PARA ACCEDER A LOS METODOS
    @Autowired
    private EventRepository eventRepository;

    @Override
    public List<EventEntity> getAll() {
        return eventRepository.findAll();
    }

    @Override
    public EventEntity saveEvent(EventEntity eventEntity) {
        return eventRepository.save(eventEntity);
    }

    @Override
    public EventEntity getEventById(String id) {
        return eventRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteEvent(String id) {
        eventRepository.deleteById(id);
    }
}
