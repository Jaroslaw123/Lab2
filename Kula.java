package punkt_materialny;
/**
 *
 * @author Jarek
 */
public class Kula extends punkt_materialny {   //utworzenie klasy pochodnej od punkt materialny
    public float promien;                      //public modyfikator promien
    public Kula(){
        super();
      }
    public Kula(float masa, float promien)  //konstruktor klasy "Kula" z parametrami
    {
        this.masa=masa;
        this.promien=promien;
    }
    public void set_promien(float promien) // akcesor modyfikujący pole promien
    {
        this.promien=promien;
    }
    public float get_promien()             // akcesor odczytujący pole promien
    {
        return this.promien;
    }
    
    @Override
    public float głowny_moment_bezwladnosci()  //metoda bez parametru obliczająca gł moment bezwładności
    {
    float moment= ((2*pobierz_mase()*promien*promien)/5);
    return moment;
    }
  
    public float  moment_bezw_Satiner(float odleglosc)  //metoda bez parametru obliczająca moment 
    {                                                   //względem przesuniętej osi
        return głowny_moment_bezwladnosci() + pobierz_mase()*odleglosc*odleglosc;
    }
   
    public void opis()                                  //metoda wypisująca opis
    {
        System.out.println("Kula");
    }
    }
