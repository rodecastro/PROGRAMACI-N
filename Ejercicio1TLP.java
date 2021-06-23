/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labrador1;

import javax.swing.JOptionPane;

/**
 *
 * @author Ro de Castro
 */
public class Perro {

    /**
     * @param args the command line arguments
     */
    private String nombre;
    private int edad;
    private String raza; 
    
    public Perro(){}
    public Perro(String n,int e, String r){
    this.nombre= n; 
    this.edad= e;
    this.raza= r;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
public static void main(String[] args) { 
    int a= 1;
    int i; 
    Perro labrador [] = new Perro [a];
    for (i=0; i<labrador.length; i++){
        labrador[i] = new Perro ();
        labrador[i].setNombre(JOptionPane.showInputDialog("Ingrese Nombre"));        
        labrador[i].setEdad(Integer.valueOf(JOptionPane.showInputDialog("ingrese edad")));
        labrador[i].setRaza(JOptionPane.showInputDialog ("ingrese raza"));
        }
    for (i=0; i<labrador.length; i++){
        JOptionPane.showMessageDialog (null,labrador[i].getNombre()+","+labrador[i].getEdad()+" años, "+labrador[i].getRaza());{
        
    }
    }}} 

