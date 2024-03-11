/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 *
 * @author Arell
 */
@Entity
@Table(name = "tblAstronauta")
public class Astronauta implements Serializable {

    @Id
    @Column(name = "idAstronauta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "Apellido_Paterno", nullable = false, length = 50)
    private String ApellidoP;
    
     @Column(name = "Apellido_Materno", nullable = false, length = 50)
    private String ApellidoM;
    
    @Column(name = "Nombres", nullable = false, length = 50)
    private String nombres;
    
    @Column(name = "Tipo_Sangre", nullable = false, length = 50)
    private String TipoSangre;
    
    @Column(name = "Edad", nullable = false, length = 50)
    private int edad;
     
     @Column(name = "Sexo", nullable = false, length = 50)
    private char sexo;
     
    //Mapeo
 @OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "idMuerte")
private Muerte muerte;
 
 @OneToMany(mappedBy = "astronauta")
private List<Tabla_Astro_Nave> astronautaNaves;



    // gets y sets 
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApellidoP() {
        return ApellidoP;
    }

    public void setApellidoP(String ApellidoP) {
        this.ApellidoP = ApellidoP;
    }

    public String getApellidoM() {
        return ApellidoM;
    }

    public void setApellidoM(String ApellidoM) {
        this.ApellidoM = ApellidoM;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTipoSangre() {
        return TipoSangre;
    }

    public void setTipoSangre(String TipoSangre) {
        this.TipoSangre = TipoSangre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Muerte getMuerte() {
        return muerte;
    }

    public void setMuerte(Muerte muerte) {
        this.muerte = muerte;
    }

    public List<Tabla_Astro_Nave> getAstronautaNaves() {
        return astronautaNaves;
    }

    public void setAstronautaNaves(List<Tabla_Astro_Nave> astronautaNaves) {
        this.astronautaNaves = astronautaNaves;
    }
//Contructores

    public Astronauta() {
    }

    public Astronauta(String ApellidoP, String ApellidoM, String nombres, String TipoSangre, int edad, char sexo, Muerte muerte, List<Tabla_Astro_Nave> astronautaNaves) {
        this.ApellidoP = ApellidoP;
        this.ApellidoM = ApellidoM;
        this.nombres = nombres;
        this.TipoSangre = TipoSangre;
        this.edad = edad;
        this.sexo = sexo;
        this.muerte = muerte;
        this.astronautaNaves = astronautaNaves;
    }

    public Astronauta(String ApellidoP, String ApellidoM, String nombres, String TipoSangre, int edad, char sexo) {
        this.ApellidoP = ApellidoP;
        this.ApellidoM = ApellidoM;
        this.nombres = nombres;
        this.TipoSangre = TipoSangre;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    
    
    
    
}