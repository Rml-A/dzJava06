



public class OOPMain {

    public static void main(String[] args) {
        Cat murzik = new Cat("Murzik", 100, 5);
        Plate plate = new Plate(20);

        System.out.println(murzik);
        System.out.println(plate);

        murzik.eat(plate);
        

        System.out.println(murzik);
        System.out.println(plate);


        // Cat first = new Cat("Name", 150);
        // Cat second = new Cat("Name", 100);

        // System.out.println(first == second); // false
        // System.out.println(first.equals(second));

        // System.out.println(first.hashCode());
        // System.out.println(second.hashCode());

        // HashSet<Cat> cats = new HashSet<>();
        // cats.add(first);
        // cats.add(second);
        // System.out.println(cats);

    }

}
