class Q11 {
    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Please provide x and y values");
            return;
        }

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        System.out.println("Euclidean Distance = " + distance);
    }
}