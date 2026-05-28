package br.ufpb.dcx.victoria.cafeteria;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Cafeteria [nome=" + nome + ", endereco=" + endereco + ", mesas=" + quantidadedeMesas + "]";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cafeteria cafeteria = (Cafeteria) o;
        return quantidadedeMesas == cafeteria.quantidadedeMesas &&
                Objects.equals(nome,cafeteria.nome) &&
                Objects.equals(endereco, cafeteria.endereco);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nome, endereco,quantidadedeMesas);
    }
    public boolean ehGrande() {
        return this.quantidadedeMesas > 10;
    }
}