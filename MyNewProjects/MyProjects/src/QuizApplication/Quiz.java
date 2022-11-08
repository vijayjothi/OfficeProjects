package QuizApplication;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Quiz {
    Scanner scan=new Scanner(System.in);
    int correctCount=0;
    int wrongCount=0;
    public void logic(){
        Questions q1=new Questions(" Who invented Java Programming?",
                "a) Guido van Rossum",
                "b) James Gosling",
                "c) Dennis Ritchie",
                "d) Bjarne Stroustrup");
        Questions q2=new Questions(" Which statement is true about Java?",
                "a) Java is a sequence-dependent programming language",
                "b) Java is a code dependent programming language",
                "c) Java is a platform-dependent programming language",
                "d) Java is a platform-independent programming language");
        Questions q3=new Questions(" Which component is used to compile, debug and execute the java programs?",
                "a) JRE",
                "b) JIT",
                "c) JDK" ,
                "d) JVM");

        Map<Questions,Character> hmap=new HashMap<>();
        hmap.put(q1,'b');
        hmap.put(q2,'d');
        hmap.put(q3,'d');

        for (Map.Entry<Questions,Character> map:hmap.entrySet()){
            System.out.println(map.getKey().getQuestion());
            System.out.println(map.getKey().getOption1());
            System.out.println(map.getKey().getOption2());
            System.out.println(map.getKey().getOption3());
            System.out.println(map.getKey().getOption4());

            System.out.println("Enter your answer:");
            char ans=scan.next().charAt(0);

            int cans=Character.compare(ans,map.getValue());
            if (cans==0){
                System.out.println("correct");
                correctCount++;
            }else {
                System.out.println("wrong");
                wrongCount++;
            }
        }
        System.out.println("--------------Result-----------------");
        System.out.println("Total number of questions: "+hmap.size());
        System.out.println("Correct answer: "+correctCount);
        System.out.println("Wrong answer: "+wrongCount);
        int percentage=(correctCount*100)/hmap.size();
        System.out.println("Percentage: "+percentage);//(4*100)/5;
        if (percentage>95){
            System.out.println("Performance: Very Good");
        } else if (percentage<35) {
            System.out.println("Performance: Very low");
        }else {
            System.out.println("Performance: Medium");
        }
    }
}
