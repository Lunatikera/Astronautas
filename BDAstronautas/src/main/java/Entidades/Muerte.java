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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Arell
 */
@Entity
@Table(name = "tblMuerte")
public class Muerte implements Serializable {

    @Id
    @Column(name = "idMuerte")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
     @Column(name = "Fecha_Muerte",nullable = false)
    private LocalDate fechamuerte;
     //Mapeo
     @OneToOne(mappedBy = "muerte")
    private Astronauta astronauta;

    public Astronauta getAstronauta() {
        return astronauta;
    }

    public void setAstronauta(Astronauta astronauta) {
        this.astronauta = astronauta;
    }

    public Muerte(LocalDate fechamuerte, Astronauta astronauta) {
        this.fechamuerte = fechamuerte;
        this.astronauta = astronauta;
    }


    public Muerte(LocalDate fechamuerte) {
        this.fechamuerte = fechamuerte;
    }

    public Muerte() {
    }

    public LocalDate getFechamuerte() {
        return fechamuerte;
    }

    public void setFechamuerte(LocalDate fechamuerte) {
        this.fechamuerte = fechamuerte;
    }

     
     
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
//Constructores
    
    
}
