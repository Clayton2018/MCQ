import java.util.ArrayList;
import java.util.Scanner;

public class Questionaire {

    public static String[] ans = new String[3];
    public static String[][] questions = new String[3][5];

    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {

        int correct = 0;
        String incorrect = "";
        int x = 0;

        questions[0][0] = "What is 5 x 10";
        questions[0][1] = "A.10";
        questions[0][2] = "B.12";
        questions[0][3] = "C.50";
        questions[0][4] = "C";

        questions[1][0] = "What is Java?";
        questions[1][1] = "A.a programming language";
        questions[1][2] = "B.a plate";
        questions[1][3] = "C.a ant-virus";
        questions[1][4] = "A";

        questions[2][0] = "in what city is table mountain located?";
        questions[2][1] = "A.Port Elizabeth";
        questions[2][2] = "B.Johannesburg";
        questions[2][3] = "C.Cape Town";
        questions[2][4] = "C";


        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 5; j++) {

                System.out.println(questions[i][j]);

                if (j == 3){

                    System.out.print("Please enter your answer: ");
                    ans[i] = input.nextLine();

                }

            }

        }

        input.close();

        for(int i = 0; i <3; i++){

            if(ans[i].equalsIgnoreCase(questions[i][4])){

                correct++;

            }

            else {

                x = questions[i][3].equalsIgnoreCase("C") ? 1 : questions[i][3].equalsIgnoreCase("B") ? 2 : 3;

                incorrect = incorrect + "\nThe correct answer to Question " + (i+1) + " is " + questions[i][x] + "\nyour answer was: " + ans[i];

            }

        }

        System.out.println("You got " + correct + "/3\n" + incorrect);


    }

}



