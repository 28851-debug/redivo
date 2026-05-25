import personagens.Guerreiro;

/**
 * Exercício 4 - Main
 *
 * Demonstra a criação de dois Guerreiros, as três versões de atacar()
 * e a comparação de pontos de vida entre eles.
 */
public class Main {

    public static void main(String[] args) {

        // -------------------------------------------------------
        // 1. Criar dois objetos Guerreiro com nomes e armas diferentes
        // -------------------------------------------------------
        Guerreiro guerreiro1 = new Guerreiro("Aragorn", 10, 150, "Espada Longa");
        Guerreiro guerreiro2 = new Guerreiro("Brom",    7,  90, "Machado de Guerra");

        // -------------------------------------------------------
        // Exibir informações completas de cada guerreiro
        // -------------------------------------------------------
        System.out.println("===== Ficha: " + guerreiro1.getNome() + " =====");
        guerreiro1.exibirInfo();

        System.out.println();

        System.out.println("===== Ficha: " + guerreiro2.getNome() + " =====");
        guerreiro2.exibirInfo();

        System.out.println();

        // -------------------------------------------------------
        // 2. Chamar as três versões de atacar() no primeiro guerreiro
        // -------------------------------------------------------
        System.out.println("===== Ações de " + guerreiro1.getNome() + " =====");

        // atacar()                — sem parâmetros
        guerreiro1.atacar();

        // atacar(int dano)        — com valor de dano
        guerreiro1.atacar(35);

        // atacar(int dano, String alvo) — com dano e alvo
        guerreiro1.atacar(50, guerreiro2.getNome());

        System.out.println();

        // -------------------------------------------------------
        // 3. Comparar pontos de vida e imprimir qual está em melhor estado
        // -------------------------------------------------------
        System.out.println("===== Comparação de Vida =====");
        System.out.println(guerreiro1.getNome() + " -> " + guerreiro1.getPontosDeVida() + " PV");
        System.out.println(guerreiro2.getNome() + " -> " + guerreiro2.getPontosDeVida() + " PV");

        if (guerreiro1.getPontosDeVida() > guerreiro2.getPontosDeVida()) {
            System.out.println(guerreiro1.getNome() + " esta em melhor estado!");
        } else if (guerreiro2.getPontosDeVida() > guerreiro1.getPontosDeVida()) {
            System.out.println(guerreiro2.getNome() + " esta em melhor estado!");
        } else {
            System.out.println("Ambos os guerreiros possuem a mesma quantidade de vida!");
        }
    }
}
