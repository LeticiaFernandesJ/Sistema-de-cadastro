package br.com.lista.Eventoapp.Evento.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.lista.Eventoapp.model.Login;

@Repository
public interface LoginRepository  extends CrudRepository<Login , String>{

      Login findByLogin(String login);

}
