package Pregunta05;

import javax.swing.*;

public class Persona {

    private String nombre;

    private int edad;

    private String sexo;

    private int dni;

    private double altura;

    private double peso;

    public Persona() {

        nombre = JOptionPane.showInputDialog("Ingres su nombre");

        setNombre(nombre);

        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingres su atura"));

        setAltura(altura);

        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingres su edad"));

        setSexo(sexo);

        dni = Integer.parseInt(JOptionPane.showInputDialog("Ingres su dni"));

        setDni(dni);

        peso = Double.parseDouble(JOptionPane.showInputDialog("Ingres su peso"));

        setPeso(peso);

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public int getDni() {
        return dni;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double calculoIMC(){

        double imc;

        imc = Math.round(peso / (Math.pow(altura, 2)));

        return imc;
    }
}

