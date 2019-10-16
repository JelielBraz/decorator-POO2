import lombok.AllArgsConstructor;

@AllArgsConstructor
public  class Kiwi extends AdicionalDecorator {
    Bebida bebida;

    @Override
    public String getDescricao() {
        return bebida.getDescricao() +  ", Kiwi com vitaminas";
    }

    @Override
    public double custo() {
        return bebida.custo() + 6.00;
    }
}
