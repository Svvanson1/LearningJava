
public class Universe {
	 public static void main(String[] args) { 

	        // read
	        int N = StdIn.readInt();

	        // initialize arrays
	        int px[] = new int[N];
	        int py[]  = new int[N];
	        int vx[] = new int[N];
	        int vy[] = new int[N];
	        int m[] = new int[N];
	        String image[] = new String[N];

	        // read in the data
	        for (int i = 0; i < N; i++) {
	            px[i]   = StdIn.readInt();
	            py[i]    = StdIn.readInt();
	            vx[i]   = StdIn.readInt();
	            vy[i] = StdIn.readInt();
	            m[i] = StdIn.readInt();
	            image[i] = StdIn.readString();
	        }

	    }

}
