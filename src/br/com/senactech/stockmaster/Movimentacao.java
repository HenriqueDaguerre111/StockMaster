package br.com.senactech.stockmaster;
import java.text.DecimalFormat;
//


public class Movimentacao {
    private Produto produto;

    public void saida(int quantidade, Produto produto){
        produto.setQuantidadeEstoque(produto.getQuantidadeEstoque()-quantidade);
        double valorVendido = quantidade * produto.getPrecoVenda();
        DecimalFormat df = new DecimalFormat("#.00");
        String valorFormatado = df.format(valorVendido);
        System.out.println("Valor vendido: R$" + valorFormatado);
        produto.exibirNotificacao("Valor vendido: R$" + valorFormatado);



        //verifica disponibilidade
        if(produto.getQuantidadeEstoque() < 50){
            System.out.println(produto.getNome()+" Precisa de reposição!");
            produto.exibirNotificacao(produto.getNome()+" Precisa de reposição!");
        }
    }

    public void entrada(int quantidade,Produto produto){
        produto.setQuantidadeEstoque(produto.getQuantidadeEstoque()+quantidade);
        produto.exibirNotificacao(quantidade+" de "+produto.getNome() +" incluido no estoque");
    }
// vai ser desenvolvido diretamente pelo banco de dados
//    public void contabilidade(Produto produto) {
//        double valorEstoque = produto.getQuantidadeEstoque() * produto.getPrecoVenda();
//        DecimalFormat df = new DecimalFormat("#.00");
//        String valorFormatado = df.format(valorEstoque);
//        System.out.println("Valor disponível em estoque: R$" + valorFormatado);
//         }


}

