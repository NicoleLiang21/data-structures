import java.util.Scanner;

/**
   This program demonstrates a decision tree for an animal 
   guessing game.
*/
public class DecisionTreeDemo
{
   public static void main(String[] args)
   {
      OneChild questionTree = new OneChild("Is it a mammal?",
         new OneChild("Does it have stripes?",
            new OneChild("Is it a carnivore?",
               new OneChild("It is a tiger."),
               new OneChild("It is a zebra.")),
            new OneChild("It is a pig.")),
         new OneChild("Does it fly?",
            new OneChild("It is an eagle."),
            new OneChild("Does it swim?",
               new OneChild("It is a penguin."),
               new OneChild("It is an ostrich."))));

      boolean done = false;
      Scanner in = new Scanner(System.in);
      while (!done)
      {
         OneChild left = questionTree.left();
         OneChild right = questionTree.right();
         if (left.isEmpty() && right.isEmpty())
         {
            System.out.println(questionTree.data());
            done = true;
         }
         else
         {
            String response;
            do
            {
               System.out.print(questionTree.data() + " (Y/N) ");
               response = in.next().toUpperCase();
            } 
            while (!response.equals("Y") && !response.equals("N"));

            if (response.equals("Y"))
            {
               questionTree = left;         
            }
            else
            {
               questionTree = right;         
            }
         }
      }
   }
}
