public class Animal {
    void animal()
    {
        System.out.println("I am walking");
    }

}
class Bird extends Animal
{
    void bird()
    {
        animal();
        System.out.println("I am flying");
    }
    void sing()
    {
        System.out.println("I am singing");
    }
}
class Solution
{
    public static void main (String[] args)
    {
        Bird ob = new Bird();
        ob.bird();
        ob.sing();

    }
}
