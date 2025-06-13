package it.epicode.gestione_prenotazioni_aziendali.model;

import lombok.Data;

import java.time.LocalDateTime;


@Data
public class ApiError {
    private String message;
    private LocalDateTime dataErrore;
}
