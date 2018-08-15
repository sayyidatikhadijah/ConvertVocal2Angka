
package String;

import java.util.Scanner;


public class ConvertVocal2Angka {
    private static void tampilJudul(String identitas)
    {
        System.out.println("identitas : "+ identitas);
        System.out.println("\nConvert Kalimat Alay Angka (vokal ke angka)\n");
    }
    
    public static void main(String[] args)
    {
        String identitas = "Sayyidati Khadijah / X RPL 2 / 32";
        tampilJudul(identitas);
    }
}
