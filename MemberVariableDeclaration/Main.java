package MemberVariableDeclaration;

class Car
{
    float speed; 
    float distanceCovered;
     
    public float getSpeed()
    {
        return this.speed;
    }

    void setSpeed( float speed1 )
    {
        speed = speed1;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Car thar = new Car();
        thar.speed = 200;
        thar.distanceCovered = 0;
        thar.setSpeed(140);
        System.out.println(thar.getSpeed());
        System.out.println(thar.distanceCovered);
    }
}