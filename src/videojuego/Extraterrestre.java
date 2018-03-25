package videojuego;

public abstract class Extraterrestre {

    private int piernas;

    private int ojos;

    private String color;

    public Extraterrestre(int piernas, int ojos, String color) {
        this.piernas = piernas;
        this.ojos = ojos;
        this.color = color;
    }

    public void atacarTerricola() {
        System.out.println("Terrícola capturado");
    }

    public void teletransportar(String lugar) {
        System.out.println("Ahora estoy en:" + lugar);
    }

    public int devuelvePiernas() {
        return piernas;
    }

    public void asignaPiernas(int piernas) {
        this.piernas = piernas;
    }

    public int devuelveOjos() {
        return ojos;
    }

    public void asignaOjos(int ojos) {
        this.ojos = ojos;
    }

    public String devuelveColor() {
        return color;
    }

    public void asignaColor(String color) {
        this.color = color;
    }
}
