import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Bebida {
    private String descricao= "Bebida";
    public abstract double custo();
}
