class Vehicle
{  
    void speed(int s)
    {
        System.out.println("Speed of Vehicle is "+ s);
    }
    void run()
    {
        System.out.println("Vehicle is running");
    }  
}  
class Bike extends Vehicle
{  
    void speed(int s, String bikeName)
    {
        System.out.println("Speed of "+bikeName+" bike is "+ s);
    }

    void run()
    {

        System.out.println("Bike is running safely");

    }  
  
    
}
class Car
{
    public static void main(String args[])
    {  
        // Bike obj = new Bike();  
        // obj.speed(5,"Pulsar");
        // obj.run();  

        // Vehicle v = new Vehicle();
        // v.speed(5);
        // v.run();



        Bike v1 = new Bike();
        v1.speed(4);
        v1.speed(5,"KTM");
        v1.run();
    }  
}