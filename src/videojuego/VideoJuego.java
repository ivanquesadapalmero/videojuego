package videojuego;

public class VideoJuego {

    static Venusiano alien;

    static Selenita alien2;

    public static void main(String args[]) {
        alien = new Venusiano();
        System.out.println("Es de color: " + alien.devuelveColor());
        alien.teletransportar("Soria");
        alien.atacarTerricola();
        System.out.println();
        alien2 = new Selenita("cañon láser");
        alien2.teletransportar("Fernan Nunez");
        alien2.atacarTerricola();
        alien2.aniquilarPoblacion("Tierra");
        System.out.println();
    }
}
