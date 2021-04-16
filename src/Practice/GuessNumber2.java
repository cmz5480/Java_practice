package Practice;
import java.util.Scanner;
import java.util.Random;


public class GuessNumber2 {
    public static void main(String args[]){
        System.out.println("我来猜你心里想的1至100的数");
        Random random=new Random();
        Scanner reader=new Scanner(System.in);
        int  programGuess=0,result=-1,lastGuess=0,lastGuessL=1,lastGuessR=100;
        programGuess=random.nextInt(100)+1;
        System.out.printf("你心里的数字是"+programGuess+"吗？");
        result=reader.nextInt();
        while(result!=2)
        {
            if(result==1) {
                lastGuessR=programGuess-1;
            }
            else if(result==0)
            {
                lastGuess=programGuess+1;
            }
            programGuess=lastGuess+random.nextInt(lastGuessR-lastGuessL+1);
            System.out.print("你心里的数字是"+programGuess+"吗？");
            result=reader.nextInt();
        }
        System.out.println("猜对了！");
    }
}
