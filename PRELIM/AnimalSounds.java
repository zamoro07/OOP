import java.util.Scanner;

   public class AnimalSounds{
   
      public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

         System.out.println("Select an animal: ");
         System.out.print("1. Dog \n2. Cat \n3. Cow \n4. Bird \nEnter a number: ");
         int response = scan.nextInt();
   
         switch (response) {
        case 1:
         response = 1;
         Dog arf = new Dog();
         arf.displayName();
         break;

        case 2:
         response = 2;
         Cat meow = new Cat();
         meow.displayName();
         break;

        case 3:
         response = 1;
         Cow moo = new Cow();
         moo.displayName();
         break;

        case 4:
         response = 4;
         Bird Tweet = new Bird();
         Tweet.displayName();
         break;

         default:
         System.out.print("Invalid Number!");
         return;
       }
     }
   }

      class Dog{

   public void displayName() {
      System.out.print("Animal: Dog \nSound: Arf Arf!");
   }
}

      class Cat extends Dog{

   public void displayName() {
      System.out.print("Animal: Cat \nSound: Meow Meow!");
   }
}

      class Cow extends Dog{

   public void displayName() {
      System.out.print("Animal: Cow \nSound: Moo Moo!");
   }
}

      class Bird extends Dog{

   public void displayName(){
      System.out.print("Animal: Bird \nSound: Tweet Tweet!");
   }
}
