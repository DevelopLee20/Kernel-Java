//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void add(String name){
        name += "123";
    }

    public static void main(String[] args) {
        String name = "123";

        add(name);

        System.out.println(name);
    }
}