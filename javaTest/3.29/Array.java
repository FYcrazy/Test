class Array 
{
	private int[] date;
	private int foot;

	public Array(int size){
		if(size > 0){
			this.date = new int[size];
			this.foot = 0;
		}else{
			this.date = new int[1];
		}
	}
	
	//添加数据
	public boolean add(int date){
		if(this.foot < this.date.length){
			this.date[foot++] = date;
			return true;
		}

		System.out.println("数组长度已满");
		return false;
	}

	//
	public int[] getDate(){
		return this.date;
	}

	public void addSize(int size){
		if(this.date == null){
			return ;
		}
		int newSize;
		int[] newDate;
		if(size > 0){
			newSize = this.date.length + size;
			newDate = new int[newSize];
			this.date = this.copy(newDate);
		}else{
			return ;
		}
	}

	private int[] copy(int[] newDate){
		int x = 0;
		while(x < this.date.length){
			newDate[x] = this.date[x++];
		}
		return newDate;
	}
}
