package punkt_materialny;
/**
 *
 * @author Jarek
 */
public class Walec extends punkt_materialny {    //utworzenie klasy pochodnej od punkt materialny 
     
        protected float promien;                // protected modyfikator promień                 
        public Walec(){                                        
        super();                                                    
         }       
        public Walec(float masa,float promien) // konstruktor klasy walec z parametrem 
        {
         super(masa);
         this.promien=  promien;
        }
        public void set_promien(float promien) // akcesor modyfikujący pole promień
            {
                this.promien=promien;
            }
          
            public float get_promien()        // akcesor odczytujący pole promień 
            {
                return this.promien;
            }
        @Override                                 
        public float głowny_moment_bezwladnosci()  //metoda bez parametru obliczająca gł moment bezwładności 
            {
                return  (float) (0.5*pobierz_mase()*promien*promien);
            }
        
        @Override
            public float moment_bezw_Satiner(float odleglosc)    //metoda bez parametru obliczająca moment 
            {                                                    //względem przesuniętej osi
                return głowny_moment_bezwladnosci() + pobierz_mase()*odleglosc*odleglosc;
            }
        @Override
            public void opis()                                  //metoda wypisująca opis
            {
                System.out.println("Walec");
            }
        }

