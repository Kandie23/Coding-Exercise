import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        int [] array1 = {1, 3, -5, 4};
        int [] array2 = {1, 4, -4, -2};

        for(int i=0; i<4; i++){

            int multiplication = array1[i]*array2[i];
            System.out.print(multiplication);
        }



    }
}