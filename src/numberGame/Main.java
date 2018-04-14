/* link: https://classroom.udacity.com/courses/ud283/lessons/297a7f29-2c0d-4e79-863b-d7c83b4026c1/concepts/77077ce9-052b-4886-92ef-9c8696bbc692
* */

package numberGame;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int randomNumber = (int) (Math.random()*100)+1;
        System.out.println("Guess 1 - 100");
        Scanner sc = new Scanner(System.in);
        boolean won = false;

        for (int i = 10; i > 0; i--){
            System.out.println("You have "+ i + "guess(es) left");
            int guess = sc.nextInt();

            if(guess < randomNumber){
                System.out.println("bigger");
            }
            else if (guess > randomNumber){
                System.out.println("smaller");
            }
            else {
                System.out.println("won");
                won = true;
                break;
            }
        }
        if (won == true){
            System.out.println("congrats");
        }
        else{
            System.out.println("lose");
        }
    }
}
