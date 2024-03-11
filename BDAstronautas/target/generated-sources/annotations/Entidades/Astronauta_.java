package Entidades;

import Entidades.Muerte;
import Entidades.Tabla_Astro_Nave;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-06T17:24:21", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Astronauta.class)
public class Astronauta_ { 

    public static volatile SingularAttribute<Astronauta, String> TipoSangre;
    public static volatile ListAttribute<Astronauta, Tabla_Astro_Nave> astronautaNaves;
    public static volatile SingularAttribute<Astronauta, String> ApellidoP;
    public static volatile SingularAttribute<Astronauta, Muerte> muerte;
    public static volatile SingularAttribute<Astronauta, String> ApellidoM;
    public static volatile SingularAttribute<Astronauta, Long> id;
    public static volatile SingularAttribute<Astronauta, Character> sexo;
    public static volatile SingularAttribute<Astronauta, Integer> edad;
    public static volatile SingularAttribute<Astronauta, String> nombres;

}