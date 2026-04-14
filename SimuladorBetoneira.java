import java.util.Scanner;

public class SimuladorBetoneira {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double pesoALvo = 500.0;
        double pesoAtual = 0.0;
        int ciclo = 0;

        System.out.println("--- INICIANDO CARREGAMENTO DE AGREGADOS ---");

        System.out.println("Meta: " + pesoALvo + " kg de Brita 1.");

        do {
            System.out.println("Digite o peso da Brita 1 adicionada (kg): ");
            double pesoAdicionado = sc.nextDouble();
            pesoAtual += pesoAdicionado;
            ciclo++;
           
            System.out.println("Peso atual: " + pesoAtual + " kg");

            if (pesoAtual >= pesoALvo) {
                System.out.println("Meta atingida em " + ciclo + " ciclos!");
                break;
            }
        } while (true);

        if (pesoAtual > pesoALvo * 1.05) {
            System.out.println("Cuidado! você ultrapassou a meta em mais de 5%.");
            System.out.println("Pode estar com problemas de estabilidade.");
        } else {
            System.out.println("Peso dentro do limite aceitável");
        }

        sc.close();

    }
}
