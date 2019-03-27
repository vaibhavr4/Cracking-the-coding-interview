// Triple step

int countWays(int n)
{
	int memo[] = new int[n+1];
	Arrays.fill(memo,-1);
	return countWays(n,memo);
}

int countWays(int n,int[] memo)
{
	if(n<0)
		return 0;
	if(n==0)
		return 1;
	if(memo[n]>-1)
		return memo[n];
	else
	{
		memo[n] = memo[n-1]+memo[n-2]+memo[n-3];
	}
	return memo[n];
}