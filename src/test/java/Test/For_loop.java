package Test;

public class For_loop {

	public static void main(String[] args) {
		
/*String original = "abcd";
        
        // Initialize an empty string to hold the reversed string
        String reversed = "";
        
        // Loop through the original string in reverse order
        for (int i = original.length() - 1; i >= 0; i--) {
            // Append each character (number) to the reversed string
            reversed += original.charAt(i);
        }
        
        // Print the reversed string
        System.out.println("Reversed Number String: " + reversed);*/
	int a =12345, b=0;
	for(;a!=0;a/=10)
	{
		int d = a % 10;
		b=b*10+ d;
		//break;
			
	}System.out.println(b);
    }
}
