package ar.edu.utn.frc.tup.lciii;

/**
 * Hello to TPI Chess
 *
 */
public class App 
{

    public static void main( String[] args ) {
        Tablero t = new Tablero();
        String tablero = t.dibujarTablero(8);
        System.out.println(tablero);
        System.out.println("Hello, TPI Chess.");
    }
}
