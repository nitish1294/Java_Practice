/*Lec 7 Question - Shortest Path
 * Question 2. Given a route conatining 4 Direction
 * (E , W , N , S) Find the Shortest Path to Reach Destinarion
 * logic used like if N = y+1 , S = y-1 , W = x-1 ,E = x+1
 * Root of X2 =X*X   ,  Y2 = Y*Y ( X2+Y2 )
 * Find Root Like Math.sqrt(x2,y2)

 *  
 */
public class StringShortestPath {
    public static double ShortestPath(String str) {
        int x = 0, y = 0;
        char n = 'N', s = 'S', w = 'W', e = 'E';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == n) {
                y++;
            } else if (str.charAt(i) == s) {
                y--;
            } else if (str.charAt(i) == w) {
                x--;
            } else {
                x++;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        double path = Math.sqrt(x2 + y2);
        return path;
    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(ShortestPath(str));

    }
}
