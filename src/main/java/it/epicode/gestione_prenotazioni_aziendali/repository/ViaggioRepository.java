package it.epicode.gestione_prenotazioni_aziendali.repository;

import it.epicode.gestione_prenotazioni_aziendali.model.Viaggio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ViaggioRepository  extends JpaRepository<Viaggio, Integer>, PagingAndSortingRepository<Viaggio, Integer> {
}
