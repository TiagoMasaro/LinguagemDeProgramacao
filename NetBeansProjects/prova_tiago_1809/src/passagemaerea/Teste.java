/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passagemaerea;

/**
 *
 * @author 12968505602
 */
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o nome do passageiro:");
            String nome = scanner.nextLine();

            System.out.println("Digite o documento do passageiro:");
            String documento = scanner.nextLine();

            Passageiro passageiro = new Passageiro(nome, documento);

            System.out.println("Digite o destino do voo:");
            String destino = scanner.nextLine();

            System.out.println("Digite o preço do voo:");
            double preco = scanner.nextDouble();

            System.out.println("O voo é nacional ou internacional? (n/i)");
            char tipoVoo = scanner.next().charAt(0);

            Voo voo;
            if (tipoVoo == 'n') {
                voo = new VooNacional(destino, preco);
            } else {
                voo = new VooInternacional(destino, preco);
            }

            SistemaReserva sistema = new SistemaReserva();
            sistema.criarReserva(passageiro, voo);

        } catch (Exception e) {
            System.out.println("Erro ao criar a reserva: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}