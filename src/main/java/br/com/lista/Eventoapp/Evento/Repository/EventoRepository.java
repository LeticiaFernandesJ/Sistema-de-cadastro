package br.com.lista.Eventoapp.Evento.Repository;



import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.lista.Eventoapp.model.Eventos;

@EnableJpaRepositories
@Repository
public interface EventoRepository extends CrudRepository < Eventos, String> {
	Eventos findByCodigo(long codigo);

	
		
	
}
