import java.util.*;
public class ArrayRotation{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int k=sc.nextInt();
	int q=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++){
		a[i]=sc.nextInt();
	}
	int rot[]=new int[n];
	//int newindex;
	for(int i=0;i<n;i++){
		int newindex=((i+n-k)%n);
		rot[newindex]=a[i];
	//	System.out.println(rot[i]);
	}
	System.out.println("enter the queries");
	for(int i=1;i<=n;i++){
	int qu;
		System.out.println(rot[i]);
		qu=sc.nextInt();
		System.out.println(rot[qu]);
	}
	}
}