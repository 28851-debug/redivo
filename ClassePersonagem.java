package enums;

/**
 * Exercício 1 - Enum ClassePersonagem
 *
 * Cada constante possui:
 *   - codigo       : identificador numérico da classe
 *   - nomeExibicao : texto formatado para exibição ao usuário
 */
public enum ClassePersonagem {

    // Constantes com seus respectivos código e nome de exibição
    GUERREIRO(1, "Guerreiro"),
    MAGO(2, "Mago"),
    ARQUEIRO(3, "Arqueiro");

    // -------------------------------------------------------
    // Atributos
    // -------------------------------------------------------
    private final int codigo;
    private final String nomeExibicao;

    // -------------------------------------------------------
    // Construtor (privado por padrão em enums)
    // -------------------------------------------------------
    ClassePersonagem(int codigo, String nomeExibicao) {
        this.codigo = codigo;
        this.nomeExibicao = nomeExibicao;
    }

    // -------------------------------------------------------
    // Getters
    // -------------------------------------------------------
    public int getCodigo() {
        return codigo;
    }

    public String getNomeExibicao() {
        return nomeExibicao;
    }
}
