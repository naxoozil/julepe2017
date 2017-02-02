
/**
 * Write a description of class Baza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Baza
{
    private Carta[] baza;
    private String[] nombreJugadores;
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
    
    /**
     * método llamado addCarta que admita un parámetro de tipo Carta 
     * y un segundo parámetro de tipo String. 
     * El primer parámetro representa la carta que tira un jugador a la mesa y que,
     * por tanto, se añade a la baza. 
     * No hace falta comprobar que la carta añadida sea o no null, 
     * se supone que es una carta. 
     * El segundo parámetro indica el nombre del jugador que tiro la carta.
     * El método no devuelve nada.
     */
    public void addCarta(Carta cartaATirar, String nombreJugador)
    {
        if(numeroDeBaza < baza.length){
            baza[numeroDeBaza] = cartaATirar;
            nombreJugadores[numeroDeBaza] = nombreJugador;
            numeroDeBaza++;
        }
    }
    
    /**
     * método llamado getPaloPrimeraCartaDeLaBaza sin parámetros que 
     * devuelva un entero que representa el palo de la primera carta 
     * añadida a la baza o -1 en caso de que no se haya añadido aún ninguna carta
     */
    public int getPaloPrimeraCartaDeLaBaza(){
        int primeraCarta = -1;
        if(baza[0] != null){
            primeraCarta = baza[0].getPaloCarta();
        }
        return primeraCarta;
    }
    
    
    
    
}
