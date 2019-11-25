import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
        ArrayList<Hero> heroes = new ArrayList<>();

        // TODO 2 : Add those heroes to the list
        // name: Black Widow, age: 34
        // name: Captain America, age: 100
        // name: Vision, age: 3
        // name: Iron Man, age: 48
        // name: Scarlet Witch, age: 29
        // name: Thor, age: 1500
        // name: Spider-Man, age: 18
        // name: Hulk, age: 49
        // name: Doctor Strange, age: 42
        heroes.add(new Hero("Black Widow", 34));
        heroes.add(new Hero("Captain America", 100));
        heroes.add(new Hero("Vision", 3));
        heroes.add(new Hero("Iron Man", 48));
        heroes.add(new Hero("Scarlet Witch", 29));
        heroes.add(new Hero("Thor", 1500));
        heroes.add(new Hero("Spider-Man", 18));
        heroes.add(new Hero("Hulk", 49));
        heroes.add(new Hero("Doctor Strange", 42));

        // TODO 3 : It's Thor birthday, now he's 1501
        heroes.get(5).setAge(1501);

        // TODO 4 : Shuffle the heroes list
        Collections.shuffle(heroes);

        // TODO 5 : Keep only the half of the list
        /*int half = (heroes.size() + 1) / 2;
        for (int i = 0; i < half; i++) {
            heroes.remove(heroes.size()-1);
        }
        better ---->
        */
        heroes.subList((heroes.size()) / 2, heroes.size()).clear();

        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        for (Hero hero : heroes) {
            System.out.println(hero.getName());
        }

        /* Clone-Test
        System.out.println(heroes.get(5).getAge());
        List<Hero> list2 = (ArrayList) heroes.clone();
        list2.remove(0);
        list2.get(4).setAge(1502);
        System.out.println(heroes.get(5).getAge());
        */
    }
}