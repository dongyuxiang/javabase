package arrays;
/**
  @author 董雨翔
  @version   1.2
 */
public class ArrayToo {
	/**
	 获取 整型数组中最大的元素 
	 @param  arr 接收一个元素为int类型的数组
	 @return  返回该数组中最大 的元素
	 */
	public int getmax(int[] arr){
	int maxindex=0;
	for(int x=1;x<arr.length;x++){
		if(arr[x]>arr[maxindex]){
			maxindex=x;
		}
	}
	return arr[maxindex];
	}
	/**
	 获取指定元素在数组中的索引
	 @param arr 接收一个元素为int类型的数组
	 @return 返回查找的元素在数组中相应的位置 
	 */
	public int search(int[] arr,int key){
		for(int x=0;x<arr.length;x++){
			if(arr[x]==key){
				return x;
			}
		}
		return -1;
	}
	/**
	 对整型数组 进行排序
	 @param arr 接收 一个元素为int类型的数组

	 */
	public void paixu(int[] arr){
		for(int x=0;x<arr.length-1;x++){
			for(int y=x+1;y<arr.length;y++){
				if(arr[x]>arr[y]){
					swap(arr,x,y);
				}
			}
		}
	}
	/**
	 用于给数组中元素的位置置换
	 @param arr
	 @param a
	 @param b 
	 */
	public void swap(int[] arr,int a,int b){
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	/**
	 将 int数组转换成字符串
	 @param arr 接收一个元素为int类型的数组
	 */
	public void print(int[] arr){
		System.out.print("[");
		for(int x=0;x<arr.length;x++){
			if(x!=arr.length-1)
			System.out.print(arr[x]+",");
			else
			System.out.print(arr[x]+"]");
		}
	}
	/**
	 获取指定元素在数组的位置  
	 @param arr 接收一个元素为int类型的 数组
	 @param index  要找 的元素 
	 @return 返回该元素第一次出现的位置，如果没有返回-1
	 */
	public int halfsearch(int[] arr,int index){
		int min=0;
		int max=arr.length;
		int mid=(min+max)/2;
		while(index!=arr[mid]){
			if(arr[mid]>index)
				max=mid-1;
			if(arr[mid]<index)
				min=mid+1;
			if(min>max)
				return -1;
			mid=(min+max)/2;
		}
		return mid;
	}
	/**
	 获取指定元素在数组的位置  
	 @param arr 接收一个元素为int类型的 数组
	 @param key  要找 的元素 
	 @return 返回该元素第一次出现的位置，如果没有返回-1
	 */
	public int halfsearch_1(int[] arr,int key){
		int min=0;
		int max=arr.length;
		int mid=(min+max)/2;
		while(min<=max){
			if(arr[mid]>key)
				max=mid-1;
			else if(arr[mid]<key)
				min=mid+1;
			else
				return mid;
			mid=(min+max)/2;
		}
		return min;
	}
	/**
	 对数组进行从小到大的排序 
	 @param arr 接收一个元素为int类型的数组 
	 */
	public void bubble(int[] arr){
		for(int x=0;x<arr.length-1;x++){
			int num=arr[x];
			int index=x;
			for(int y=x+1;y<arr.length;y++){
				if(num>arr[y]){
					num=arr[y];
					index=y;
				}	
			}
			if(index!=x){
				swap(arr,x,index);
			}
		}
	}
}
