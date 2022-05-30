import java.util.Scanner;

public class SIM extends Giogex {
    private int numero;
    private int traffico;
    private static Long tempo;
    private Long istante = 0L;
    private static boolean incall;
    public SIM(){
        super();
    }
    public void azzeraTempoCall(){
        synchronized (this){
            tempo = 0L;
            incall = false;
        }
    }

    public long tempoCall(){
        synchronized (this){
            return incall ? tempo + System.currentTimeMillis() - istante
                    : tempo;
        }
    }

    public void startCall(){
        synchronized (this){
            long avvia = System.currentTimeMillis();
            incall = true;
        }
    }

    public void chiama(String numeroDaChiamare){
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il numero da chiamare: ");
        String tel = input.nextLine();
        System.out.println("Il numero da chiamare: " + tel + " è corretto?");
        String domanda = input.nextLine();
        if (domanda.equalsIgnoreCase("Si")){
        azzeraTempoCall();
        startCall();
        tempoCall();

        System.out.println("Vuoi terminare la chiamata?");

        }
        else {
            System.out.println("Vuoi reinserire il numero?");
            String proposta = input.nextLine();
            if (proposta.equalsIgnoreCase("Si")){
                chiama(numeroDaChiamare);
            }
            else{
                proposta.equalsIgnoreCase("No");
            }
        }
    }

}
