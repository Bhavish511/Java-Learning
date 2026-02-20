import java.util.Scanner;

public class QuestionService 
{
    Question[] questions = new Question[5];
    String selection[] = new String[5];
    public QuestionService()
    {
            
        questions[0] = new Question(1, "size of int", "2", "6", "4", "8", "4");
        questions[1] = new Question(2, "size of double", "2", "6", "4", "8", "8");
        questions[2] = new Question(3, "size of char", "2", "6", "4", "8", "2");
        questions[3] = new Question(4, "size of long", "2", "6", "4", "8", "8");
        questions[4] = new Question(5, "size of boolean", "1", "2", "4", "8", "1");
    }

    public void PlayQuiz()
    {
        int count = 0;
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question no. : "+questions[i].getId());
            System.out.println("Q : " + questions[i].getQuestion());   
            System.out.println("a. "+ questions[i].getOpt1());   
            System.out.println("b. " +questions[i].getOpt2());   
            System.out.println("c. " +questions[i].getOpt3());   
            System.out.println("d. " +questions[i].getOpt4()); 
            Scanner scn = new Scanner(System.in);
            System.out.print("Enter your choice:"); 
            selection[i] = scn.nextLine();
            // scn.close();
            // System.out.println(selection[i] == questions[i].getAnswer() ? "Correct" : "Wrong");
            if(selection[i].equals(questions[i].getAnswer())){
                count++;
                System.out.println( "Correct");
            }else{
                System.out.println("Wrong");
            }
        }

        System.out.println("Your final score is: " + count + "/" + questions.length);

        // for(String s :selection){
        //     System.out.println(s);
        // }
    };

}
