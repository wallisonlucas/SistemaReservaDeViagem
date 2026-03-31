import facade.ViagemFacade;
import model.Cliente;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------");
        ViagemFacade facade = new ViagemFacade();
        Cliente cliente1 = new Cliente("João", "joao@email.com");
        facade.reservasViagem(cliente1, "Recife");
        System.out.println("------------------------------------------------------------");
        Cliente cliente2 = new Cliente("Maria", "maria@email.com");
        facade.reservasViagem(cliente2, "São Paulo");
        System.out.println("------------------------------------------------------------");
    }
}