class Chicken extends FarmAnimal {

    private String sound;

    public Chicken(String name, String gender, double weight, int age){
        super(name, gender, weight, age);

        if (gender.equals("male")) {
        this.sound = "Cock-a-Doodle-doo";
        } else {
        this.sound = "Cluck Cluck";
        }
    }

    @Override
    public String feedLoadingSchedule() {
        return "8am-4pm";
    }

    @Override
    public String toString() {
        return "Chicken " + this.sound + " " + super.toString();
    }
}