package MemberVariableDeclaration;

class Car
{
    float speed;
    float distanceCovered;

}

public class Main
{
    public static void main(String[] args)
    {
        Car thar = new Car();
        thar.speed = 200;
        thar.distanceCovered = 0;
        System.out.println(thar.speed);
        System.out.println(thar.distanceCovered);
    }
}