import java.util.Scanner;

public class PiedraPapelTijera {
     public enum Jugada {
            PIEDRA, PAPEL, TIJERA
        }

        public static void juego(){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Jugador 1, ingrese su jugada (PIEDRA, PAPEL, TIJERA):");
            Jugada jugador1 = Jugada.valueOf(scanner.nextLine().toUpperCase());

            System.out.println("Jugador 2, ingrese su jugada (PIEDRA, PAPEL, TIJERA):");
            Jugada jugador2 = Jugada.valueOf(scanner.nextLine().toUpperCase());

            String resultado = jugar(jugador1, jugador2);
            System.out.println("Resultado: " + resultado);
        
            scanner.close();
        }
    
        public static String jugar(Jugada jugador1, Jugada jugador2) {
            final String ganador1 = "Victoria Jugador 1";
            final String ganador2 = "Victoria Jugador 2";
            final String empate = "Empate";
            final String error = "Error";
    
            switch (jugador1) {
                case PIEDRA: {
                    if (jugador2 == Jugada.PAPEL)
                        return ganador2;
                    if (jugador2 == Jugada.TIJERA)
                        return ganador1;
                    else
                        return empate;
                }
                case PAPEL: {
                    if (jugador2 == Jugada.TIJERA)
                        return ganador2;
                    if (jugador2 == Jugada.PIEDRA)
                        return ganador1;
                    else
                        return empate;
                }
                case TIJERA: {
                    if (jugador2 == Jugada.PIEDRA)
                        return ganador2;
                    if (jugador2 == Jugada.PAPEL)
                        return ganador1;
                    else
                        return empate;
                }
                default: {
                    return error;
                }
            }
        }    
}
