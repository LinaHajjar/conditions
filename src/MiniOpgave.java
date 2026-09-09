public class MiniOpgave {
    void main() {
        int[] scores = {7, 10, 4, 12, 21};
        int count = 0;
        int sum = 0;
        for(int i = 0; i < scores.length; i++) {
            if(scores[i] > 6) {
                count++;
            }
            sum += scores[i];
            scores[i] += 1;
            System.out.println("Vores nye " + (i + 1) + " er: " + scores[i]);
        }
        System.out.println("Summen er:" + sum);
        System.out.println("Count er: " + count);
        System.out.println("Gennemsnittet er " + ((double)sum/ scores.length));
    }
}
