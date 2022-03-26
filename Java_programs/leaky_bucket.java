/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class leaky_bucket
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int a[] = new int[20];
		int cap=4, rate=3, rem=0, recv, sent;
		System.out.println("Enter the number of packets: ");
		int n = sc.nextInt(); 
		System.out.println("Enter the packet sizes: ");
		for(int i=1;i<=n;i++){
		    a[i] = sc.nextInt();
		}
		System.out.println("clock\t packet size\t accept\t sent\t remaining\t");
		for(int i=1;i<=n;i++){
		    if(a[i]!=0){
		        if(a[i]+rem>cap){
		            recv=-1;
		        }
		        else{
		            recv=a[i];
		            rem+=a[i];
		        }
		    if(rem!=0){
		        if(rem<rate){
		            sent=rem;
		            rem=0;
		        }
		        else{
		            sent=rate;
		            rem=rem-rate;
		        }
		    }
		    else{
		        sent=0;
		    }
		    if(recv==-1){
		        System.out.println(+i+"\t"+a[i]+"\t"+"Dropped"+"\t"+"0"+"\t"+rem);
		    }
		    else{
		        System.out.println(+i+"\t"+a[i]+"\t"+recv+"\t"+sent+"\t"+rem);
		    }
		}
	    }
	}
}

