package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemlist;

    public CarrinhoDeCompras() {
        this.itemlist = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        this.itemlist.add(item);
    }
    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemlist.isEmpty()){
            for(Item i : itemlist){
                if (i.getNome().equalsIgnoreCase(nome)){
                    itensParaRemover.add(i);
                }
            }
            itemlist.removeAll(itensParaRemover);
        }else {
        System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal(){
        double valorTotal = 0.0;
        if(!itemlist.isEmpty()){
            for(Item i : itemlist){
                double valorItem = i.getPreco() * i.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        }else{
            throw new RuntimeException("A lista está vazia!!");
        }
    }
    public void exibirItens(){
        if(!itemlist.isEmpty()){
            System.out.println(this.itemlist);
        } else {
            System.out.println("A lista está vazia!!!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itemlist=" + itemlist +
                '}';
    }

    //main para teste
    /*public static void main(String[] args){
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2.0, 2);

        carrinhoDeCompras.exibirItens();
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.removerItem("Lápis");
        carrinhoDeCompras.exibirItens();
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }*/



}
