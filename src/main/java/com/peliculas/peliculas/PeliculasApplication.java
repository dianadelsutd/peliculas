package com.peliculas.peliculas;

import com.peliculas.peliculas.daos.BD;
import com.peliculas.peliculas.entidades.Pelicula;
import com.peliculas.peliculas.servicios.PeliculaService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PeliculasApplication {

	public static void main(String[] args) {
		SpringApplication.run(PeliculasApplication.class, args);
		PeliculaService peliculaService = new PeliculaService();

		BD.createTable();

		Pelicula pelicula1 = new Pelicula(1,"Drama",3,"Titanic");
		peliculaService.guardar(pelicula1);

		Pelicula pelicula2 = new Pelicula(2,"Comedia",4,"PeliGraciosaa");
		peliculaService.guardar(pelicula2);

		Pelicula pelicula3 = new Pelicula(3,"Accion",0,"Avatar");
		peliculaService.guardar(pelicula3);


	}

}
