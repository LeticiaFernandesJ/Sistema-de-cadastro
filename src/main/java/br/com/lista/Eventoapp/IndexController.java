package br.com.lista.Eventoapp;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/Eventos")
	public String index(){
		return "index";
	}
}