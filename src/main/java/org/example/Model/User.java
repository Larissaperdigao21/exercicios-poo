package org.example.Model;

public class User {
    //ATRIBUTOS
    private String nome;
    private String profissao;
    private int idade;

    //METODOS ESPECIAIS (GET E SET)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    //METODO PUBLICO PARA OBTER AS INFORMACOES DO USER
    @Override
    public String toString() {
        return "User{" +
                "nome='" + nome + '\'' +
                ", profissao='" + profissao + '\'' +
                ", idade=" + idade +
                '}';
    }
}
