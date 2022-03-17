import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n, m;
    static boolean[] visited;
    static int[] temp;

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(buf.readLine());

        n = Integer.parseInt(stk.nextToken());
        m = Integer.parseInt(stk.nextToken());

        visited = new boolean[n];
        temp = new int[n];

        dfs(0,0);

    }

    public static void dfs(int start, int depth) {
        if(depth == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(temp[i] + " ");
            }
            System.out.println();
            return;
        }

        for(int i=start; i<n; i++) {
            if(!visited[i]) {
                visited[i] = true;

                temp[depth] = i+1;

                dfs(i+1,depth+1);

                visited[i] = false;
            }
        }
    }
}
