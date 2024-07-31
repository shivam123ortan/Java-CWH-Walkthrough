abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{
    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("Changing the nib");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Bitting...");
    }
}

class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Speaking...");
    }
    @Override
    public void eat(){
        System.out.println("Eating...");
    }
    @Override
    public void sleep(){
        System.out.println("Sleeping");
    }
}
public class Q1_2_3_5 {
    public static void main(String[] args) {
        // Q1 and Q2
        FountainPen f = new FountainPen();
        f.changeNib();

        //Q3
        Human shivam = new Human();
        shivam.sleep();

        //Q5
        Monkey m1 = new Human();
        // m1.speak(); --> Throws error because reference is monkey which does not have speak method.
        m1.jump();

        BasicAnimal lovish = new Human();
        // lovish.speak(); --> error
        lovish.eat();
        lovish.sleep();
    }    
}
