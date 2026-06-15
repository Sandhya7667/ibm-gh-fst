class Human {

    private static int population = 0;

    public Human() {
        population++;
    }

    public void walking() {
        System.out.println("Human is walking:");
    }

    public void talking() {
        System.out.println("Human is talking");
    }

    public static int getPopulation() {
        return population;
    }
}

class Boy extends Human {
    @Override
    public void walking() {
        System.out.println("boy is walking:");
    }

    public void talking() {
        System.out.println("boy is talking");
    }
}

class Girl extends Human {
    @Override
    public void walking() {
        System.out.println("girl is walking:");
    }

    public void talking() {
        System.out.println("girl is talking");
    }
}

class Robot extends Human {
    @Override
    public void walking() {
        System.out.println("robot is walking:");
    }

    public void talking() {
        System.out.println("robot is talking");
    }
}

public class Activity {

    public static void main(String[] args) {

        Boy b1 = new Boy();
        Boy b2 = new Boy();
        Boy b3 = new Boy();

        Girl g1 = new Girl();
        Girl g2 = new Girl();
        Girl g3 = new Girl();

        Robot r1 = new Robot();
        Robot r2 = new Robot();
        Robot r3 = new Robot();

        System.out.println("Human population: " + Human.getPopulation());
    }
}