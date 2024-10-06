import javax.annotation.processing.SupportedSourceVersion;
import javax.sound.midi.SysexMessage;
import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[] a;
    static ArrayList<Integer> subset;

    static void generate(int i){
        if (i==n){
            for (int j = 0; j < subset.size(); j++){
                System.out.print(subset.get(j)+" ");
            }
            System.out.println();
            return;
        }

        subset.add(a[i]);
        generate(i+1);
        subset.remove(subset.size()-1);

        generate(i+1);
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        subset = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        generate(0);
    }

}

/*

static class Pair implements Comparable<Pair> {
        long a;
        int b;
        int c;


        public Pair(long a, int b) {
            this.a = a;
            this.b = b;
//            this.c = c;
        }

        public String toString() {
            return a + " " + b + " ";
        }

        @Override
        public int compareTo(Pair o) {
            if (a == o.a) return (int) (this.b - o.b);
            return (int) (a - o.a);
        }
    }
    static class Scanner {

        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(String file) throws IOException {
            br = new BufferedReader(new FileReader(file));
        }

        public Scanner(FileReader r) {
            br = new BufferedReader(r);
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public String readAllLines(BufferedReader reader) throws IOException {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
                content.append(System.lineSeparator());
            }
            return content.toString();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            String x = next();
            StringBuilder sb = new StringBuilder("0");
            double res = 0, f = 1;
            boolean dec = false, neg = false;
            int start = 0;
            if (x.charAt(0) == '-') {
                neg = true;
                start++;
            }
            for (int i = start; i < x.length(); i++)
                if (x.charAt(i) == '.') {
                    res = Long.parseLong(sb.toString());
                    sb = new StringBuilder("0");
                    dec = true;
                } else {
                    sb.append(x.charAt(i));
                    if (dec) f *= 10;
                }
            res += Long.parseLong(sb.toString()) / f;
            return res * (neg ? -1 : 1);
        }

        public long[] nextlongarr(int n) throws IOException {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }

        public Long[] nextLongarr(int n) throws IOException {
            Long[] a = new Long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }

        public int[] nextIntarr(int n) throws IOException {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public Integer[] nextIntegerarr(int n) throws IOException {
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public boolean ready() throws IOException {
            return br.ready();
        }

    }
 */
