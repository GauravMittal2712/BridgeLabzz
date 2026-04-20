public class Day5Q3 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for(int i = 0;i<=n;i++){
            int j = 1<<i;
            System.out.println(j);
        }
    }
}
