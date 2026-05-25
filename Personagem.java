package personagens;

import enums.ClassePersonagem;

/**
 * Classe abstrata base fornecida pelo professor.
 * NÃO modificar este arquivo.
 */
public abstract class Personagem {

    private String nome;
    private int nivel;
    private int pontosDeVida;
    private ClassePersonagem classe;

    public Personagem(String nome, int nivel, int pontosDeVida, ClassePersonagem classe) {
        this.nome = nome;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.classe = classe;
    }

    // Método abstrato — cada subclasse define seu próprio comportamento de ataque
    public abstract void atacar();

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Nivel: " + nivel);
        System.out.println("Vida: " + pontosDeVida);
        System.out.println("Classe: " + classe.getNomeExibicao());
    }

    // Getters
    public String getNome()               { return nome; }
    public int getNivel()                 { return nivel; }
    public int getPontosDeVida()          { return pontosDeVida; }
    public ClassePersonagem getClasse()   { return classe; }
}
