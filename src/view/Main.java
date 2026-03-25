import java.util.Scanner;
import model.Cliente;
import service.BarbeariaService;
public class Main {
       public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BarbeariaService service = new BarbeariaService();

        int opcao;

        do {
            System.out.println("\n=== SISTEMA BARBEARIA ===");
            System.out.println("1 - Novo Agendamento");
            System.out.println("2 - Listar Agendamentos");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do cliente: ");
                    String nome = scanner.nextLine();

                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();

                    System.out.print("Data: ");
                    String data = scanner.nextLine();

                    System.out.print("Horário: ");
                    String horario = scanner.nextLine();

                    Cliente cliente = new Cliente(nome, telefone);
                    service.agendar(cliente, data, horario);

                    System.out.println("✅ Agendamento concluido com sucesso!");
                    break;

                case 2:
                    service.ListarAgendamentos();
                    break;
            }

        } while (opcao != 0);

        scanner.close();
    } 
}
