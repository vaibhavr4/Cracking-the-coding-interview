public int updateBits(int m, int n, int i, int j)
{
	// bit mask with all ones
	int onesMask = ~0;
	
	// make j to i to be 0
	int left = onesMask <<(j+1);
	int right = (1<<i)-1;
	int mask = left|right;
	n_shifted = n&mask;
	m_shifted = m<<i;
	return n_shifted|m_shifted;

}