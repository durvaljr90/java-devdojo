package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoPagamento {
    DEBITO {
        @Override
        public double calculaDesconto(double desconto) {
            return desconto * 0.1;
        }
    },
    CREDITO {
        @Override
        public double calculaDesconto(double desconto) {
            return desconto * 0.05;
        }
    };

    public abstract double calculaDesconto(double desconto);
}
