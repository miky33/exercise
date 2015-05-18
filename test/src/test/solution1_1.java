package test;

import java.util.Scanner;

public class solution1_1 {

    final private static String _problem1 = "3 10 20 30 0";
    final private static String _problem2 = "4 15.00 15.01 3.00 3.01 0";

    public static void main(String[] args) throws Exception {
        float moneyTransferred = Solve(_problem2);

        System.out.println("Result : " + moneyTransferred);
    }

    private static float Solve(String problem) throws Exception {

        Scanner sc = new Scanner(problem);

        final int numPeople = sc.nextInt();

        int[] eachPaid = new int[numPeople]; // unit : cents
        int sum = 0; // unit : cents

        for (int i = 0; i < numPeople; i++) {
            eachPaid[i] = (int) (sc.nextFloat() * 100);
            sum += eachPaid[i];
        }

        // minimum money evenly divided
        int minPayPerEach = sum / numPeople;

        // remaining money which cannot be divided evenly.
        int remains = sum % numPeople;

        System.out
                .format("NumPeople : %d, sum : %d, minimum pay per each : %d, remains : %d\n",
                        numPeople, sum, minPayPerEach, remains);

        // total transferred money (cents)
        int totalTransferred = 0;

        // number of people who already paid above
        int numAlreadyPaidAboveMin = 0;

        // 1. accumulate minimum money which should be evenly transferred.
        for (int i = 0; i < numPeople; ++i) {
            if (eachPaid[i] > minPayPerEach) {
                ++numAlreadyPaidAboveMin;
                continue;
            }
            int needTransfer = minPayPerEach - eachPaid[i];
            totalTransferred += needTransfer;
            System.out.format("user %d needTransfer : %d\n", i, needTransfer);
        }

        // 2. if the people who already paid above
        if (remains > numAlreadyPaidAboveMin) {
            int needToTransfer = remains - numAlreadyPaidAboveMin;
            totalTransferred += needToTransfer;
            System.out.format(
                    "remained money but need to be transferred : %d\n",
                    needToTransfer);
        }

        return totalTransferred / 100.f;
    }
}
