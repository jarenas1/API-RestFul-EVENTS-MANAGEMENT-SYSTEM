package com.riwi.RestFul.services;

import com.riwi.RestFul.entities.EventEntity;

import java.util.List;

public interface EventService {

    public List<EventEntity>getAll();

    public EventEntity saveEvent(EventEntity eventEntity);

    public EventEntity getEventById(String id);

    public void deleteEvent(String id);
}
