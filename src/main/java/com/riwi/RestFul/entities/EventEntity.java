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
    @Column(name = "name" ,nullable = false)
    private String name;
    @Column(name = "date" ,nullable = false)
    private Date date;
    @Column(name = "ubication" ,nullable = false)
    private String ubication;
    @Column(name = "capacity" ,nullable = false)
    private Integer capacity;
}
