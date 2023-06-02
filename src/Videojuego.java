public class Videojuego {
    //Atributos
    String nombre, creador, genero;
    int anio;

    //Metodo constructor
    public Videojuego(String nombre, String creador, String genero, int anio){
        this.nombre=nombre;
        this.creador=creador;
        this.genero=genero;
        this.anio=anio;
    }

    //Setters
    public void setNombre(String nombre, String creador, String genero, int anio){
        this.nombre=nombre;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getCreador() {
        return creador;
    }

    public String getGenero() {
        return genero;
    }

    public int getAnio() {
        return anio;
    }

    //Metodo Imprimir datos
    public void imprimirD(){
        System.out.println("Videojuego");
        System.out.println("Nombre: "+getNombre()+"\nNombre del creador: "+getCreador()+"\nGeneros: "+getGenero()+"\nAño de Lanzamiento: "+getAnio()+"\n");
    }



}
