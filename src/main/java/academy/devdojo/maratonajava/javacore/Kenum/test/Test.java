package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoPagamento;

public class Test {
    public static void main(String[] args) {

        Cliente cliente01 = new Cliente("Tsubaza", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente02 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente01);
        System.out.println(cliente02);
        System.out.println(TipoPagamento.CREDITO.calculaDesconto(100));
        System.out.println(TipoPagamento.DEBITO.calculaDesconto(100));

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente);

        TipoCliente tipoCliente1 = TipoCliente.relatorioClientePorNatureza("Pessoa Física");
        TipoCliente tipoCliente2 = TipoCliente.relatorioClientePorNatureza("Pessoa Físicae2e2");
        System.out.println(tipoCliente1);
        System.out.println(tipoCliente2);
    }
}
