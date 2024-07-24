import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AppTest
{
    @SuppressWarnings("unused")
    public static void main(String[] args)
    {
        List<computer> assets = new ArrayList<>();

        assets.add(new computer("Lenovo", "Ideapad gaming 3", 1200.0));
        assets.add(new computer("Apple", "Macbook", 1300.0));
        assets.add(new computer("Dell", "Inspirion", 1800.0));

        Admin admin = new Admin(assets);

        List<computer> assets2 = new ArrayList<>();

        assets2.add(new computer("", "Ideapad gaming 3", 1000.0));
        assets2.add(new computer("Acer", "Macbook", 1000.0));
        assets2.add(new computer("Xiaomi", "Inspirion", 1000.0));

        Admin admin2 = new Admin(assets2);

        List<Admin> allVPUAdmins = Arrays.asList(admin, admin2);

        List test = allVPUAdmins.stream()
            .flatMap((adm) -> {return adm.getAssests().stream();})
            .filter((comp) -> {return comp.getPrice() > 1100.0;})
            .collect(Collectors.toList());

        System.out.println(test.toString());





        // allVPUAdmins.stream()
        // .map(Admin::getAssests)
        // .flatMap(List::stream)
        // .filter((comp) -> {return comp.getPrice() > 1100.0;})
        // .collect(Collectors.toList());



    }
}