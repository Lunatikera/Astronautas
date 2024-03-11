/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import DAO.Control;
import javax.persistence.TypedQuery;

/**
 *
 * @author Arell
 */
public class Consultas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Control control = new Control();
        System.out.println("--------------CONSULTA-------------");
       // control.leerAstronauta(1L);
       //control.borrarAstronauta(1L);
      // control.ConsultaCriteriaQueryAstronautas();
       control.ConsultaAstronautasMujeres();
       //control.ConsultaJPQLAstronautas();
         
    }
    
}
