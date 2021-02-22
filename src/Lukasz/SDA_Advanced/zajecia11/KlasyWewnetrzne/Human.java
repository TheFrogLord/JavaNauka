package Lukasz.SDA_Advanced.zajecia11.KlasyWewnetrzne;

public class Human {

    private int age;
    private int bodyWeight;
    private Brain brain;

    public Human(int age, int bodyWeight) {
        this.age = age;
        this.bodyWeight = bodyWeight;
    }

    public void setBrain(Brain brain) {
        this.brain = brain;
    }

    public void showHumanDetails() {
        System.out.println("Age : " + age);
        System.out.println("Weight : " + bodyWeight);
        brain.showDetails();
    }

    public class Brain {
        private int weight;

        public Brain(int weight) {
            this.weight = weight;
        }

        public int getWeight() {
            return weight;
        }

        public void showDetails() {
            System.out.println("Brain weight: " + weight);
            System.out.println("Brain is "
                    + (((double)weight/bodyWeight) * 100) + "% of body weight");
        }
    }

}
