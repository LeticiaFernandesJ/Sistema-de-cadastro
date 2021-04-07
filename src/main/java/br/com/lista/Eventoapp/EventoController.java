package br.com.lista.Eventoapp;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



import br.com.lista.Eventoapp.model.Eventos;


@Controller
public class EventoController {
	
	
	

	
	
	@RequestMapping(value="/cadastrarEvento", method=RequestMethod.GET)
	public String form(){
		return "Eventos/FormEventos";
		
	
	}
	
	@RequestMapping(value="/cadastrarEvento", method=RequestMethod.POST)
	public  String form( Eventos Eventos ){

		return "redirect:/cadastrarEvento"; 
        
			
	}
	}

	
	
