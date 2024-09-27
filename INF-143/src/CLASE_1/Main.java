package CLASE_1;
import java.util.*;

public class Main {
	public static int dx[]= {0,1,0,-1};
	public static int dy[]= {1,0,-1,0};
	
	public static int n;
	public static int m[][] =  new int[110][110];
	
	public static boolean ok(int x,int y) {
		if(x >=0 && x<n  && y>=0 && y<n )
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		Scanner lee = new Scanner(System.in);
		n = lee.nextInt();
		int x=0 , y =0;//inicio
		int valor =1;
		int pos=0;
		for(int i=0;i<n*n ;i++) {
			m[x][y] = valor++;
			int sigX = x+ dx[pos];
			int sigY = y+ dy[pos];
			if(!(ok(sigX,sigY) && m[sigX][sigY] ==0)) {
				pos = (pos + 1) % 4;
				sigX = x+ dx[pos];
				sigY = y+ dy[pos];
			}
			x= sigX;
			y = sigY;
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j == n-1)
					System.out.println(m[i][j]);
				else
					System.out.print(m[i][j]+ " ");
			}
		}
		
	
	}
}

