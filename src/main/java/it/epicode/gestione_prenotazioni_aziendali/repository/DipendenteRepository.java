package it.epicode.gestione_prenotazioni_aziendali.repository;

import it.epicode.gestione_prenotazioni_aziendali.model.Dipendente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DipendenteRepository  extends JpaRepository<Dipendente, Integer>, PagingAndSortingRepository<Dipendente, Integer> {
}
