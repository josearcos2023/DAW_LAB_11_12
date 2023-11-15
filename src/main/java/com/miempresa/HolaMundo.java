package com.miempresa;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController		
public class HolaMundo {
	@RequestMapping("/saludar")
	public String Saludar() {
		String saludo = "<h1>Hola mundo desde <b>Spring Boot</b></h1>";
		saludo += "<a href='/'>Regresar</a>";
			return saludo;
	}
	
	@RequestMapping("/misdatos")
	public String MisDatos() {
		String nombres = "SusNombres";
		int edad = 0;
		String curso = "SuCurso";
		String foto = "perrito.jpg";
		
		String datos = "<table border=1>";
		datos += "<tr><td colspan=2><img src=" + foto + "><br> <center><h1>¿Por qué JAVA?</h1><center></td></tr>";
		datos += "<tr><td><h3>Me llamo</h3></td><td>" + nombres + "</td></tr>";
		datos += "<tr><td><h3>Mi edad es</h3></td><td>" + edad + "</td></tr>";
		datos += "<tr><td><h3>Estoy en el curso de</h3></td><td>" + curso + "</td></tr>";
		datos += "<a href='/'>Regresar</a>";
		
		return datos;
	}
	/*
	@RequestMapping("/")
	public String Indice() {
		String enlaces = "<a href='/saludo'>Mostrar Saludo</a><br>";
		enlaces += "<a href='/misdatos'>Mostrar mis datos</a><br>";
		return enlaces;
	}
	*/
}

