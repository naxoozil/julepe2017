import java.util.Random;
import java.util.ArrayList;
/**
 * Write a description of class Juego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Juego
{
    // instance variables - replace the example below with your own
    private Jugador[] jugadores;
    private Mazo mazo;
    private int paloQuePinta;
    private String nombreJugadorHumano;
    /**
     * Constructor for objects of class Juego
     */
    public Juego(int numeroDeJugadores, String nombreHumano)
    {
        
        mazo = new Mazo();
        jugadores = new Jugador[numeroDeJugadores];
        ArrayList <String> posiblesNombres = new ArrayList<String>();
        posiblesNombres.add("Nacho");
        posiblesNombres.add("Brian");
        posiblesNombres.add("Miguel");
        posiblesNombres.add("Silvia");
        posiblesNombres.add("Aitor");
        posiblesNombres.add("Oscar");
        posiblesNombres.add("Valerie");
        posiblesNombres.add("Cristian");
        posiblesNombres.add("Rebeca");
        posiblesNombres.add("Azahara");
        posiblesNombres.add("Borja");
        posiblesNombres.add("Adrian");
        posiblesNombres.add("Ethan");
        posiblesNombres.add("Sara");
        posiblesNombres.add("Benavides");
        
        jugadores[0] = new Jugador(nombreHumano);
        
        Random aleatorio = new Random();
        for(int i = 0;i < numeroDeJugadores; i++){
            if(i == 0){
                Jugador jugador = new Jugador(nombreHumano);
                jugadores[i] = jugador;
            }
            if(i != 0){
                int posicionNombre = aleatorio.nextInt(posiblesNombres.size());
                String nombre = posiblesNombres.get(posicionNombre);
                posiblesNombres.remove(posicionNombre);
            
                Jugador jugador = new Jugador(nombre);
                jugadores[i] = jugador;
            }
        }
        
    }
    
    public void repartirCartas()
    {
        mazo.barajar();
        Carta aRepartir = null;
        int cartaARepartir = 0;
        while(cartaARepartir < 5){
            int indexRapido = 0;
            while(indexRapido < jugadores.length){
                //Jugador jugadorActual = jugadores(indexRapido);
                aRepartir = mazo.sacarCarta();
                Jugador jugadorActual = jugadores[indexRapido];
                jugadorActual.recibirCarta(aRepartir);
                
            }
        }
    }
    
    
    
}