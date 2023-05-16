package ar.edu.utn.frc.tup.lciii;

public class Tablero {

    //matriz de posicion
    private PiezaSet piezaSet;
    private PiezaColor setPiezaEnTablero;


    public void crear(){

    }
    public static String dibujarTablero(int tamaño){
        StringBuilder sb = new StringBuilder();
        char casillaBlanca = '-';
        char casillaNegra = '#';

        sb.append("  ");
        for (int c = 0; c < tamaño; c++){
            sb.append(c + 1).append(" ");
        }
        sb.append("\n");

        for (int f = 0; f < tamaño; f++){
            sb.append((char) ('A' + f)).append(" ");
            for (int c = 0; c < tamaño; c++){
                if ((f + c) % 2 == 0){
                    sb.append(casillaBlanca);
                }else {
                    sb.append(casillaNegra);
                }
                sb.append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}
