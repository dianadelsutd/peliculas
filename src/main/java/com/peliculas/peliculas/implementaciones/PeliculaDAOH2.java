package com.peliculas.peliculas.implementaciones;

import com.peliculas.peliculas.daos.BD;
import com.peliculas.peliculas.daos.IDAO;
import com.peliculas.peliculas.entidades.Pelicula;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PeliculaDAOH2 implements IDAO<Pelicula> {
    @Override
    public Pelicula guardar(Pelicula pelicula) {
        Connection connection = null;

        try {
            connection = BD.getConnection();

            //insertar los valores
            PreparedStatement psInsert = connection.prepareStatement("INSERT INTO PELICULAS (ID, CATEGORIA, PREMIOS, TITULO) VALUES (?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            psInsert.setInt(1,pelicula.getId());
            psInsert.setString(2,pelicula.getCategoria());
            psInsert.setInt(3,pelicula.getPremios());
            psInsert.setString(4,pelicula.getTitulo());

            psInsert.execute();


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return pelicula;
    }
}
