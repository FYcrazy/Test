/*
	宠物商店：
	    需要实现的功能为：上架（添加），下架（删除）,模糊查询。
		模糊查询：某个关键字存在于宠物的名字中,可能存在多个宠物，以链表形式返回
*/
class  PetShop
{
	private Link pets = new Link();

	//上架方法
	public void add(Pet pet){
		this.pets.add(pet);
	}

	//下架方法
	public void remove(Pet pet){
		this.pets.remove(pet);
	}

	//模糊查询
	public Link search(String s){
		Link result = new Link();
		Object[] dates = this.pets.toArray();
		for(int x = 0; x < dates.length; x++){
			Pet p = (Pet)dates[x];
			if(p.getName().contains(s)){
				result.add(dates[x]);
			}
		}
		return result;
	}
}
