import java.io.InputStream;
import java.util.Scanner;

public class Fun
{
    public static void main(String args[]) 
    {
        int num1, num2, num3, combNum;
        int numCorrect=0;
        double ans, inputans=0;
        Scanner scanner = new Scanner(System.in);
        int totalTries=20;
        for(int i=0;i<totalTries;i++)
        {
          //Generate numbers and answers
          num1=(int)(Math.random()*9)+1;
          num2=(int)(Math.random()*9)+1;
          num3=(int)(Math.random()*9)+1;
          combNum=(int)(Math.random()*16)+1;
          switch(combNum)
          {
            case 1: ans = num1 + num2 + num3;
                break;
            case 2: ans = num1 + num2 - num3;
                break;
            case 3: ans = num1 + num2 * num3;
                break;
            case 4: ans = num1 + ((double)num2 / num3);
                break;
            case 5: ans = num1 - num2 + num3;
                break;
            case 6: ans = num1 - num2 - num3;
                break;
            case 7: ans = num1 - num2 * num3;
                break;
            case 8: ans = num1 - ((double)num2 / num3);
                break;
            case 9: ans = num1 * num2 + num3;
                break;
            case 10: ans = num1 * num2 - num3;
                break;
            case 11: ans = num1 * num2 * num3;
                break;
            case 12: ans = num1 * ((double)num2 / num3);
                break;
            case 13: ans = ((double)num1 / num2) + num3;
                break;
            case 14: ans = ((double)num1 / num2) - num3;
                break;
            case 15: ans = ((double)num1 / num2) * num3;
                break;
            default : ans = ((double)num1 / num2) / num3;
          }
          System.out.println(num1 + " _ " + num2 + " _ " + num3 + " = " + ans);
          System.out.println("Please enter the first operator followed immediately by the second.");
            
          //Scan in string, inputs character 1 and 2 as operators
          scanner = new Scanner(System.in);
          String strInput = scanner.next();
          char input1 = strInput.charAt(0);
          char input2 = strInput.charAt(1);
            
          //Calculate number value the user's operators result in
          if(input1 == '+' && input2 == '+')
          {
              inputans = num1 + num2 + num3;
          }
          else if(input1 == '+' && input2 == '-')
          {
              inputans = num1 + num2 - num3;
          }
          else if(input1 == '+' && input2 == '*')
          {
              inputans = num1 + num2 * num3;
          }
          else if(input1 == '+' && input2 == '/')
          {
              inputans = num1 + ((double)num2 / num3);
          }
          else if(input1 == '-' && input2 == '+')
          {
              inputans = num1 - num2 + num3;
          }
          else if(input1 == '-' && input2 == '-')
          {
              inputans = num1 - num2 - num3;
          }
          else if(input1 == '-' && input2 == '*')
          {
              inputans = num1 - num2 * num3;
          }
          else if(input1 == '-' && input2 == '/')
          {
              inputans = num1 - ((double)num2 / num3);
          }
          else if(input1 == '*' && input2 == '+')
          {
              inputans = num1 * num2 + num3;
          }
          else if(input1 == '*' && input2 == '-')
          {
              inputans = num1 * num2 - num3;
          }
          else if(input1 == '*' && input2 == '*')
          {
              inputans = num1 * num2 * num3;
          }
          else if(input1 == '*' && input2 == '/')
          {
              inputans = num1 * ((double)num2 / num3);
          }
          else if(input1 == '/' && input2 == '+')
          {
              inputans = ((double)num1 / num2) + num3;
          }
          else if(input1 == '/' && input2 == '-')
          {
              inputans = ((double)num1 / num2) - num3;
          }
          else if(input1 == '/' && input2 == '*')
          {
              inputans = ((double)num1 / num2) * num3;
          }
          else if(input1 == '/' && input2 == '/')
          {
              inputans =((double)num1 / num2) / num3;
          }
          else
          {
              System.out.println("Input is not valid.");
          }
          
            
          //Verify if user's operators are correct
          if(inputans == ans)
          {
              System.out.println("You're right!");
              numCorrect++;
          }
          else
          {
              System.out.println("HA!");
          }
        }
        
        
        
        System.out.println("The program was finished.");
        System.out.println("You got " + numCorrect + " out of " + totalTries + "correct.");
    }
}
