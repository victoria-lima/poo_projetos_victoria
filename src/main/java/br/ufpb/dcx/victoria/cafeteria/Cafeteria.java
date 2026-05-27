package br.ufpb.dcx.victoria.cafeteria;

public class Cafeteria {
    private String nome;
    private String endereco;
    private int quantidadedeMesas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getQuantidadedeMesas() {
        return quantidadedeMesas;
    }

    public void setQuantidadedeMesas(int quantidadedeMesas) {
        this.quantidadedeMesas = quantidadedeMesas;
    }

    public Cafeteria(String nome, String endereco, int quantidadedeMesas){
        this.nome = nome;
        this.endereco = endereco;
        this.quantidadedeMesas = quantidadedeMesas;


    }

}

