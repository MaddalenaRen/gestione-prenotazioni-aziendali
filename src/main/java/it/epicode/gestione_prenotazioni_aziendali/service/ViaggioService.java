package it.epicode.gestione_prenotazioni_aziendali.service;


import com.cloudinary.Cloudinary;
import it.epicode.gestione_prenotazioni_aziendali.dto.ViaggioDto;
import it.epicode.gestione_prenotazioni_aziendali.exception.NotFoundException;
import it.epicode.gestione_prenotazioni_aziendali.model.Prenotazione;
import it.epicode.gestione_prenotazioni_aziendali.model.Viaggio;
import it.epicode.gestione_prenotazioni_aziendali.repository.ViaggioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class ViaggioService {

    @Autowired
    private ViaggioRepository viaggioRepository;



    public Viaggio saveViaggio(ViaggioDto viaggioDto){
        Viaggio viaggio = new Viaggio();

        viaggio.setDestinazione(viaggioDto.getDestinazione());
        viaggio.setData(viaggioDto.getData());
        viaggio.setStatoViaggio(viaggioDto.getStatoViaggio());

        return viaggioRepository.save(viaggio);


    }


    public Page<Viaggio> getAllViaggi(int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return viaggioRepository.findAll(pageable);
    }


    public Viaggio getViaggio(int id )throws NotFoundException{
        return viaggioRepository.findById(id).
                orElseThrow(() -> new NotFoundException("Il viaggio con id: " + id + " non trovato"));
    }


    public Viaggio updateViaggio(int id, ViaggioDto viaggioDto)throws NotFoundException{
        Viaggio viaggioDaAggiornare = getViaggio(id);

        viaggioDaAggiornare.setDestinazione(viaggioDto.getDestinazione());
        viaggioDaAggiornare.setData(viaggioDto.getData());
        viaggioDaAggiornare.setStatoViaggio(viaggioDto.getStatoViaggio());

        return viaggioRepository.save(viaggioDaAggiornare);
    }


    public void deleteViaggio(int id)throws NotFoundException{
        Viaggio viaggioDaRimuovere = getViaggio(id);

        viaggioRepository.delete(viaggioDaRimuovere);
    }




}
