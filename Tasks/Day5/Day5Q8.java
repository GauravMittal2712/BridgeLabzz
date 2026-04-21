public class Day5Q8 {
    public static void main(String[] args) {
        String str = "Hello World this is my world";
        str =str.toLowerCase();
        int count = 0;
        for(char ch : str.toCharArray()){
         //if(ch == 'a' || ch == 'e' || ch=='i' || ch == 'o' || ch=='u')
            if("ariou".contains(String.valueOf(ch))){
             System.out.println(ch);
             count++;
         }

        }
        System.out.println(count);

    }
}
