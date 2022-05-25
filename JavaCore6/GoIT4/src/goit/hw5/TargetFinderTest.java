package goit.hw5;

import java.util.Arrays;

import static java.lang.Math.round;
import static java.lang.Math.sqrt;

public class TargetFinderTest {
    public static void main(String[] args) {
        int[] aiCoords = {10, 10};
        int[][] targets = {
                {20, 20},
                {15, 14},
                {30, 5}
        };

        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

        //Expect [15, 14]
        System.out.println(Arrays.toString(nearestTarget));
    }
}

//

class TargetFinder{
    public int[] findTarget(int[] aiCoords, int[][] targets){
        double minDistance = round(sqrt(Math.pow(aiCoords[0] - targets[0][0], 2) + Math.pow(aiCoords[1] - targets[0][1], 2)));
        int numberNearPoint = 0;
        {
            double distance;
            for (int i = 1; i < targets.length; i++) {
                distance = round(sqrt(Math.pow(aiCoords[0] - targets[i][0], 2) + Math.pow(aiCoords[1] - targets[i][1], 2)));
                if (distance - minDistance < 0.0){
                    minDistance = distance;
                    numberNearPoint = i;
                }
            }
        }
        return targets[numberNearPoint];
    }
}
