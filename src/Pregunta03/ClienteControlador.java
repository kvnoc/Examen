package Pregunta03;

public class ClienteControlador {

    private Cliente[] cliente;

    private int contador;


    public ClienteControlador() {

        this.cliente = new Cliente[5];

        this.contador = 0;
    }

    public void agregarCliente(Cliente cliente){

        this.cliente[this.contador] = cliente;

        this.contador++;
    }

    public Cliente[] listarClientes(){

        return this.cliente;
    }

    public Cliente[] buscarClientes(){

        return this.cliente;
    }

    public Cliente[] editarClientes(){

        return this.cliente;
    }

    public Cliente[] eliminarClientes(){

        return this.cliente;
    }

    public boolean contains(String busqueda) {


        return false;
    }
}
