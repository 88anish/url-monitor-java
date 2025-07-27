package com.urlmonitor.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Endpoint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String url;
    private int intervalSec;
    private String status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}