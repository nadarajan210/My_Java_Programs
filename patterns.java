/*
1
1 2
1 2 3
1 2 3 4 
1 2 3 4 5
1 2 3 4 5 6
*/

public class FirstCode1 {
	public static void main(String[] args) {
		int n=6;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j + " ");
			}
			System.out.println("\n");
		}
	}
}

/*
A
A B
A B C
*/

public class FirstCode2 {
	public static void main(String[] args) {
		for(int i=(char)65;i<=(char)67;i++) {
			for(int j=(char)65;j<=i;j++) {
				System.out.print((char)j + " ");
			}
			System.out.println("\n");
		}
	}
}

/*
$ $ $ $
$     $
$     $
$ $ $ $
*/

public class FirstCode3 {
	public static void main(String[] args) {
		int n = 4;
		int m = 4;;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(i==1 || i==n || j==1 || j==m){
					System.out.print("$ ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println("\n");
		}
	}
}
