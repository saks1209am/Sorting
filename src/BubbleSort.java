
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr={2,4,54,57,58,569,45,47};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<i;j++){
				if(arr[j]>arr[i]){
					int temp=arr[i];
					arr[j]=arr[i];
					arr[j]=temp;
					
				}
			}
		}
		System.out.println("Sorted array:");
		for(int k=0;k<arr.length;k++){
	System.out.println(arr[k]+"");
	


		}

	}
}
