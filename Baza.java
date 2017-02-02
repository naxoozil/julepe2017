
/**
 * Write a description of class Baza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Baza
{
    private Carta[] baza;
    private String [] nombreJugadores;
    private int paloPinte;
    private int numeroDeBaza;
    /**
     *  Tenga un constructor que admita dos parametros. 
     *  El primero es un entero que indica el número de jugadores que van a 
     *  tirar carta y el segundo es otro entero que indica el palo que pinta.

     */
    public Baza(int numeroDeJugadores, int paloPinte)
    {
        baza = new Carta[numeroDeJugadores];
        nombreJugadores = new String[numeroDeJugadores];
        numeroDeBaza = 0;
        this.paloPinte = paloPinte;
        
    }

}
