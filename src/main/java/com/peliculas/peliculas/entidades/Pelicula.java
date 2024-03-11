package com.peliculas.peliculas.entidades;

public class Pelicula {
private Integer id;
private String categoria;
private Integer premios;
private String titulo;

    public Pelicula(Integer id, String categoria, Integer premios, String titulo) {
        this.id = id;
        this.categoria = categoria;
        this.premios = premios;
        this.titulo = titulo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getPremios() {
        return premios;
    }

    public void setPremios(Integer premios) {
        this.premios = premios;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
