public class Cat {
    private String name;
    private int appetite;
    private boolean full;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.full = false;
    }

    public void eat(Plate p) {
        if (p.getFood() >= appetite) {
            p.decreaseFood(appetite);
            this.full = true;
        }
    }

    public boolean isFull() {
        return full;
    }

    public void printInfo(){
        if (isFull()) {
            System.out.println("Кот " +name+ " сыт.");
        } else {
            System.out.println("Кот " +name+ " голоден.");
        }

    }

}
