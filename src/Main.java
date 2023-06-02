public class Main {
    public static void main(String[] args) {
        //Creacion de instancias(objetos)
        Videojuego videojuego1= new Videojuego("Minecraft", "Michael Fox", "aventura, fantasia", 2010);
        Videojuego videojuego2= new Videojuego("Call of Duty", "Christian Parker","Campal, multijugador", 2014);
        Videojuego videojuego3=new Videojuego("Mario 64", "Tomoya Sasaki", "aventura, fantasia", 1990);
        Videojuego videojuego4=new Videojuego("Mortal Kombat", "Peter Rogers","Accion, Peleas", 1990);
        Videojuego videojuego5= new Videojuego("Budokai Tengachi","Mizaki Miyamoto","Multijugador, Peleas", 2000);




        //Invocacion del metodo imprimir
        videojuego1.imprimirD();
        videojuego2.imprimirD();
        videojuego3.imprimirD();
        videojuego4.imprimirD();
        videojuego5.imprimirD();

     }

}
