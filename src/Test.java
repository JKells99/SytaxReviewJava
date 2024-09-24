public class Test {
    public static void main(String[] args) {

        // Make a new instance of Animal object;

        Animal cat = new Animal("Cat",6);
        Animal cat1 = new Animal("Cat1",9);

        cat.animalGreeting();
        cat1.animalGreeting();


        System.out.println(cat);
        System.out.println(cat1);

        int num = 1;

        if(num > 2){
            System.out.println("It is ");
        } else{
            System.err.println("It is not grater than 2 ");
        }



    }
}
