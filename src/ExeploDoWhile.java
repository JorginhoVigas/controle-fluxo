import java.util.random;
public class ExeploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");
        do{
            System.out.println("Telefone tocando");
        }while(tocando());
    }

    private static boolean tocando(){
        boolean atendeu = new Random().nexInt(3) == 1;
        System.out.println("Atendeu ?" + atendeu);
        return ! atendeu;

    }
    
}
