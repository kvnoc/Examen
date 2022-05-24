package Pregunta01;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Matricula {

    private String nombres;

    private int semestre;

    private String cursoa;

    private String cursob;

    private String cursoc;


    public Matricula() {

        nombres = JOptionPane.showInputDialog("Ingrese Nombres y Apeliidos");

        semestre = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su semestre academico: 1 - 2 - 3"));

        setSemestre(semestre);

        cursoa = JOptionPane.showInputDialog("Ingrese el primer curso a llevar");

        setCursoa(cursoa);

        cursob = JOptionPane.showInputDialog("Ingrese el segundo curso a llevar");

        setCursob(cursob);

        cursoc = JOptionPane.showInputDialog("Ingrese el tecer curso a llevar");

        setCursoc(cursoc);

    }

    public String getNombre() {
        return nombres;
    }

    public void setNombre(String nombre) {
        this.nombres = nombre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        semestre = semestre;
    }

    public String getCursoa() {
        return cursoa;
    }

    public void setCursoa(String cursoa) {
        this.cursoa = cursoa;
    }

    public String getCursob() {
        return cursob;
    }

    public void setCursob(String cursob) {
        this.cursob = cursob;
    }

    public String getCursoc() {
        return cursoc;
    }

    public void setCursoc(String cursoc) {
        this.cursoc = cursoc;
    }

    public String docentesNum(){

        Random rand = new Random();

        List<String> lista = Arrays.asList("Julio Trujillo", "Marcos Martel", "Luis Lucas", "Carlos Lopez", "Maria Zevallos");

        int numero = 3;

        for (int i = 0; i < numero; i++) {

            int docente = rand.nextInt(lista.size());

            String elementoAzar = lista.get(docente);

            System.out.println("Docente: " + elementoAzar);

        }
        return null;
    }

}
