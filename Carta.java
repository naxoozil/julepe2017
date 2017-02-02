
/**
 * Write a description of class Carta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carta
{
    //Valor del palo; 0 es oros, 1 es copas, 2 es espadas y 3 es bastos
    private int paloCarta;
    //Valor de la carta de 1 a 7 
    private int valorCarta;

    /**
     * Constructor for objects of class Carta
     */
    public Carta(int paloCarta, int valorCarta)
    {
        this.paloCarta = paloCarta;
        this.valorCarta = valorCarta;
    }

    public int getValorCarta()
    {
        return valorCarta;
    }

    public int getPaloCarta()
    {
        return paloCarta;
    }

    public String toString()
    {
        String textoADevolver = "";
        String textoPalo = "";
        if(paloCarta == 0){
            textoPalo = " oros";
        }
        else if(paloCarta == 1){
            textoPalo = " copas";
        }
        else if(paloCarta == 2){
            textoPalo = " espadas";
        }
        else if(paloCarta == 3){
            textoPalo = " bastos";
        }

        String textoValor = Integer.toString(valorCarta);
        if(valorCarta == 1){
            textoValor = "As" ;
        }
        else if(valorCarta == 10){
            textoValor = "Sota";
        }
        else if(valorCarta == 11){
            textoValor = "Caballo";
        }
        else if(valorCarta == 12){
            textoValor = "Rey";
        }
        textoADevolver = textoValor + " de " + textoPalo;
        return textoADevolver;
    }

    public boolean ganaA (Carta cartaAComparar, int paloQuePinta){
        boolean gana = false;
        if(paloCarta == cartaAComparar.getPaloCarta()){
            //EN CASO DE QUE TENGAN EL MISMO PALO
            if(getPosicionEscalaTute() > cartaAComparar.getPosicionEscalaTute()){
                gana = true;
            }
        }
        else{
            //EN CASO DE QUE TENGAN DISTINTO PALO
            if(cartaAComparar.getPaloCarta() != paloQuePinta){
                gana = false;
            }
            
        }
        return gana;
    }

    public int getPosicionEscalaTute() 
    {
        int posicion = valorCarta;

        if (valorCarta == 3) {
            posicion = 13;
        }
        else if (valorCarta == 1) {
            posicion = 14;
        }

        return posicion;
    }
}
