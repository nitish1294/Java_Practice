import java.util.Scanner;

public class Question_service {

    Question[] questions = new Question[5];
    String select[] =new String[5];


    public Question_service() {
        questions[0] = new Question(1, "what is name:", "Nitish", "bad boy", "Nts", "Nitesh", "Nitish");
        questions[1] = new Question(2, "what is your age:", "20", "15", "c#", "25", "20");
        questions[2] = new Question(3, "place you born:", "Bihar", "Ara", "Kalwa", "Ghatkoper", "Gharkoper");
        questions[3] = new Question(4, "Your Current A/C Bal.:", "5", "10", "-10", "20", "5");
        questions[4] = new Question(5, "your Mobile Brand:", "I Phone", "one+", "Tesla", "Vivo", "Vivo");

    }

    public void displayqustion() {
        // questions[0] = new Question();
        int i=0;
        for (Question Q : questions) {

            System.out.println("Question ID"+Q.getId());
            System.out.println("Question"+Q.getQuestion());
            System.out.println("Option (A)"+Q.getOpt1());
            System.out.println("Option (B)"+Q.getOpt2());
            System.out.println("Option (C)"+Q.getOpt3());
            System.out.println("Option (D)"+Q.getOpt4());
            Scanner sc=new Scanner(System.in);
            select[i]=sc.nextLine();
            i++;


        }
        for(String s: select){
            System.out.println("Enter Enter By You: "+s);
        }
        for(Question A: questions){
            System.out.println("Right Answer Is: "+A.getAnswer());
        }
    }


    public void printscore(){
        int score=0;
        for (int i=0;i<questions.length;i++){
            Question quest=questions[i];
            String rightans=quest.getAnswer();
            String userans=select[i];
            if(rightans.equals(userans)){
                score++;

            }

        }
        System.out.print("your Score is:"+score+"/5");


    }

}
