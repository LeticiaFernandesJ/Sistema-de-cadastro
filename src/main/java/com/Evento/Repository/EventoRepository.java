package com.Evento.Repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.lista.Eventoapp.model.Eventos;

@Repository
public interface EventoRepository extends CrudRepository < Eventos, String> {
	
	
		
	
}
