
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

                System.out.println("perbandingan isi x dengan y : " + x.compareTo(y)); 
        System.out.println("perbandingan isi x dengan z (Case Sensitive) : "
                + x.compareTo(z));
        System.out.println("perbandingan isi x dengan z (Case Sensitive) : "
                + x.compareTo(r));
        System.out.println("perbandingan isi x dengan z (Not Case Sensitive) : "
                + x.compareToIgnoreCase(r));
          
        String s = "operasi";
        System.out.println("isi variabel s : "+ s);
        System.out.println("perbandingan isi r dengan s (Case Sensitive) : "
                + r.compareTo(s));

        System.out.println("pada x terdapat huruf 'a' : " + x.contains("a"));
        System.out.println("isi variabel x besar semua : "+ x.toUpperCase());
        System.out.println("isi variabel x kecil semua : "+ x.toLowerCase());
             
        String t = "   operasi string   ";
        System.out.println("isi variabel t : \""+ t +"\"");
        System.out.println("isi variael t tanpa spasi : \""+ t.trim() +"\""); 
        System.out.println("gabungkan isi variabel x dan r : "+ x.concat(r));


}
}
    

