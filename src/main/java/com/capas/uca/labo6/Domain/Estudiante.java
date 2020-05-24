package com.capas.uca.labo6.Domain;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Entity
@Table(schema="public",name="estudiante")
public class Estudiante {
    @Id
    @Column(name="c_usuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoEstudiante;

    @Column(name="nombre")
    @Size(max = 50,message = "El nombre no debe tener mas de 50 de caracteres")
    @NotEmpty(message="Este campo no puede quedar vacio")
    private String nombre;


    @Column(name="apellido")
    @Size( max = 50,message = "El apellido no debe tener mas de 50 de caracteres")
    @NotEmpty(message="Este campo no puede quedar vacio")
    private String apellido;

    @Column(name = "carne")
    @Size(max = 10 ,message = "El carne debe tener exactamente 10 caracteres" )
    @NotEmpty(message="Este campo no puede quedar vacio")
    private String carne;

    @Column(name = "carrera")
    @Size( max = 100,message = "La carrera no debe tener mas de 100 de caracteres")
    @NotEmpty(message="Este campo no puede quedar vacio")
    private String carrera;

    public Estudiante() {
    }

    public Integer getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(Integer codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}