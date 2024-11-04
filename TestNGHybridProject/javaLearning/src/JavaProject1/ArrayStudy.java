package JavaProject1;


/* print the following output
 - element on a specific position in an array
 - element on even numbers in an array
 - rever a string
 - print elements in ascending order/ descending order
 -print largest number in array
 
 */
 
public class ArrayStudy {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int [] {39,46,23,11,90,45,33}; 
		int temp = 0;
		System.out.println(arr.length);
		
		 for (int i = 0; i < 4; i++) {     
	            for (int j = i+1; j <4; j++) {     
	               if(arr[i] > arr[j]) {    
	                   temp = arr[i];    
	                   arr[i] = arr[j];    
	                   arr[j] = temp;   
	               }}}
		   
		   System.out.println("Elements of array sorted in ascending order: ");    
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " ");    
	        }
	        
	        }  
	}


