package br.com.lista.Eventoapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EventoController<Evento> {
	
	@RequestMapping("CadastrarEvento")
	public String form(){
		return "Eventos/FormEventos"; }

	@RequestMapping("/eventos")
	public ModelAndView listaEventos(){
		ModelAndView mv = new ModelAndView("listaEventos");
		Iterable<Eventos> eventos = er.findAll();
		mv.addObject("eventos", eventos);
		return mv;
	}
}
