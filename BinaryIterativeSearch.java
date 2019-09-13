public class BinaryIterativeSearch implements Practice03Search
{
	public String searchName()
	{
		String name= "Iterative search";
		return name;
	}
	public int search(int [] arr, int target)
	{
		int start=0, end= arr.length-1;
		while(start<=end)
		{
			int mid=(start+end)/2;
			if (target==arr[mid])
				return mid;
			else if(target<arr[mid])
				end = mid -1;
			else
				start=mid+1;
		}
		return -1;
	}
}
