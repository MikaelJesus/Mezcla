/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mezcla;

/**
 *
 * @author Alumnos
 */
public class Mezcla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p=new Persona(1, "Mikael", "asdjahsj", 21);
        p.guardar(p);
        p.leer();
    }
    
}
