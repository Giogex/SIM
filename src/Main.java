import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SIM prima = new SIM();
        String no = "";
        do {
            System.out.println("Menù SIM: ");
            System.out.println("1) Visualizza le informazioni sulla SIM");
            System.out.println("2) Visualizza il credito residuo");
            System.out.println("3) Ricarica");
            System.out.println("4) Visualizza le chiamate in uscita");
            System.out.println("5) Avvia una nuova chiamata");
            int selezione = input.nextInt();
            switch (selezione) {
                case 1 -> {
                }
                case 2 -> {
                }
                case 3 -> {
                }
                case 4 -> {
                }
                case 5 -> {
                    prima.chiama(input.nextLine());
                }
                default -> System.out.println("Errore: Il numero inserito non corrisponde a nessuna scelta!");
            }
            input.nextLine();
            System.out.println("Vuoi continuare nel menu: ");
            no = input.nextLine();

        } while (no.equalsIgnoreCase("si"));

        input.close();
    }
}