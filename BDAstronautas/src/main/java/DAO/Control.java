/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entidades.Astronauta;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 *
 * @author Arell
 */
public class Control {

    public Control() {
    }
    
    public void leerAstronauta(Long idAstronauta) {
    // Crear el EntityManagerFactory
    EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("ConexionJPA");
    
    // Crear el EntityManager
    EntityManager entityManager = managerFactory.createEntityManager();
    
    // Buscar el astronauta por su ID
    Astronauta astronauta = entityManager.find(Astronauta.class, idAstronauta);
    
    // Verificar si se encontró el astronauta
    if (astronauta != null) {
        // Imprimir información del astronauta
        System.out.println("Astronauta encontrado:");
        System.out.println("ID: " + astronauta.getId());
        System.out.println("Nombre: " + astronauta.getNombres() + " " + astronauta.getApellidoP() + " " + astronauta.getApellidoM());
        System.out.println("Tipo de Sangre: " + astronauta.getTipoSangre());
        System.out.println("Edad: " + astronauta.getEdad());
        System.out.println("Sexo: " + astronauta.getSexo());
        // Si tienes más atributos, puedes imprimirlos aquí
         if (astronauta.getMuerte() != null) {
                System.out.println("El astronauta está muerto.");
            } else {
                System.out.println("El astronauta está vivo.");
            }
    } else {
        System.out.println("No se encontró ningún astronauta con el ID proporcionado.");
    }
    
    // Cerrar el EntityManager y el EntityManagerFactory
    entityManager.close();
    managerFactory.close();
}
    public void ConsultaJPQLAstronautas(){
         // Crear el EntityManagerFactory
    EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("ConexionJPA");
    // Crear el EntityManager
    EntityManager entityManager = managerFactory.createEntityManager();
    // Iniciar la transacción
    entityManager.getTransaction().begin();
    // Crear la consulta JPQL para obtener los astronautas por sexo
    String jpqlQuery = "SELECT a FROM Astronauta a WHERE a.sexo = :sexo";
    TypedQuery<Astronauta> query = entityManager.createQuery(jpqlQuery, Astronauta.class);
    query.setParameter("sexo", 'F'); // Establecer el parámetro de sexo
     // Obtener la lista de resultados
     List<Astronauta> listadto = query.getResultList();
     for (Astronauta dto : listadto) {
            System.out.println("------------Astronauta---------");
            Control control = new Control();
            control.leerAstronauta(dto.getId());}
   // Confirmar y cerrar la transacción
    entityManager.getTransaction().commit();
    // Cerrar el EntityManager y el EntityManagerFactory
    entityManager.close();
    managerFactory.close();}


    public void borrarAstronauta(Long idAstronauta) {
    // Crear el EntityManagerFactory
    EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("ConexionJPA");
    // Crear el EntityManager
    EntityManager entityManager = managerFactory.createEntityManager();
    // Iniciar la transacción
    entityManager.getTransaction().begin();
    // Buscar el astronauta por su ID
    Astronauta astronauta = entityManager.find(Astronauta.class, idAstronauta);
    // Verificar si se encontró el astronauta
    if (astronauta != null) {
        // Eliminar el astronauta
        entityManager.remove(astronauta);
        System.out.println("Astronauta eliminado correctamente.");
    } else {
        System.out.println("No se encontró ningún astronauta con el ID proporcionado.");
    }
    // Confirmar y cerrar la transacción
    entityManager.getTransaction().commit();
    // Cerrar el EntityManager y el EntityManagerFactory
    entityManager.close();
    managerFactory.close();
}
   
    
    public void ConsultaCriteriaQueryAstronautas(){
     // Crear el EntityManagerFactory
    EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("ConexionJPA");
    // Crear el EntityManager
    EntityManager entityManager = managerFactory.createEntityManager();
    // Iniciar la transacción
    entityManager.getTransaction().begin();
     // Obtener el CriteriaBuilder para construir la consulta
    CriteriaBuilder builder = entityManager.getCriteriaBuilder();
    // Crear una CriteriaQuery para la clase Astronauta
    CriteriaQuery<Astronauta> criteria = builder.createQuery(Astronauta.class);
    // Definir el root de la consulta (desde qué entidad se realizará la consulta)
    Root<Astronauta> root = criteria.from(Astronauta.class);
     // Ejecutar la consulta
    TypedQuery<Astronauta> query = entityManager.createQuery(criteria);
     // Obtener la lista de resultados
     List<Astronauta> listadto = query.getResultList();
     
        for (Astronauta dto : listadto) {
            System.out.println("------------Astronauta---------");
            Control control = new Control();
            control.leerAstronauta(dto.getId());
           
        }
    
    entityManager.getTransaction().commit();
    // Cerrar el EntityManager y el EntityManagerFactory
    entityManager.close();
    managerFactory.close();
    }
    
    public void ConsultaAstronautasMujeres(){
     // Crear el EntityManagerFactory
    EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("ConexionJPA");
    // Crear el EntityManager
    EntityManager entityManager = managerFactory.createEntityManager();
    // Iniciar la transacción
    entityManager.getTransaction().begin();
     // Obtener el CriteriaBuilder para construir la consulta
    CriteriaBuilder builder = entityManager.getCriteriaBuilder();
    // Crear una CriteriaQuery para la clase Astronauta
    CriteriaQuery<Astronauta> criteria = builder.createQuery(Astronauta.class);
    // Definir el root de la consulta (desde qué entidad se realizará la consulta)
    Root<Astronauta> root = criteria.from(Astronauta.class);
    // Definir el predicado para filtrar por el atributo "sexo"
    Predicate predicado = builder.equal(root.get("sexo"), 'F'); // Aquí asumiendo que 'F' es para las mujeres
   // Aplicar el predicado a la consulta
    criteria.where(predicado);
    // Ejecutar la consulta
    TypedQuery<Astronauta> query = entityManager.createQuery(criteria);
    // Obtener la lista de resultados
    List<Astronauta> listadto = query.getResultList();
     
        for (Astronauta dto : listadto) {
            System.out.println("------------Astronauta---------");
            Control control = new Control();
            control.leerAstronauta(dto.getId());
           
        }
    
//    entityManager.getTransaction().commit();
    
    // Cerrar el EntityManager y el EntityManagerFactory
    entityManager.close();
    managerFactory.close();
    }
}
