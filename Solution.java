/* 
По 50 000 объектов Cat и Dog
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        for(int i = 0; i < 50000; i++)
        {
            Cat cat = new Cat();
            Dog dog = new Dog();
        }
    }
}
class Cat
{
    @Override
    protected void finalize() throws Throwable
    {
        super.finalize();
        System.out.println("Cat destroyed");
    }
}

class Dog
{
    @Override
    protected void finalize() throws Throwable
    {
        super.finalize();
        System.out.println("Dog destroyed");
    }
}
