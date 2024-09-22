public class k_ex4 {  
    public static void main(String args[]) {  
        int base = 5;  
        int exponent = 3;  
        int result = 1;  
        for (int i = 0; i < exponent; i++) {  
            result *= base;  
        }  
        System.out.println(base + " raised to the power of " + exponent + " is " + result);  
    }  
}
