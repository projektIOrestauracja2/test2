package test;

/**
 *
 * @author Kuba
 */
public class Test {

    private static class Animal{
        public void shout(){
            System.out.println("_____");
        }
    }
    
    private interface A{
        
    }
    
    private interface B{
        
    }
    
    private static class Dog extends Animal{
        @Override
        public void shout(){
            System.out.println("Hau!!!");
        }
    }
    
    private static class Cat extends Animal{
        @Override
        public void shout(){
            System.out.println("Miau!!!");
        }
    }
    
    private static class Tiger extends Cat {
        @Override
        public void shout(){
            System.out.println("Roar!!!");
        }
    }
    
    public static void main(String[] args) {
        
        
        Animal cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat tiger1 = new Tiger();
        
        
        cat1.shout();
        cat2.shout();
        
        tiger1.shout();
    }
    
}
