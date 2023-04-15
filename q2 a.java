package test;

public class q2a {public class q1b {
	public static void search(int[] info, int[] link, int start, int item, int[] loc) {
	   
 int c = start;
 int previous = -1;
 
 while (c != -1 && info[c] != item) {
     previous = c;
     c = link[c];
 }
 
 if (c == -1) {
     loc[0] = -1; 
 }
 else if (previous == -1) {
   loc[0] = c; 
 }
 else {
     link[previous] = link[c];
     link[c] = start;
     start = c;
     loc[0] = c;
 }
}

	

}
                 }
