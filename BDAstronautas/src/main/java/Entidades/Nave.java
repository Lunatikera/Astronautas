/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Arell
 */
@Entity
@Table(name = "tblNave")
public class Nave implements Serializable {

    @Id
    @Column(name = "idNave")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "Nombre", nullable = false, length = 50)
    private String nombre;
    
    @Column(name = "Color", nullable = false, length = 50)
    private String color;
    
    @Column(name = "Pais", nullable = false, length = 50)
    private String pais;
    
    @Column(name = "Numero_Asientos", nullable = false, length = 50)
    private int  numasientos;
    
    @Column(name = "Tamaño", nullable = false, length = 50)
    private long  tamaño;
    //MApeo
    @OneToMany(mappedBy = "nave")
private List<Vuelo> vuelos;

    @OneToMany(mappedBy = "nave")
private List<Tabla_Astro_Nave> astronautaNaves;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Nave(String nombre, String color, String pais, int numasientos, long tamaño) {
        this.nombre = nombre;
        this.color = color;
        this.pais = pais;
        this.numasientos = numasientos;
        this.tamaño = tamaño;
    }

    public Nave(String nombre, String color, String pais, int numasientos, long tamaño, List<Vuelo> vuelos, List<Tabla_Astro_Nave> astronautaNaves) {
        this.nombre = nombre;
        this.color = color;
        this.pais = pais;
        this.numasientos = numasientos;
        this.tamaño = tamaño;
        this.vuelos = vuelos;
        this.astronautaNaves = astronautaNaves;
    }

    
    public Nave() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getNumasientos() {
        return numasientos;
    }

    public void setNumasientos(int numasientos) {
        this.numasientos = numasientos;
    }

    public long getTamaño() {
        return tamaño;
    }

    public void setTamaño(long tamaño) {
        this.tamaño = tamaño;
    }

    public List<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(List<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }

    public List<Tabla_Astro_Nave> getAstronautaNaves() {
        return astronautaNaves;
    }

    public void setAstronautaNaves(List<Tabla_Astro_Nave> astronautaNaves) {
        this.astronautaNaves = astronautaNaves;
    }

    
}