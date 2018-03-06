public int[] NextGreaterElement{
	stack.push(nums[0]);
	int j= 0;
	for(int i=1;i<nums.length;i++){
		int next= nums[i];
		if(!stack.isEmpty()){
			int top= stack.po();

			while(top < next){
				res[j++]= next;
				if(stack.isEmpty())
					break;
				top= stack.pop();
			}

			if(top > next)
				stack.push(top);
		}
		stack.push(next);
	}

	while(!stack.isEmpty()){
		stack.pop();
		res[j++]= -1;
	}

	return res;
}