package lmu;/*
Opgave: programmer en command line chatclient, som kan bruges sammen med serveren.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Objects;
import java.util.Scanner;

public class ChatClientAflevering {

    private static String ipAdress = "";

    public static void main(String[] args) throws IOException {
        welcome();
    }

    static void welcome() throws IOException {
        System.out.println("Insdtast IP adressen på den server, du ønsker at tilslutte");
        System.out.println("Hvis du kun ønsker at skrive lokalt, tryk på Enter tasten");

        Scanner scan = new Scanner(System.in); ipAdress = scan.nextLine();
        if (Objects.equals(ipAdress, "")){ ipAdress = "localhost"; System.out.println("opretter localhost forbindelse"); }

        clientSetup();
    }

    static void clientSetup() throws IOException {
        var soc = new Socket(ipAdress,59002); //Laver en custom variabel med navn soc"Socket" med en string, og port

        Scanner inp = new Scanner(soc.getInputStream()); //standart I/O variabler
        PrintWriter out = new PrintWriter(soc.getOutputStream(),true);

        while (inp.hasNextLine()){
            var line = inp.nextLine();
            //laver en string variable, som programmet bruger til at checke server status, og handler ud fra det.

            if (line.startsWith("SUBMITNAME")) {
                System.out.println("Skriv dit navn"); String mitNavn = inp.nextLine();

                out.println(mitNavn);

            } else if (line.startsWith("NAMEACCEPTED")) {
                System.out.println("Snakker på : " + line.substring(13));

                Scanner scanner = new Scanner(System.in);
                System.out.println("Skriv hvad du har på hjertet"); String besked = scanner.nextLine();

                out.println(besked);

            } else if (line.startsWith("MESSAGE")) {
                System.out.println(line.substring(8) + "\n");

                Scanner scanner = new Scanner(System.in);
                System.out.println("Skriv hvad du har på hjertet"); String besked = scanner.nextLine();

                out.println(besked);
            }
        }
    }
}
