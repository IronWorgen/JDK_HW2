import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Developer> developerList = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0 && i % 3 != 0) {
                developerList.add(new FullStack(String.format("%d. fullStack", i), i, new BigDecimal(i * 10)));
            } else if (i % 3 == 0) {
                developerList.add(new BackendDeveloper(String.format("%d. backend", i), i, new BigDecimal(i * 10)));
            }else {
                developerList.add(new FrontendDeveloper(String.format("%d. frontend", i), i, new BigDecimal(i * 10)));
            }
        }
        developerList.stream().forEach(System.out::println);
        System.out.println("========================");
        developerList.stream().forEach(x->{
            if (x instanceof FrontendDeveloper ){
                ((FrontendDeveloper) x).doGUI();
            }else if(x instanceof FullStack ){
                ((FullStack) x).doGUI();
            }
        });
    }
}