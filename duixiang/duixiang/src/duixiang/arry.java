package duixiang;

public class arry {

	public static void main(String[] args) {
		int[] arry={2,5,7,1,8,6,4};
		int max=getMax(arry);
		//System.out.println(max);
	}
	public static int getMax(int[] arry){
		int max=0;
		for(int x=1;x<arry.length;x++){
			if(max<arry[x]){
				int a=arry[x];
				arry[x]=max;
				max=a;
			}
		}
		System.out.print(max);
		return max;
		}
	
}
