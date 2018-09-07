/*
LINK : https://www.codechef.com/SEPT18B/problems/MAGICHF

When Chef was visiting a fair in Byteland, he met a magician. The magician had N boxes (numbered 1 through N) and a gold coin. He challenged Chef to play a game with him; if Chef won the game, he could have the coin, but if he lost, the magician would kidnap Chef.

At the beginning of the game, the magician places the gold coin into the X-th box. Then, he performs S swaps. To win, Chef needs to correctly identify the position of the coin after all swaps.

In each swap, the magician chooses two boxes A and B, moves the contents of box A (before the swap) to box B and the contents of box B (before the swap) to box A.

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains three space-separated integers N, X and S.
S lines follow. Each of these lines contains two space-separated integers A and B denoting a pair of swapped boxes.
Output
For each test case, print a single line containing one integer — the number of the box containing the gold coin after all swaps are performed.

Constraints
1≤T≤100
2≤N≤105
1≤S≤104
1≤X,A,B≤N
A≠B
the sum of S for all test cases does not exceed 2∗105
Subtasks
Subtask #1 (100 points): original constraints

Example Input
1
5 2 4
4 2
3 4
3 2
1 2
Example Output
1


*/

import java.util.*;
import java.lang.*;
import java.io.*;
class main{
	public static void main(String[] argv){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n=0,x=0,s=0,a=0,b=0;
		int[] box;
		int temp = 0;
		for(int i=0;i<t;i++){
			n = sc.nextInt();
			x = sc.nextInt();
			s = sc.nextInt();
			box = new int[n];
			box[x-1] = 1;
			for(int j=0;j<s;j++){
				a = sc.nextInt();
				b = sc.nextInt();
        if(a != b){
          temp = box[a-1];
          box[a-1] = box[b-1];
          box[b-1] = temp;
        }
			}
			for(int l=0;l<n;l++){
				if(box[l] == 1){
					System.out.println(l+1);
					break;
				}
			}
		}
	}
}
