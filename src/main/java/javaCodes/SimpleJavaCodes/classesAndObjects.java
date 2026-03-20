package javaCodes.SimpleJavaCodes;

public class classesAndObjects {

    public static class Car{
        public void Type()
        {
            System.out.println("This is inside Car");
        }
    }

    public static class Audi  extends Car
    {
        public void AudiType()
        {
            System.out.println("This is inside Audi");
        }
    }

    public static void main(String[] args) {
        Audi a= new Audi();
        a.AudiType();
    }
}
