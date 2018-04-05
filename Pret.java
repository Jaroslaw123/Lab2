package punkt_materialny;
/**
 *
 * @author Jarek
 */
public class Pret extends punkt_materialny {   //utworzenie klasy pochodnej od punkt materialny
    
    public float dlugosc;                     //public modyfikator dlugosc
    public Pret(){
        super();
       }
    public Pret (float masa, float dlugosc)  // konstruktor klasy walec z parametrami
    {
        super(masa);
        this.dlugosc = dlugosc;
    }
    public void set_dlugosc (float dlugosc) // akcesor modyfikujący pole dlugosc
    {
        this.dlugosc=dlugosc;
    }
    public float get_dlugosc()             // akcesor odczytujący pole dlugosc 
    {
        return this.dlugosc;
    }
    @Override                               
    public float głowny_moment_bezwladnosci() //metoda bez parametru obliczająca gł moment bezwładności 
    {
        return (pobierz_mase()*dlugosc*dlugosc)/12;
    }
    @Override
    public float moment_bezw_Satiner(float odleglosc) //metoda bez parametru obliczająca moment 
    {                                                 //względem przesuniętej osi
        return głowny_moment_bezwladnosci() + pobierz_mase()*odleglosc*odleglosc;
    }
    @Override
    public void opis()                                //metoda wypisująca opis
    {
        System.out.println("Pręt");
    }
}

