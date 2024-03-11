package Entidades;

import Entidades.Astronauta;
import java.time.LocalDate;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-06T17:24:21", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Muerte.class)
public class Muerte_ { 

    public static volatile SingularAttribute<Muerte, LocalDate> fechamuerte;
    public static volatile SingularAttribute<Muerte, Astronauta> astronauta;
    public static volatile SingularAttribute<Muerte, Long> id;

}