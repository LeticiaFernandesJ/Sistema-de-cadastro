package br.com.lista.Eventoapp;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.lista.Eventoapp.Evento.Repository.EventoRepository;
import br.com.lista.Eventoapp.model.Eventos;
import br.com.lista.Eventoapp.model.Login;


@Controller
public class EventoController {
	
	@Autowired
	private EventoRepository er;
	
	
	
	@RequestMapping("/Sistemadecadastros")
	public String index(){
		return "index";}
	
	
	@RequestMapping(value="/cadastrarDados", method=RequestMethod.GET)
	public String form(){
		return "Eventos/FormEventos";
	}
	
	@RequestMapping(value="/cadastrarDados", method=RequestMethod.POST)
	public  String form(@Valid Eventos Eventos, BindingResult result, RedirectAttributes attributes){
		if(result.hasErrors()){
			attributes.addFlashAttribute("mensagem", "Verifique os campos!");
			return "redirect:/cadastrarDados";
		
		}
		er.save(Eventos);
		attributes.addFlashAttribute("mensagem", "Cadastrado realizado com sucesso!");
		return "redirect:/cadastrarDados";
		
	}
	@RequestMapping("/Listadevacinas")
	public ModelAndView Listadevacinas(){
		ModelAndView mv = new ModelAndView("Listadevacinas");
		Iterable<Eventos> Eventos = er.findAll();
		mv.addObject("Eventos", Eventos);
		return mv;
	}
	
	

	@RequestMapping(value="/{codigo}", method=RequestMethod.GET)
	public ModelAndView detalheEventos(@PathVariable("codigo") long codigo){
		Eventos Eventos = er.findByCodigo(codigo);
		ModelAndView mv = new ModelAndView("Eventos/detalheEventos");
		mv.addObject("Eventos", Eventos);
		
		return mv;
	}
	
	
	
	
	@RequestMapping("/deletarDados")
	public String deletarDados(long codigo){
		Eventos Eventos = er.findByCodigo(codigo);
		er.delete(Eventos);
		return "redirect:/Listadevacinas";
	}

	



                @RequestMapping("/login")
                 public String login(){
	               return "Index";}


            @RequestMapping(value="/login", method=RequestMethod.GET)
                 public String login( Login login){
	             return "Eventos/login";
}
	
}
