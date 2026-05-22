import java.sql.SQLOutput;
import java.util.TreeMap;

public class bfihbd {
    class MyexceptionDeclaration extends Exception{

        @Override
        public String getMessage(){
            return "This will Return the error";
        }
    }
    public double error(double a , double b) throws MyexceptionDeclaration{
        if(a<=0 || b<=0){
            throw  new MyexceptionDeclaration();
        }

        return Math.pow(a, b);

    }


    public static void main(String[] args) {
        bfihbd bf = new bfihbd();
        try{
            double c = bf.error(99,10);
            System.out.println(c);

            double c1 = bf.error(9,8);
            System.out.println(c);

            double c2 = bf.error(0,0);
            System.out.println(c);

        }catch (MyexceptionDeclaration e){
            System.out.println(e);
        }

    }
}
