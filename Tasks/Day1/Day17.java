public class Day17 {
    static int count =10;
    static void Display(){
        System.out.println("Hello I am in Static method");
        System.out.println("count:"+count);
    }
    static{
        System.out.println("This Static Bloack is running:");
        count=10;
    }

    public static void main(String[] args) {
        System.out.println("The main block is running");
        count++;
        Display();

    }


}
