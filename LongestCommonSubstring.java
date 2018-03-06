LongestCommonSubstring

public String lcs(String s1, String s2){
	int l1= s1.length();
	int l2= s2.length();

	int [][]dp= new int[l1+1][l2+1];
	int maxlen= 0;
	int pos= 0;
	for(int i=1;i<=l1;i++){
		for(int j=1;j<=l2;j++){
			if(s1.charAt(i-1)==s2.charAt(j-1))
			{
				dp[i][j]= dp[i-1][j-1]+1;
				if(dp[i][j] > maxlen){
					maxlen= dp[i][j];
					pos= i;
				}
			}
			else
			{
				dp[i][j]= Math.max(dp[i-1][j], dp[i][j-1]);

			}
		}
	}

	return s.substring(pos-maxlen, maxlen);
}