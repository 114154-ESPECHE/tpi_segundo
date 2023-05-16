package ar.edu.utn.frc.tup.lciii;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Juego {

    private List<Movimiento> movJugador;
    private PiezaColor turno;
    private Jugador jugador;
    private Resultad resultad;
    //private chequearEstado;
    Scanner sc = new Scanner(System.in);

    public void jugar() {
        List<Jugador> lJugadores;
        pedirNombreJugadores();
    }

    public List pedirNombreJugadores() {
        List<Jugador> lJugugadores = new ArrayList<>();
        String piezaColor = "";
        boolean banderaBlanco = false;
        boolean banderaNegro = false;
        System.out.println("Ingrese el nombre del Jugador 1:");
       String nombreJugador = sc.nextLine();
        System.out.println("Ingrese el color:  1-Blanco \n2-Negro");
        int opc = sc.nextInt();
        if (opc >0 && opc < 3){
            if (opc == 1){
                piezaColor = "Blanco";
                banderaBlanco = true;
            }else {
                piezaColor = "Negro";
                banderaNegro = true;
            }
        }
        Jugador j1 = new Jugador(nombreJugador,piezaColor);
        System.out.println("Ingrese nombre Jugador 2:");
        String nombJugador2 = sc.nextLine();
        if (banderaBlanco){
            piezaColor = "Blanco";
        }else {
            piezaColor = "Negro";
        }
        Jugador j2 = new Jugador(nombJugador2, piezaColor);
        lJugugadores.add(j1);
        lJugugadores.add(j2);
        return  lJugugadores;
    }
}
