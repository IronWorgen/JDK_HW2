import java.math.BigDecimal;

public class FrontendDeveloper extends Developer implements Frontend{
    public FrontendDeveloper(String name, int age, BigDecimal salary) {
        super(name, age, salary);
    }

    @Override
    public void doGUI() {
        System.out.println("фронтенд разработчик делает интерфейс");
    }
}
