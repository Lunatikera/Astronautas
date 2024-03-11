/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.io.Serializable;
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
@Table(name = "tbl_Astro_Nave")
public class Tabla_Astro_Nave implements Serializable {

    @Id
    @Column(name = "idVuelo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    //Mapeo
    @ManyToOne
    @JoinColumn(name = "idAstronauta")
    private Astronauta astronauta;

    @ManyToOne
    @JoinColumn(name = "idNave")
    private Nave nave;

    public Astronauta getAstronauta() {
        return astronauta;
    }

    public void setAstronauta(Astronauta astronauta) {
        this.astronauta = astronauta;
    }

    public Nave getNave() {
        return nave;
    }

    public void setNave(Nave nave) {
        this.nave = nave;
    }

    public Tabla_Astro_Nave() {
    }

    public Tabla_Astro_Nave(Astronauta astronauta, Nave nave) {
        this.astronauta = astronauta;
        this.nave = nave;
    }
    
    
    
}
