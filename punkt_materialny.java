package punkt_materialny;
/* @author Jarek
 */
public class punkt_materialny { 
    float masa;   
      public void opis(){                              //metoda opisująca punkt materialny  
        System.out.print("Punkt Materialny:" );
    }
     public punkt_materialny(){                         //zadeklarowanie konstruktora domyślnego
      this.masa=1;
          }
     public punkt_materialny(float M){                  //zadeklarowanie konstruktora z parametrem
       
         this.masa=M;
      }
     public void ustawienie_masy(float nadanie_masy){  //metoda zmieniająca masę punktu
        if(nadanie_masy<=0){                           //warunek nadania masy 
            System.out.println("masa nie może być <=0");
        } 
        else 
        {
         masa=nadanie_masy;
         System.out.println("Nadanie masy:"+masa);
         }
         }
         public float pobierz_mase()
         {
         return masa;    
         }
          public float głowny_moment_bezwladnosci(){    //główny moment bezwładności
          return 0;
         }
         public float moment_bezw_Satiner(float odleglosc)//moment bezwładności
         {                                                //względem przesuniętej osi
          return głowny_moment_bezwladnosci() + masa*odleglosc*odleglosc;
                 }
     
     
          public static void main(String[] args) 
                 
         {
         Walec walec= new Walec(5,2);                              // utworzenie obiektu za pomocą konstruktora z parametrami
         walec.opis();                                             // opis obiektu 
         System.out.println("Masa walca jest równa:                       "+walec.pobierz_mase() );             //wypisanie masy     
         System.out.println("Promień walca wynosi:                       "+walec.get_promien());                //wypisanie promienia 
         System.out.println("Moment bezwładności walca:                   "+walec.głowny_moment_bezwladnosci());//wypisanie momentu bezwładności 
         System.out.println("Moment bezwładności walca z Steinera:        "+walec.moment_bezw_Satiner(2));     //wypisanie momentu bezwładności 
                                                                                                               //względem przesuniętej osi
         
         Kula kula=new Kula(5,2);                                  // utworzenie obiektu "Kula" za pomocą konstruktora z parametrami 
         kula.opis();                                                                                            //opis 
         System.out.println("Masa kuli jest równa:                       "+kula.pobierz_mase() );               // wypisanie
         System.out.println("Promień kuli wynosi:                       "+kula.get_promien());                  //parametrów 
         System.out.println("Moment bezwładności kuli:                   "+kula.głowny_moment_bezwladnosci());  // dla obiektu
         System.out.println("Moment bezwładności kuli z Steinera:        "+kula.moment_bezw_Satiner(2));        //kula
         
         Pret pret=new Pret(5,2);                               // utworzenie obiektu "Pret" za pomocą konstruktora z parametrami 
         pret.opis();                                                                                           //opis
         System.out.println("Masa pręta jest równa:                       "+pret.pobierz_mase() );              //wypisanie 
         System.out.println("Promień pręta wynosi:                       "+pret.get_dlugosc());                 //parametrów 
         System.out.println("Moment bezwładności pręta:                   "+pret.głowny_moment_bezwladnosci());//dla obiektu
         System.out.println("Moment bezwładności pręta z Steinera:        "+pret.moment_bezw_Satiner(2));      //pręt
         
         Walec[] tablica_walec=new Walec[3];                    //stworzenie tablicy obiektów
         for(int i=0; i< tablica_walec.length; i++ ){           //zainicjowanie obiektów za pomocą pętli "for"
        
         tablica_walec[i]=new Walec(i+5,i+2);
         }
          for(int i=0; i< tablica_walec.length; i++ )          //wyświetlenie parametrów i opisu z tablicy za pomocą pętli "for"
          {
             tablica_walec[i].opis() ;
         System.out.println(" "+i);
         System.out.println("masa walca o numerze:  " +i+"   wynosi:  "+tablica_walec[i].pobierz_mase());
         System.out.println("główny moment bezwładnosci dla punktu o numerze:" +i +"  wynosi:" +tablica_walec[i].głowny_moment_bezwladnosci());
         System.out.println("Moment bezwładności względem przesuniętej osi dla punktu o numerze: " +i+"  wynosi:   " +tablica_walec[i].moment_bezw_Satiner(i));
          }
              Pret[] tablica_pret=new Pret[3];            //stworzenie tablicy obiektów
         for(int i=0; i< tablica_pret.length; i++ ){      //zainicjowanie obiektów za pomocą pętli "for"
        
         tablica_pret[i]=new Pret(i+3,1+i*3/2);
         }
          for(int i=0; i< tablica_pret.length; i++ )       //wyświetlenie parametrów i opisu z tablicy za pomocą pętli "for"
          {
             tablica_pret[i].opis() ;
         System.out.println(" "+i);
         System.out.println("masa pręta o numerze:  " +i+"   wynosi:  "+tablica_pret[i].pobierz_mase());
         System.out.println("główny moment bezwładnosci dla pręta o numerze:" +i +"  wynosi:" +tablica_pret[i].głowny_moment_bezwladnosci());
         System.out.println("Moment bezwładności względem przesuniętej osi dla pręta o numerze: " +i+"  wynosi:   " +tablica_pret[i].moment_bezw_Satiner(2));
          }
               Kula[] tablica_kula=new Kula[3];           //stworzenie tablicy obiektów
         for(int i=0; i< tablica_kula.length; i++ ){      //zainicjowanie obiektów za pomocą pętli "for"
        
         tablica_kula[i]=new Kula(i+4,i+5);
         }
          for(int i=0; i< tablica_kula.length; i++ )     //wyświetlenie parametrów i opisu z tablicy za pomocą pętli "for"
          {
             tablica_kula[i].opis() ;
         System.out.println(" "+i);
         System.out.println("masa kuli o numerze:  " +i+"   wynosi:  "+tablica_kula[i].pobierz_mase());
         System.out.println("główny moment bezwładnosci dla kuli o numerze:" +i +"  wynosi:" +tablica_kula[i].głowny_moment_bezwladnosci());
         System.out.println("Moment bezwładności względem przesuniętej osi dla kuli o numerze: " +i+"  wynosi:   " +tablica_kula[i].moment_bezw_Satiner(i));
          }
         } 
         }
     
     


