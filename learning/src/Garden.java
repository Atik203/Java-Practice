abstract class Garden {
    private int no_of_tree;

    public Garden(int no_of_tree) {
        this.no_of_tree = no_of_tree;
    }

    public int getNoOfTree() {
        return no_of_tree;
    }

    public void setNoOfTree(int no_of_tree) {
        this.no_of_tree = no_of_tree;
    }

    public abstract double findPrice(double weight);
}

class Mango extends Garden {
    private double price;

    public Mango(int no_of_tree, double price) {
        super(no_of_tree);
        this.price = price;
    }


    @Override
    public double findPrice(double weight) {
        return weight * price * getNoOfTree();
    }
}

class Guava extends Garden {
    private double price;

    public Guava(int no_of_tree, double price) {
        super(no_of_tree);
        this.price = price;
    }

    @Override
    public double findPrice(double weight) {
        return weight * price * getNoOfTree();
    }
}
class Black_berry extends Garden {
    private double price;

    public Black_berry(int no_of_tree, double price) {
        super(no_of_tree);
        this.price = price;
    }

    @Override
    public double findPrice(double weight) {
        return weight * price * getNoOfTree();
    }
}

class TestGarden {
    public static void main(String[] args) {
        Garden[] fruits = new Garden[3];
        fruits[0] = new Mango(100, 60);
        fruits[1] = new Guava(50, 50);
        fruits[2] = new Black_berry(25, 150);

        double mangoPrice = fruits[0].findPrice(200);
        double guavaPrice = fruits[1].findPrice(300);
        double black_berryPrice = fruits[2].findPrice(400);

        double totalPrice = mangoPrice + guavaPrice + black_berryPrice;

        double avgPrice = totalPrice / 3;

        System.out.println("Average price of fruits: " + avgPrice);


    }
}