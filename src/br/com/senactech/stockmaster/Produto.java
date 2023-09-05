package br.com.senactech.stockmaster;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import br.com.senactech.stockmaster.Movimentacao;

public class Produto extends Movimentacao{
    private String nome;
    private String descricao;
    private String codigoBarras;
    private double precoVenda;
    private double precoCompra;
    private int quantidadeEstoque;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    //    public void lucro(Produto produto){
    //        double dif = produto.getPrecoVenda() - produto.getPrecoCompra();
    //        DecimalFormat df = new DecimalFormat("#.00");
    //        String valorFormatado = df.format(dif);
    //        System.out.println("Lucro do"+produto.getNome()+" é de R$"+valorFormatado);
    //    }
    // Implementação de padrao observer
        public void exibirNotificacao(String texto) {
            String titulo = "Alerta!";
            int duracao = 5000; // Duração em milissegundos

            JPanel panel = new JPanel();
            JTextField textField = new JTextField(20);
            textField.setText(texto);
            panel.add(textField);

            JWindow janelaNotificacao = new JWindow();
            janelaNotificacao.getContentPane().add(panel);
            janelaNotificacao.setSize(300, 100);
            janelaNotificacao.setLocation(
                    Toolkit.getDefaultToolkit().getScreenSize().width - janelaNotificacao.getWidth(),
                    Toolkit.getDefaultToolkit().getScreenSize().height - janelaNotificacao.getHeight());
            janelaNotificacao.setVisible(true);

            Timer timer = new Timer(duracao, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    janelaNotificacao.dispose();
                }
            });
            timer.setRepeats(false);
            timer.start();
        }
}



