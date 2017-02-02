import java.util.ArrayList;
import java.util.Random;
/**
 * Write a description of class Mazo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mazo
{
    // instance variables - replace the example below with your own
    private ArrayList<Carta> mazo;

    /**
     * Constructor for objects of class Mazo
     */
    public Mazo()
    {
        mazo = new ArrayList <Carta>();
        for( int paloActual = 0; paloActual < 4; paloActual++){
            for ( int valorActual = 1; valorActual<=12; valorActual ++){
                if (valorActual!= 8 && valorActual!=9){
                    mazo.add(new Carta( paloActual, valorActual));
                }
            }
        }
    }

    public void verCartasDelMazo()
    {
        for ( int i = 0; i < mazo.size(); i++){
            System.out.println(mazo.get(i));
        }
    }
   
    public void barajar(){
        for(int index = 0; index < mazo.size(); index++){
            Random nuevaPosicion = new Random();
            int index2 = nuevaPosicion.nextInt(40);
            Carta carta1 = mazo.get(index);
            Carta carta2 = mazo.get(index2);
            mazo.set(index2,carta1);
            mazo.set(index,carta2);
        }
    }
    
    public Carta sacarCarta()
    {
        Carta cartaADevolver = null;
        if(mazo.size() > 0){
            cartaADevolver = mazo.remove(0);
           
        }
        return cartaADevolver;
    }
}
