public int[] SearchIn2D(int matrix[][], int target){
	int m = matrix.length;
	int n= matrix[0].length;

	int l = 0;
	int r = m*n - 1;

	while(l!=r){
		int mid= (l+r) / 2;

		if(matrix[mid/n][mid%n] < target)
			l = mid+1;
		else
			r = mid;
	}

	int[] position= new int[2];
	position[0] = matrix[r/n];
	position[1] = matrix[r%n];

	return position;
}

public void setMatrixZeros(int[][] matrix){
	int m= matrix.length;
	int n= matrix[0].length;

	int[] row = new int[m];
	int[] col = new int[n];

	for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
			if(matrix[i][j] == 0){
				row[i] = 1;
				col[j] = 1;
			}
		}
	}

	for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
			if(row[i]==1)
				matrix[i][j] = 0;
			else if(col[j] == 1)
				matrix[i][j] = 0;
		}
	}



	// O(1) space
	boolean row= false;
	boolean col= true;
	for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
			if(matrix[i][j]==0){
				matrix[i][0] = 0;
				matrix[0][j] = 0;

				if(i==0)
					row= true;
				if(j==0)
					col= true;
			}
		}
	}

	for(int i=1;i<m;i++){
		if(matrix[i][0]==0){
			for(int j=1;j<n;j++){
				matrix[i][j]= 0;
			}
		}
	}

	for(int j=1;j<n;j++){
		if(matrix[0][j]==0){
			for(int i=1;i<m;i++)
				matrix[i][j]= 0;
		}
	}

	if(row){
		for(int j=0;j<n;j++)
			matrix[0][j]= 0;
	}
	if(col){
		for(int i=0;i<m;i++)
			matrix[i][0]= 0;
	}
}
