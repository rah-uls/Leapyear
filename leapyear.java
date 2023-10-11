import java.util.*;
public class leapyear {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("FROM 2000 TO");
        System.out.print("ENTER THE YEAR-");
        int a=s.nextInt();
        /*LEAP YEAR==29 DAYS FEBRUARY*/
        if(a>1900){
           if(a%4==0){
                if(a%10==0){
                    if(a%40==0){
                        System.out.println("LEAP YEAR");
                        System.out.println("FEBRUARY ARE 29 DAYS");
                    }
                    else{
                        System.out.println("NOT LEAP YEAR");
                        System.out.println("FEBRUARY ARE 28 DAYS");
                    }
                }
                else{
                    System.out.println("LEAP YEAR");
                    System.out.println("FEBRUARY ARE 29 DAYS");
                }
            }
            else{
                System.out.println("NOT LEAP YEAR");
                System.out.println("FEBRUARY ARE 28 DAYS");
            }
        }
        else{
            System.out.println("PLEASE CHECK YOUR ENTER YEAR IS 4 DIGIT'S OR NOT-");
        }
    }       
}