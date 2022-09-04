import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner entradad2 = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        freedomService freedomService = new freedomService();
        int option;
        do {
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("                                 Freedom                                 ");
            System.out.println("-------------------------------------------------------------------------");
            System.out.println(" 1 - Ver cidades");
            System.out.println(" 2 - Buscar passagem");
            System.out.println(" 3 - Lista de passagens nacionais");
            System.out.println(" 4 - Lista de passagens internacionais");
            System.out.println(" 0 - Sair");
            System.out.println("___");
            System.out.print("Escolha: ");
            option = entrada.nextInt();

            
            switch (option) {
                case 1 -> {
                	freedomService.buscarCidade();
                }
                case 2 -> {
                    System.out.println("Qual o seu destino? ");
                    String nomeCidade = entradad2.nextLine();
                    freedomService.buscarPassagem(nomeCidade);
                }
                case 3 -> {
                	freedomService.buscarPassagemNacionais();
                }
                case 4 -> {
                	freedomService.buscarPassagemInternacional();
                }
            }
            System.out.println("");
        } while (option != 0);
entrada.close();
entradad2.close();

    }
}