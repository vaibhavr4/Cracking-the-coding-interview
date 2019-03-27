// Magic index where arr[index] = index - Without duplicates

int magicFast(int[] arr)
{
	int left = 0;
	int right = arr.length-1;
	while(left<right)
	{
		int mid = left +(right-left)/2;
		
		if(arr[mid]==mid)
			return mid;
		else if(arr[mid]<mid)
			left = mid+1;
		else
			right = mid-1;
	}
}


// Magic index where arr[index] = index - With duplicates

int magicFast(int[] arr)
{
	int left = 0;
	int right = arr.length-1;
	magicFast(arr,left,right);
}
int magicFast(int[] arr, int left, int right)
{
	if(right<left)
		return -1;
	int midIndex = (left+right)/2;
	int midValue = arr[mid];
	
	if(midIndex == midValue)
		return midIndex;
	int leftIndex = Math.min(midIndex-1,midValue);
	int left = magicFast(arr,left,leftIndex);
	if(left>0)
		return left;
	int rightIndex = Math.max(midIndex+1,midValue);
	int right = magicFast(arr,rightIndex,right);
	return right;
}