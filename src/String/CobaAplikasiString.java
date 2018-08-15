
package String;

import java.util.Locale;

public class CobaAplikasiString {
    public static void main(String[] args)
    {
      String identitas = "Sayyidati Khadijah / X RPL 2 / 32";
      System.out.println("Identitas : "+ identitas);
     
    
    String x = "Operasi";
        System.out.println("Isi variabel x : "+ x);
        System.out.println("\""+ x + "\" panjang karakter = "+ x.length());
        
        System.out.println("x adalah kosong : " + x.isEmpty());
        
        String y = "";
        System.out.println("isi variabel y : "+ y);
        System.out.println("y adalah kosong : " + y.isEmpty());
        System.out.println("isi x sama dengan y : " + x.equals(y));
         
        String z = "Operasi";
        System.out.println("Isi variabel z : "+ z);
        System.out.println("Isi x sama dengan z (Case Sensitive): "
                 + x.equals(z));
         
        String r = "operasi";
        System.out.println("isi variabel r : "+ r);
        System.out.println("isi variabel r : (Case Sensitive) : " 
                + x.equals(r));
        System.out.println("isi variabel r : (Not Case Sensitive) : " 
                + x.equalsIgnoreCase(r));


}
}
    

