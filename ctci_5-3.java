//flip bits
public flip_bits(int n)
{
	if(~n == 0)
		return Integer.BYTES *8;
	current_length = 0;
	previous_length = 0;
	int max_length = 1;
	while(a!=0)
	{
		if(a&1==1)
			current_length++;
		else if(a&1==0)
		{
			previous_length = (a&2==0)?0:current_length;
			current_length = 0;
		}
		max_length = Math.max(previous_length+current_length+1,max_length);
		a>>>1;
	}
	return max_length;
}
