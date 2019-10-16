import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Acucar extends AdicionalDecorator {
    Bebida bebida;

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Açucar doce";
    }

    @Override
    public double custo() {
        return bebida.custo() + 1.50;
    }
}
