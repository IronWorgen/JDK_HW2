import java.math.BigDecimal;

public class FullStack extends Developer implements Frontend, Backend {
    public FullStack(String name, int age, BigDecimal salary) {
        super(name, age, salary);
    }

    @Override
    public void doGUI() {
        System.out.println("фуллстек  разработчик делает интерфейс");
    }

    @Override
    public void createDB() {
        System.out.println("фуллстек  разработчик создает базу данных");
    }

    @Override
    public void tuningServer() {
        System.out.println("фуллстек  разработчик настраивает сервер");
    }
}
