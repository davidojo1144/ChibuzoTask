import java.util.Arrays;
public class LargestElement{

	public static int getElement(int[] element){

	int largest = element[0];
	for(int num = 1; num < element.length; num++){
	if(element[num] > largest){
	largest = element[num];
	} 
	}
	return largest;
	}

	public static void main(String[] args){
	int[] numbers = {-1,-29,45,3,7,6,9,3,1};
	int result = getElement(numbers);
	System.out.println("The largest element is: " + result);
	}

}