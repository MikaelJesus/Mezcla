/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mezcla;

import java.io.Serializable;
import java.io.*;

/**
 *
 * @author Alumnos
 */
public class Persona implements Serializable {
    
    private int id;
    private String nombre;
    private String direccion;
    private int edad;

    public Persona() {

    }

    public Persona(Integer id, String nombre, String direccion, Integer edad) {
        this.id=id;
        this.nombre=nombre;
        this.direccion=direccion;
        this.edad=edad;

    }
    public void guardar(Persona persona){
        try{
            FileOutputStream fo=new FileOutputStream("C:\\Users\\Alumnos\\Documents\\test.txt");
            ObjectOutputStream oo=new ObjectOutputStream(fo);
            oo.writeObject(persona);
            oo.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public void leer(){
        Persona resultado=null;
        try{
        FileInputStream fi=new FileInputStream("C:\\Users\\Alumnos\\Documents\\test.txt");
        ObjectInputStream oi=new ObjectInputStream(fi);
        while(true){
            resultado=(Persona)oi.readObject();
            System.out.println(resultado.toString());
        }
        }catch(EOFException e){
            System.out.println("EOF");
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public String toString(){
        return "ID: "+ this.id +" |Nombre: "+ this.nombre +" |Direccion: "+ this.direccion +" |Edad: "+ this.edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
