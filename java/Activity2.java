
public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10, 77, 10, 54, -11, 10};
		int value=0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==10) {
				value=value+arr[i];
			}
		}
	if(value==30) {
		System.out.println("equal to 30");
	}else {
		System.out.println("not equal to 30.");
	}

	}

}
