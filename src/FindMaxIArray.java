public class FindMaxIArray {

    public static void main(String[] args) {

        int[] tal = {2, 10, 17, 1, 5, 27, 35, 4, 9, 18};
        //System.out.println(tal);
        //int max = tal[0];

        /*
        if (tal[1] > max) {
            max = tal[1];
        }

        if (tal[2] > max) {
            max = tal[2];
        }

        if (tal[3] > max) {
            max = tal[3];
        }

        if (tal[4] > max) {
            max = tal[4];
        }

        if (tal[5] > max) {
            max = tal[5];
        }

        if (tal[6] > max) {
            max = tal[6];
        }

        if (tal[7] > max) {
            max = tal[7];
        }

        if (tal[8] > max) {
            max = tal[8];
        }

        if (tal[9] > max) {
            max = tal[9];
        }*/


        //find max ved brug af for loop

int max=tal[0];
/*for(int i = 1; i<tal.length; i++){
    if(tal[i]>max){
        max=tal[i];
    }*/

        for(int number : tal){
            System.out.println(number);
            if (number>=max){
                max=number;
            }
        }

        System.out.printf("biggest number: " + max);

}


        //System.out.println("Det største tal er: " + max);
    }



