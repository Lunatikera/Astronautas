package Entidades;

import Entidades.Nave;
import java.time.LocalDate;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-06T17:24:21", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Vuelo.class)
public class Vuelo_ { 

    public static volatile SingularAttribute<Vuelo, Nave> nave;
    public static volatile SingularAttribute<Vuelo, LocalDate> fechamuerte;
    public static volatile SingularAttribute<Vuelo, Long> id;
    public static volatile SingularAttribute<Vuelo, Integer> numpasajeros;

}