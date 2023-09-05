import br.com.senactech.stockmaster.Produto;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //padrao solid Single Responsibility Principle

        Produto sal = new Produto();
        sal.setNome("Sal Cristal");
        sal.setCodigoBarras("256");
        sal.setDescricao("Sal cristal");
        sal.setPrecoVenda(3.75);
        sal.setQuantidadeEstoque(200);
        sal.setPrecoCompra(2.00);

        sal.saida(2,sal);
        sal.saida(2,sal);
        sal.saida(2,sal);
        sal.saida(2,sal);
        sal.entrada(20,sal);
        sal.entrada(20,sal);
        sal.entrada(203,sal);
        sal.entrada(2,sal);
        sal.entrada(2,sal);

        System.out.println(sal.getQuantidadeEstoque());




        Produto mouse = new Produto();
        mouse.setNome("mouse hiperx");
        mouse.setCodigoBarras("257");
        mouse.setDescricao("Mouse HiperX");
        mouse.setPrecoVenda(145.85);
        mouse.setPrecoCompra(100.20);
        mouse.setQuantidadeEstoque(200);
        


        mouse.saida(8,mouse);
        mouse.saida(8,mouse);
        mouse.saida(8,mouse);
        mouse.saida(8,mouse);
        mouse.saida(8,mouse);
        mouse.saida(8,mouse);
        mouse.saida(8,mouse);




        sal.entrada(2,sal);
        sal.entrada(2,sal);
        sal.entrada(2,sal);
        sal.entrada(2,sal);
        sal.entrada(2,sal);
        sal.entrada(2,sal);
        sal.entrada(2,sal);
        sal.entrada(2,sal);



    }
    }
