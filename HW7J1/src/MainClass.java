public class MainClass {
    public static void main(String[] args) {
        Cat[]cats = new Cat[5];
        cats[0] = new Cat("Барсик", 10);
        cats[1] = new Cat("Рыжик", 8);
        cats[2] = new Cat("Том", 30);
        cats[3] = new Cat("Васька", 25);
        cats[4] = new Cat("Бакс", 11);

        Plate p1 = new Plate(50);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(p1);
            cats[i].printInfo();
        }

        p1.info();
        p1.addFood(20);
        p1.info();

    }
}
