
public class BinarySearch {

	static boolean binarySort(int []arr,int n,int lo,int hi,int k) {
		int mid=0;
		while(lo<=hi) {
			mid=(lo+hi)/2;
			if(arr[mid]==k) {
				return true;
			}else if(k<arr[mid]) {
				hi=mid-1;
			}else if(k>arr[mid]) {
				lo=mid+1;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int arr[]= {2,4,9,10,30,40,50};
		int n=7;
		System.out.println(binarySort(arr,n,0,6,200
				));

	}

}
