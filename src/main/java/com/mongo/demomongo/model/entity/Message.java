package com.mongo.demomongo.model.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "rcs_messages")
public class Message {
    private String messageID;
    private Integer numero;
    private String carrier;
    private String texto;
    private String accion;
    private String nombre;
    private Fecha fecha;
}
