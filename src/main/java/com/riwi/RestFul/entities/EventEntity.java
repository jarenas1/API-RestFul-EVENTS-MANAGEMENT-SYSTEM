package com.riwi.RestFul.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "event")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class EventEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID) //UUID ID'S
    private String id;
    private String name;
    private Date date;
    private String ubication;
    private Integer capacity;
}
