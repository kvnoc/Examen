package Pregunta03;

public class Main {

    public static void main(String[] args){

        ClienteControlador clienteControlador = new ClienteControlador();

        clienteControlador.agregarCliente(new Cliente("Jose", "Ramos","Perez", 1111111));
        clienteControlador.agregarCliente(new Cliente("Mario", "Lucas","Salazar", 1111111));
        clienteControlador.agregarCliente(new Cliente("Luis", "Villamarin","Fernandez", 1111111));
        clienteControlador.agregarCliente(new Cliente("Carlos", "Garcia","Llanto", 1111111));
        clienteControlador.agregarCliente(new Cliente("Sandra", "Godos","Vidal", 1111111));

        for (Cliente cliente: clienteControlador.listarClientes()){

            System.out.println("Cliente: "+cliente.getNombre()+" "+cliente.getApepat()+" "+cliente.getApemat()+"  DNI:  "+cliente.getDni());
        }

        String busqueda = "Luis Villamarin Fernandez";

        boolean existe = clienteControlador.contains(busqueda);

        if (existe) {

            System.out.println("El cliente si existe ");

        } else {

            System.out.println("El cliente no existe");

        }




    }

}


