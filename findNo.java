package Array;

import java.util.Scanner;

public class findNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int total = Sc.nextInt();
		int [] n = new int[total];
		
	//	int i =0;
		for(int i= 0;i<total;i++) {
		System.out.println("Enter the Array Number:");
		n[i] = Sc.nextInt();		
		}
		
		System.out.println("Enter the Find Number: ");
		int FindNo = Sc.nextInt();
		
		boolean Found = false;
	//	for(int i=0;i<total;i++) 
			int i = 0;
			while(i<total) {
			if(n[i]==FindNo) {
			//	System.out.println(n[i]);
			System.out.println("Placed element" + (i + 1));
			Found = true;
			break;
			}
			i++;
			}
			
		if(!Found) {
		System.out.println("The number is not here");
		}
			
		
		Sc.close();
	}

}
