import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Gelo extends AdicionalDecorator {
    Bebida bebida;

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Gelo gelado";
    }

    @Override
    public double custo() {
        return bebida.custo() + 1.00;
    }
}
