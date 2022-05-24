package Pregunta05;

public class Main {

    public static void main(String[] args){

        Persona persona = new Persona();

        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Edad: "+persona.getEdad());
        System.out.println("Sexo: "+persona.getSexo());
        System.out.println("Dni: "+persona.getDni());
        System.out.println("Altura: "+persona.getAltura());
        System.out.println("Peso: "+persona.getPeso());

        if (persona.calculoIMC() >= 20 && persona.calculoIMC() <= 20){

            System.out.println("Su IMC es de: "+persona.calculoIMC()+" Se encuentra estable");
        }
        else if (persona.calculoIMC() < 20 ){
            System.out.println("Su IMC es de: "+persona.calculoIMC()+" Se encuentra por debajo");
        }
        else {
            System.out.println("Su IMC es de: "+persona.calculoIMC()+" Se encuentra muy eleado");
        }
    }
}
