import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ciao tizio!");

        System.out.println("Inserisci il messagio da crtitare: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        
        String key = "kap";
        scanner.close();

        String strCrypted = Cryto.xorAlgo(str, key);
        System.out.println(strCrypted);
        System.out.println(Cryto.xorAlgo(strCrypted, key));

        System.out.println("---------------------------------------");
        int keyInt = 5;
        strCrypted = Cryto.Cesar(str, keyInt);
        System.out.println(strCrypted);
        System.out.println(Cryto.Cesar(strCrypted, -keyInt));
    }
}
