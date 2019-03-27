// Powerset - BackTracking

public List<List<Integer>> powerSet(int[] nums)
{
	List<List<Integer>> result = new ArrayList();
	powerSet(nums,0,result,new ArrayList());
	return result;
}
public void powerSet(int[] nums,int ptr,ListList<Integer>> result, List<Integer> partial)
{
	result.add(partial);
	
	for(int i=ptr;i<=nums.length;i++)
	{
		partial.add(nums[i]);
		powerSet(nums,ptr+1,result,partial);
		partisl.remove(partial.size()-1);
	}
}