package it.epicode.gestione_prenotazioni_aziendali.dto;

import it.epicode.gestione_prenotazioni_aziendali.enumaration.StatoViaggio;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ViaggioDto {
    @NotEmpty(message = "la destinazione non può essere nulla o vuota")
    private String destinazione;
    @NotNull(message = "La data non può essere nulla")
    private LocalDate data;
    @NotNull(message = "Lo stato del viaggio non può essere nullo")
    private StatoViaggio statoViaggio;
}
