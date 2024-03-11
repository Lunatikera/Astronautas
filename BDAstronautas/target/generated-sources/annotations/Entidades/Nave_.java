package Entidades;

import Entidades.Tabla_Astro_Nave;
import Entidades.Vuelo;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-06T17:24:21", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Nave.class)
public class Nave_ { 

    public static volatile ListAttribute<Nave, Tabla_Astro_Nave> astronautaNaves;
    public static volatile SingularAttribute<Nave, Long> tamaño;
    public static volatile SingularAttribute<Nave, String> color;
    public static volatile ListAttribute<Nave, Vuelo> vuelos;
    public static volatile SingularAttribute<Nave, Integer> numasientos;
    public static volatile SingularAttribute<Nave, Long> id;
    public static volatile SingularAttribute<Nave, String> nombre;
    public static volatile SingularAttribute<Nave, String> pais;

}