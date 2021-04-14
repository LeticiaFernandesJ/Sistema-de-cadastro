package br.com.lista.Eventoapp.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.springframework.security.core.GrantedAuthority;

@Entity
public class Role implements GrantedAuthority {

	
	private static final long serialVersionUID = 1L;

	public List<Login> getLogin() {
		return login;
	}

	public void setLogin(List<Login> login) {
		this.login = login;
	}

	public void setNomeRole(String nomeRole) {
		this.nomeRole = nomeRole;
	}

	@Id
	private String nomeRole;

	@ManyToMany(mappedBy = "roles")
    private List<Login> login;
	
	public String getNomeRole() {
		return nomeRole;
	


}

	@Override
	public String getAuthority() {
		
		return this.nomeRole;
	}
}