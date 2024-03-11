/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 *
 * @author Arell
 */
@Entity
@Table(name = "tblVuelo")
public class Vuelo implements Serializable {

    @Id
    @Column(name = "idVuelo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Numero_Pasajeros", nullable = false, length = 50)
    private int  numpasajeros;
    
    @Column(name = "Fecha_Muerte",nullable = false)
    private LocalDate fechamuerte;
    //Mapeo
@ManyToOne
@JoinColumn(name = "idNave")
private Nave nave;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Vuelo(int numpasajeros, LocalDate fechamuerte) {
        this.numpasajeros = numpasajeros;
        this.fechamuerte = fechamuerte;
    }

    public Vuelo(int numpasajeros, LocalDate fechamuerte, Nave nave) {
        this.numpasajeros = numpasajeros;
        this.fechamuerte = fechamuerte;
        this.nave = nave;
    }

    
    public Vuelo() {
    }

    public int getNumpasajeros() {
        return numpasajeros;
    }

    public void setNumpasajeros(int numpasajeros) {
        this.numpasajeros = numpasajeros;
    }

    public LocalDate getFechamuerte() {
        return fechamuerte;
    }

    public void setFechamuerte(LocalDate fechamuerte) {
        this.fechamuerte = fechamuerte;
    }

    public Nave getNave() {
        return nave;
    }

    public void setNave(Nave nave) {
        this.nave = nave;
    }

  

  
    
}