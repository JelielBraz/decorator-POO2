import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Limao extends AdicionalDecorator {
    Bebida bebida;

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Limao azedo";
    }

    @Override
    public double custo() {
        return bebida.custo() +  2.00;
    }
}
