/*
programmer en command line chatclient, som kan bruges sammen med serveren.
 */

import java.io.IOException;
import java.net.Socket;
import java.util.Objects;
import java.util.Scanner;

public class ChatClientAflevering {

    public static int port = 59002;
    private static String ipAdress = "";

    public static void main(String[] args) throws IOException {
        welcome();
    }

    static void welcome() throws IOException {
        System.out.println("Insdtast IP adressen på den server, du ønsker at tilslutte");
        System.out.println("Hvis du kun ønsker at skrive lokalt, tryk på Enter tasten");

        Scanner scan = new Scanner(System.in); ipAdress = scan.nextLine();
        if (Objects.equals(ipAdress, "")){ ipAdress = "localhost";}

        client();
    }

    static void client() throws IOException {
        var soc = new Socket(ipAdress,port);

    }
}
