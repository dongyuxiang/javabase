package arrays;
/**
  @author ������
  @version   1.2
 */
public class ArrayToo {
	/**
	 ��ȡ ��������������Ԫ�� 
	 @param  arr ����һ��Ԫ��Ϊint���͵�����
	 @return  ���ظ���������� ��Ԫ��
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
	 ��ȡָ��Ԫ���������е�����
	 @param arr ����һ��Ԫ��Ϊint���͵�����
	 @return ���ز��ҵ�Ԫ������������Ӧ��λ�� 
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
	 ���������� ��������
	 @param arr ���� һ��Ԫ��Ϊint���͵�����

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
	 ���ڸ�������Ԫ�ص�λ���û�
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
	 �� int����ת�����ַ���
	 @param arr ����һ��Ԫ��Ϊint���͵�����
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
	 ��ȡָ��Ԫ���������λ��  
	 @param arr ����һ��Ԫ��Ϊint���͵� ����
	 @param index  Ҫ�� ��Ԫ�� 
	 @return ���ظ�Ԫ�ص�һ�γ��ֵ�λ�ã����û�з���-1
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
	 ��ȡָ��Ԫ���������λ��  
	 @param arr ����һ��Ԫ��Ϊint���͵� ����
	 @param key  Ҫ�� ��Ԫ�� 
	 @return ���ظ�Ԫ�ص�һ�γ��ֵ�λ�ã����û�з���-1
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
	 ��������д�С��������� 
	 @param arr ����һ��Ԫ��Ϊint���͵����� 
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
