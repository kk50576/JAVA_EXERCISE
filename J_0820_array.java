package tw.org.iii;

public class J_0820_array {

	public static void main(String[] args) {
		int[] a;//recommended
		int b[];
		a=new int[7];//new:配置物件的空間 只能放INT
		a[2]=12;
		a[5]=100;
		a[6]=11;
		for(int i=0;i<a.length;i++)
        System.out.println(a[i]);//元素個數
	
	int[] d=new int[3];//宣告同時直接給值
	int[] e=new int[]{1,2,3};
	for(int i=0;i<d.length;i++){
	System.out.println(e[i]);	
	}
	
	
	
	}

}
