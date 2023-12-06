import java.math.BigDecimal;

public class BackendDeveloper extends Developer implements Backend{
    public BackendDeveloper(String name, int age, BigDecimal salary) {
        super(name, age, salary);
    }

    @Override
    public void createDB() {
        System.out.println(" бэкенд разработчик создает базу данных");
    }

    @Override
    public void tuningServer() {
        System.out.println("бэкенд разработчик настраивает сервер");
    }

}
