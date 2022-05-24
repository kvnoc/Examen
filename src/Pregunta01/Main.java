package Pregunta01;

import javax.swing.*;

public class Main {

    public static void  main(String[] args){

        Matricula matricula = new Matricula();

        System.out.println("Alumno: "+matricula.getNombre());

        System.out.println();

        System.out.println("Uds se ah matriculado en el semestre: "+matricula.getSemestre());

        System.out.println();

        System.out.println("Tus cursos registrados son: ");

        System.out.println(matricula.getCursoa());

        System.out.println(matricula.getCursob());

        System.out.println(matricula.getCursoc());

        System.out.println();

        System.out.println("Los siguientes docentes son los encargados de cada curso respectivamente: ");

        System.out.println();

        System.out.println(matricula.docentesNum());
    }
}
