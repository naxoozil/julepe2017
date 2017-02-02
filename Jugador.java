import java.util.Random;
/**
 * Write a description of class Jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador
{
    //Guardamos el nombre del jugador
    private String nombreJugador;
    //guardamos en un ARRAY las cartas que el jugador tiene en la mano
    private Carta[] cartasQueTieneEnLaMano;
    private int numeroCartasEnLaMano;
    
    /**
     * Constructor for objects of class Jugador
     */
    public Jugador(String nombreJugador)
    {
        this.nombreJugador = nombreJugador;
        cartasQueTieneEnLaMano = new Carta[5];
        numeroCartasEnLaMano = 0;
    }

    public void recibirCarta(Carta unaCarta)
    {
        if( numeroCartasEnLaMano < 5){
            cartasQueTieneEnLaMano [numeroCartasEnLaMano] = unaCarta;
            numeroCartasEnLaMano++;
        }
    }
    
    public void verCartasJugador()
    {
        for (Carta cartaActual : cartasQueTieneEnLaMano){
            if (cartaActual != null){
                System.out.println(cartaActual);
            }
        }
    }
    
    public Carta tirarCarta(String cartaTirada)
    {
       Carta cartaEscogida = null;
       if(numeroCartasEnLaMano > 0){
           boolean buscando = true;
           int contadorCartas = 0;
           while(contadorCartas < cartasQueTieneEnLaMano.length && buscando){
               cartaEscogida = cartasQueTieneEnLaMano[contadorCartas];
               if(cartaEscogida != null && cartaTirada.equals(cartaEscogida.toString())){
                   buscando = false;
                   cartasQueTieneEnLaMano[contadorCartas] = null;
                   numeroCartasEnLaMano--;
                   System.out.println(nombreJugador + " tira la carta: " + cartaEscogida);
                }
            } 
       }
       return cartaEscogida;
    }
   
    public Carta sacarCartaAleatoria()
    {
        Carta cartaTirada = null;
        if(numeroCartasEnLaMano > 0){
            Random cartaAleatoria = new Random();
            boolean buscando = false;
            while(!buscando){
                int aleatorio = cartaAleatoria.nextInt(cartasQueTieneEnLaMano.length);
                if(cartasQueTieneEnLaMano[aleatorio] != null){
                    cartaTirada = cartasQueTieneEnLaMano[aleatorio];
                    cartasQueTieneEnLaMano[aleatorio] = null;
                    numeroCartasEnLaMano--;
                    System.out.println(nombreJugador + " tira la carta " + cartaTirada);
                    buscando = true;
                }
            }
        }
        return cartaTirada;
    }

    
    
}
