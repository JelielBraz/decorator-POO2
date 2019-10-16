import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Abacaxi extends AdicionalDecorator {
    Bebida bebida;

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Abacaxi Rei";
    }

    @Override
    public double custo() {
        return bebida.custo() + 4.50;
    }
}
