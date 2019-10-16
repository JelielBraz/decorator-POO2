import java.util.Scanner;

public class resacasBar {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);


        System.out.println("---------------RESACAS BAR-------------");
        System.out.println("Lista de Bebidas \n " +
                "1 = Cachaca \n" +
                "2 = Vodka \n" +
                "3 = Saque \n" +
                "4 = Caipirinha \n" );
        int valorBebida = leitura.nextInt();
        System.out.println(valorBebida);


        switch (valorBebida) {
            case 1:
                Bebida cachaca = new Cachaca();
                cachaca = adicionarComplementos(cachaca);
                System.out.println(cachaca.getDescricao() + " R$: " + cachaca.custo());
                break;
            case 2:
                Bebida vodka = new Vodka();
                vodka = adicionarComplementos(vodka);
                System.out.println(vodka.getDescricao() + " R$: " + vodka.custo());
                break;
            case 3:
                Bebida saque = new Saque();
                saque = adicionarComplementos(saque);
                System.out.println(saque.getDescricao() + " R$: " + saque.custo());
                break;
            case 4:
                Bebida caipirinha = makeCaipirinha();
                System.out.println(caipirinha.getDescricao() + " R$: " + caipirinha.custo());
        }

    }

    private static Bebida adicionarComplementos(Bebida bebida) {
        Scanner leitura = new Scanner(System.in);
        Integer valorAdicional = 14;
        while (!valorAdicional.equals(0)) {
            System.out.println("Nossa Lista de Acompanhamentos: \n" +
                    "1- ACUCAR \n" +
                    "2- KIWI \n" +
                    "3- ABACAXI\n" +
                    "4- MORANGO\n" +
                    "5- LIMAO \n" +
                    "6- ADOCANTE\n" +
                    "7- GELO\n" +
                    "0- Fim da operação\n");
            valorAdicional = leitura.nextInt();
            switch (valorAdicional) {
                case 1:
                    bebida = new Acucar(bebida);
                    break;
                case 2:
                    bebida = new Kiwi(bebida);
                    break;
                case 3:
                    bebida = new Abacaxi(bebida);
                    break;
                case 4:
                    bebida = new Morango(bebida);
                    break;
                case 5:
                    bebida = new Limao(bebida);
                    break;

                case 6:
                    bebida = new Adocante(bebida);
                    break;
                case 7:
                    bebida = new Gelo(bebida);
                    break;
                case 0:
                    break;
            }
        }
        return bebida;
    }

    public static Bebida makeCaipirinha() {
        Bebida caipirinha = new Cachaca();
        caipirinha = new Limao(caipirinha);
        caipirinha = new Gelo(caipirinha);
        caipirinha = new Acucar(caipirinha);
        return caipirinha;
    }
}
