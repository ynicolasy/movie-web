package edu.ar.model;

import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter(AccessLevel.PROTECTED)
public class Pelicula {

  //atributos de clase
  private int id;
  private String nombre;
  private String descripcion;
  private String genero;
  private int calificacion;
  private int anio;
  private String director;

  //constructores
  public Pelicula(int id, String nombre, String descripcion, String genero, int calificacion, int anio, String director) {
    this.id = id;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.genero = genero;
    this.calificacion = calificacion;
    this.anio = anio;
    this.director = director;
  }

  public Pelicula(String nombre, String descripcion, String genero, int calificacion, int anio, String director) {
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.genero = genero;
    this.calificacion = calificacion;
    this.anio = anio;
    this.director = director;
  }

  
  //métodos personalizados
  @Override
  public String toString() {
    return "Pelicula [id=" + id + ", nombre=" + nombre + ", anio=" + anio + ", genero=" + genero + ", descripcion="
        + descripcion + ", calificacion=" + calificacion +  "]";
  }


}
