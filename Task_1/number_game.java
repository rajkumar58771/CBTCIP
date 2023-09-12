import java.util.Scanner;
class number_game {
    Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        System.out.println("!Welcome to the number game!");
        number_game game = new number_game(); // Create an instance of the class
        game.start(); // Call the start method on the instance
    }
    public void start() {
        int r = (int) (Math.random() * 100);
        int guess = -1;
        int x;
        int count = 8;
        while (r != guess) {
            System.out.print("Guess the number: (" + (count-1) + " tries left)");
            count--;
            guess = sc.nextInt();
            if (guess == r) {
                System.out.println("Congrats! You guessed the correct answer!! The number was " + guess);
                System.out.println("Your score is " + (8-count));
                System.out.println("\nPress 1 to play again\nPress 0 to exit");
                x = sc.nextInt();
                if (x==1){
                    guess = -1;
                    count = 8;
                    r = (int) (Math.random() * 100);
                } else{
                    return;
                }
            } else if (guess > r) {
                System.out.println("Number is too high");
            } else {
                System.out.println("Number is too low");
            }
            if(count==0){
                System.out.println("No tries left. You lost. The number was " + guess);
                System.out.println("\n\nPress 1 to play again\nPress 0 to exit");
                x = sc.nextInt();
                if (x==1){
                    guess = -1;
                    count = 8;
                    r = (int) (Math.random() * 100);
                }
                else{
                    return;
                }
            }
        }
    }
}


