package videojuego;

public class Selenita extends Extraterrestre implements DominarPlaneta {

    private String armamento;

    public void atacarTerricola() {
        super.atacarTerricola();
        System.out.println("Aniquilar terrícola");
        dispararArma();
    }

    public void dispararArma() {
        if (armamento.equals("cañon láser")) {
            System.out.println("BOUMMM");
        } else {
            System.out.print("Bzzzzzz");
        }
    }

    public Selenita(String armamento) {
        super(2, 1, "Azul");
        this.armamento = armamento;
    }

    public void asignarArmamento(String armamento) {
        this.armamento = armamento;
    }

    public void proclamarGobierno(String planeta) {
        System.out.println("Eliminar gobernantes del planeta:" + planeta);
        System.out.println("Gobernamos sobre el planeta " + planeta);
    }

    public void aniquilarPoblacion(String planeta) {
        System.out.println("Utilización de armas nucleares sobre el planeta " + planeta);
    }

    public void controlarRecursos(String planeta) {
    }
}
