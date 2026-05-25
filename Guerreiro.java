package personagens;

import enums.ClassePersonagem;

/**
 * Exercício 2 - Herança e Construtor
 * Exercício 3 - Sobrecarga de método
 *
 * Guerreiro estende Personagem, adicionando o atributo tipoArma
 * e três versões sobrecarregadas do método atacar().
 */
public class Guerreiro extends Personagem {

    // -------------------------------------------------------
    // Atributo adicional (Exercício 2)
    // -------------------------------------------------------
    private String tipoArma;

    // -------------------------------------------------------
    // Construtor (Exercício 2)
    // Chama super() repassando os dados comuns ao Personagem
    // e inicializa o atributo próprio da subclasse.
    // -------------------------------------------------------
    public Guerreiro(String nome, int nivel, int pontosDeVida, String tipoArma) {
        super(nome, nivel, pontosDeVida, ClassePersonagem.GUERREIRO);
        this.tipoArma = tipoArma;
    }

    // -------------------------------------------------------
    // Exercício 2 — Sobrescrita de atacar()
    // Impressão: "[nome] ataca com [tipoArma]!"
    // -------------------------------------------------------
    @Override
    public void atacar() {
        System.out.println(getNome() + " ataca com " + tipoArma + "!");
    }

    // -------------------------------------------------------
    // Exercício 3 — Sobrecarga 1: atacar(int dano)
    // Impressão: "[nome] ataca causando [dano] de dano!"
    // -------------------------------------------------------
    public void atacar(int dano) {
        System.out.println(getNome() + " ataca causando " + dano + " de dano!");
    }

    // -------------------------------------------------------
    // Exercício 3 — Sobrecarga 2: atacar(int dano, String alvo)
    // Impressão: "[nome] ataca [alvo] causando [dano] de dano!"
    // -------------------------------------------------------
    public void atacar(int dano, String alvo) {
        System.out.println(getNome() + " ataca " + alvo + " causando " + dano + " de dano!");
    }

    // -------------------------------------------------------
    // Exercício 2 — Sobrescrita de exibirInfo()
    // Chama super.exibirInfo() e acrescenta a linha do tipo de arma.
    // -------------------------------------------------------
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Arma: " + tipoArma);
    }

    // Getter do atributo próprio
    public String getTipoArma() {
        return tipoArma;
    }
}
