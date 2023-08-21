package main.java.list.OperacoesBasicas;

public class Item {
    private String nome;
    private double preco;
    private int quantidade;

    public Item(String nome, Double preco, Integer quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public String getNome() {
        return nome;
    }
    public Double getPreco() {
        return preco;
    }
    public Integer getQuantidade() {
        return quantidade;
    }
    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
