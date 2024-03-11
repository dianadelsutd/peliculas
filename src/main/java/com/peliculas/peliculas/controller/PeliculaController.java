package com.peliculas.peliculas.controller;

import com.peliculas.peliculas.entidades.Pelicula;
import com.peliculas.peliculas.servicios.PeliculaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/peliculas")
public class PeliculaController {
    private PeliculaService peliculaService = new PeliculaService();

    @PostMapping("/registrar")
    public Pelicula guardar(@RequestBody Pelicula pelicula){
        return peliculaService.guardar(pelicula);
    }

    }
