package NumberTheory;

public class desirableNUmbers {

    public static int calculateLength(int n){  
        int length = 0;  
        while(n != 0){  
            length = length + 1;  
            n = n/10;  
        }  
        return length;  
    }  
      
    //sumOfDigits() will calculates the sum of digits powered with their respective position  
    public static int sumOfDigits(int num){  
        int sum = 0, rem = 0;  
        int len = calculateLength(num);  
          
        while(num > 0){  
            rem = num%10;  
            sum = sum + (int)Math.pow(rem,len);  
            num = num/10;  
            len--;  
        }  
        return sum;  
    }  
      
    public static void main(String[] args) {  
        int result = 0;  
          
        //Displays all disarium numbers between 1 and 100  
        System.out.println("Disarium numbers between 1 and 100 are");  
        for(int i = 1; i <= 100; i++){  
            result = sumOfDigits(i);  
          
            if(result == i)  
                System.out.print(i + " ");  
        }  
    }  
}  
    
}
