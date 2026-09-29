package edu.wccnet.aurewhite;

public class IocDemo {
    public static void main( String[] args )
    {
        IBird chickadee = new SeedsEater();
        System.out.println(chickadee.getEatingHabit());
    }
}
