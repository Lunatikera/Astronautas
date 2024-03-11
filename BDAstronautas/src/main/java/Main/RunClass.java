/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Main;

import Entidades.Astronauta;
import Entidades.Muerte;
import Entidades.Nave;
import Entidades.Tabla_Astro_Nave;
import Entidades.Vuelo;
import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Arell
 */
public class RunClass {

    public static void main(String[] args) {
      //  System.out.println("Hello World!");
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("ConexionJPA");
EntityManager entityManager = managerFactory.createEntityManager();
entityManager.getTransaction().begin();

try {
//   // Crear una instancia de Muerte
//    Muerte muerte = new Muerte(LocalDate.of(2023, 6, 15));
//    entityManager.persist(muerte);
//
//    // Crear una instancia de Nave
//    Nave nave1 = new Nave("Falcon", "Blanco", "EEUU", 4, 25L);
//    entityManager.persist(nave1);
//
//    Nave nave2 = new Nave("Enterprise", "Gris", "EEUU", 5, 30L);
//    entityManager.persist(nave2);
//
//    // Crear instancias de Astronauta
//    Astronauta astronauta1 = new Astronauta("Armstrong", "Collins", "Neil", "O+", 41, 'M');
//    astronauta1.setMuerte(muerte); // Establecer la relación con Muerte
//    entityManager.persist(astronauta1);
//
//    Astronauta astronauta2 = new Astronauta("Aldrin", "Aldrin", "Buzz", "AB-", 40, 'M');
//    astronauta2.setMuerte(muerte); // Establecer la relación con Muerte
//    entityManager.persist(astronauta2);
//
//    // Crear instancias de Vuelo
//    Vuelo vuelo1 = new Vuelo(150, LocalDate.of(2023, 6, 15));
//    vuelo1.setNave(nave1); // Establecer la relación con Nave 1
//    entityManager.persist(vuelo1);
//
//    Vuelo vuelo2 = new Vuelo(200, LocalDate.of(2023, 6, 20));
//    vuelo2.setNave(nave1); // Establecer la relación con Nave 1
//    entityManager.persist(vuelo2);
//
//    Vuelo vuelo3 = new Vuelo(180, LocalDate.of(2023, 6, 25));
//    vuelo3.setNave(nave1); // Establecer la relación con Nave 1
//    entityManager.persist(vuelo3);
//
//    Vuelo vuelo4 = new Vuelo(170, LocalDate.of(2023, 7, 1));
//    vuelo4.setNave(nave2); // Establecer la relación con Nave 2
//    entityManager.persist(vuelo4);
//
//    Vuelo vuelo5 = new Vuelo(190, LocalDate.of(2023, 7, 5));
//    vuelo5.setNave(nave2); // Establecer la relación con Nave 2
//    entityManager.persist(vuelo5);
//
//    // Crear instancias de Astronauta_Nave
//    Tabla_Astro_Nave astronautaNave1 = new Tabla_Astro_Nave(astronauta1, nave1);
//    entityManager.persist(astronautaNave1);
//
//    Tabla_Astro_Nave astronautaNave2 = new Tabla_Astro_Nave(astronauta2, nave2);
//    entityManager.persist(astronautaNave2);

// Crear una instancia de Muerte
Muerte muerte = new Muerte(LocalDate.of(2023, 6, 15));
entityManager.persist(muerte);

// Crear una instancia de Nave
Nave nave1 = new Nave("Falcon", "Blanco", "EEUU", 4, 25L);
entityManager.persist(nave1);

Nave nave2 = new Nave("Enterprise", "Gris", "EEUU", 5, 30L);
entityManager.persist(nave2);

// Crear instancias de Astronauta
Astronauta astronauta1 = new Astronauta("Amelia", "Earhart", "Anne", "O+", 39, 'F');
entityManager.persist(astronauta1);

Astronauta astronauta2 = new Astronauta("Valentina", "Tereshkova", "Vladimirovna", "AB-", 45, 'F');
astronauta2.setMuerte(muerte); // Establecer la relación con Muerte
entityManager.persist(astronauta2);

// Crear instancias de Vuelo
Vuelo vuelo1 = new Vuelo(150, LocalDate.of(2023, 6, 15));
vuelo1.setNave(nave1); // Establecer la relación con Nave 1
entityManager.persist(vuelo1);

Vuelo vuelo2 = new Vuelo(200, LocalDate.of(2023, 6, 20));
vuelo2.setNave(nave1); // Establecer la relación con Nave 1
entityManager.persist(vuelo2);

Vuelo vuelo3 = new Vuelo(180, LocalDate.of(2023, 6, 25));
vuelo3.setNave(nave1); // Establecer la relación con Nave 1
entityManager.persist(vuelo3);

Vuelo vuelo4 = new Vuelo(170, LocalDate.of(2023, 7, 1));
vuelo4.setNave(nave2); // Establecer la relación con Nave 2
entityManager.persist(vuelo4);

Vuelo vuelo5 = new Vuelo(190, LocalDate.of(2023, 7, 5));
vuelo5.setNave(nave2); // Establecer la relación con Nave 2
entityManager.persist(vuelo5);

// Crear instancias de Astronauta_Nave
Tabla_Astro_Nave astronautaNave1 = new Tabla_Astro_Nave(astronauta1, nave1);
entityManager.persist(astronautaNave1);

Tabla_Astro_Nave astronautaNave2 = new Tabla_Astro_Nave(astronauta2, nave2);
entityManager.persist(astronautaNave2);

 

    entityManager.getTransaction().commit();
    System.out.println("Se insertó correctamente el registro y se establecieron las relaciones.");
} catch (Exception e) {
    entityManager.getTransaction().rollback();
    System.out.println("Error al insertar el registro: " + e.getMessage());
} finally {
    entityManager.close();
    managerFactory.close();
}

    }
}

