public class LinearSearch implements Practice03Search
{
	public String searchName()
	{
		String name = "Linear Search";
		return name;
	}
	public int search(int [] arr, int target)
	{
		for(int start=0;start<arr.length;start++)
		{
			if (arr[start]==target)
				return start;
		}
		return -1;
	}
}

