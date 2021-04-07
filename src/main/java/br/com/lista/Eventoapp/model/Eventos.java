package br.com.lista.Eventoapp.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import org.springframework.stereotype.Service;




@Service
@Entity
public class Eventos implements Serializable {
	 
	private static final long serialVersionUID= 1L;
	
	
	
	 
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long codigo;
	
	
	
	private String name;
	private String Local;
	private String data;
	public long getCodigo() {
		
		
		 
		return codigo;
	
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	private String Horario;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocal() {
		return Local;
	}
	public void setLocal(String local) {
		Local = local;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHorario() {
		return Horario;
	}
	public void setHorario(String horario) {
		Horario = horario;
		
	}
	
 
}
