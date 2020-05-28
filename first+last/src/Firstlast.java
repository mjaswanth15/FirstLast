

public class Firstlast {

	public static void main(String[] args) {
	System.out.println(" first last digit sum for 34 is "+firstlast(34));
	System.out.println(" first last digit sum for -342 is "+firstlast(-3422));
	System.out.println(" first last digit sum for 5674 is "+firstlast(5674));
	System.out.println(" first last digit sum for 400 is "+firstlast(400));
	}
	public static int firstlast(int number) {
	 int firstdigit=0;
     int lastdigit=0;

     if(number>=0 && number<=9)
     {
         return number+number;
     }

     else if(number>9)
     {
         lastdigit=number%10;
         while(number>0)
         {
             number/=10;
             if(number<=9 && number>=0){
                 firstdigit = number;
                 break;
             }
         }
         return firstdigit + lastdigit;
     }
     else
     return -1;
 }
}
