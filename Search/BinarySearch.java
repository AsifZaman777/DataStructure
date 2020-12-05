package DataStructure;

public class BinarySearch {
	
public static void main(String[] args)
{
int arr[]= {1,8,18,21,30};
int first=0;
int last=arr.length-1;
int mid;
int num=18;

do {
	mid=(first+last)/2;
	if(arr[mid]==num)
	{
		int u_num=mid+1;
		System.out.println("Element in the ["+u_num+"th] possition ");
		break;
	}
	else if (arr[mid]<num){
		first=mid+1;
		
		 }
	
	else {
		last=mid-1;
	}
	
	
} while (first<=last);

if (first>last) {
	System.out.println("Element not found");
}

}
}
