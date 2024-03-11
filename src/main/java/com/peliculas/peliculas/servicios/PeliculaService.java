package com.peliculas.peliculas.servicios;

import com.peliculas.peliculas.daos.IDAO;
import com.peliculas.peliculas.entidades.Pelicula;
import com.peliculas.peliculas.implementaciones.PeliculaDAOH2;

public class PeliculaService {
    private IDAO<Pelicula> peliculaIDAO;

    public PeliculaService() {
        this.peliculaIDAO = new PeliculaDAOH2();
    }

    public IDAO<Pelicula> getPeliculaIDAO() {
        return peliculaIDAO;
    }

    public void setPeliculaIDAO(IDAO<Pelicula> peliculaIDAO) {
        this.peliculaIDAO = peliculaIDAO;
    }

    public Pelicula guardar(Pelicula pelicula){
        return peliculaIDAO.guardar(pelicula);
    }
}


