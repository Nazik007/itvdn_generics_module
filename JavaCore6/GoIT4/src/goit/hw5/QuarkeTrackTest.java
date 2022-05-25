package goit.hw5;

import java.util.Arrays;
import java.util.Objects;

public class QuarkeTrackTest {
        public static void main(String[] args) {
            int[] track1Data = {1, 3, 5};
            int[] track2Data = {3, 5, 4};
            int[] track3Data = {1, 5, 3};

            QuarkeTrack track1 = new QuarkeTrack(track1Data);
            QuarkeTrack track2 = new QuarkeTrack(track2Data);
            QuarkeTrack track3 = new QuarkeTrack(track3Data);

            //false
            System.out.println(track1.equals(track2));

            //true
            System.out.println(track1.equals(track3));

            //Can be true or false
            System.out.println(track1.hashCode() == track2.hashCode());

            //true
            System.out.println(track1.hashCode() == track3.hashCode());
        }
    }

//    class QuarkeTrack {
//
//    private int[] track1;
//    private int[] track2;
//    private int[] track3;
//
//        public QuarkeTrack(int[] lines) {
//            this.track1 = track1;
//            this.track2 = track2;
//            this.track3 = track3;
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            QuarkeTrack that = (QuarkeTrack) o;
//            return Arrays.equals(track1, that.track1) && Arrays.equals(track2, that.track2) && Arrays.equals(track3, that.track3);
//        }
//
//        @Override
//        public int hashCode() {
//            final int prime = 31;
//            int result = 1;
//            result = prime * result + Arrays.hashCode(track1);
//            result = prime * result + Arrays.hashCode(track2);
//            result = prime * result + Arrays.hashCode(track3);
//            return result;
//        }
//    }

class QuarkeTrack{
    private int sumSteps = 0;
    public QuarkeTrack(int[] lines){
        for (int i = 0; i<lines.length; i++){
            sumSteps += lines[i];
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuarkeTrack quarkeTrack = (QuarkeTrack) o;
        return this.sumSteps == quarkeTrack.sumSteps;
    }
    @Override
    public int hashCode() {
        return Objects.hash(sumSteps);
    }
}
