import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Adocante extends AdicionalDecorator {
    Bebida bebida;

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Adoçante Hipercalorico";
    }

    @Override
    public double custo() {
        return bebida.custo() + 5.00;
    }
}
