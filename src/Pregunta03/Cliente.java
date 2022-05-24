package Pregunta03;

public class Cliente {

    private String nombre;

    private String apepat;

    private String apemat;

    private  int dni;

    public Cliente(String nombre, String apepat, String apemat, int dni) {
        this.nombre = nombre;
        this.apepat = apepat;
        this.apemat = apemat;
        this.dni = dni;

    }

    public static boolean contains(String busqueda) {


        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApepat() {
        return apepat;
    }

    public void setApepat(String apepat) {
        this.apepat = apepat;
    }

    public String getApemat() {
        return apemat;
    }

    public void setApemat(String apemat) {
        this.apemat = apemat;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
