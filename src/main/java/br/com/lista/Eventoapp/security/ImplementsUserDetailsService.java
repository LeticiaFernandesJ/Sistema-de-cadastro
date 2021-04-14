package br.com.lista.Eventoapp.security;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import br.com.lista.Eventoapp.Evento.Repository.LoginRepository;
import br.com.lista.Eventoapp.model.Login;

@Repository
@Transactional
public class ImplementsUserDetailsService implements UserDetailsService{

	@Autowired
	private LoginRepository lr;
	
	@Override
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		Login Login = lr.findByLogin(login);
		
		if(Login == null){
			throw new UsernameNotFoundException("Usuario não encontrado!");
		}
		return new User(Login.getUsername(), Login.getPassword(), true, true, true, true, Login.getAuthorities());
	}
}
