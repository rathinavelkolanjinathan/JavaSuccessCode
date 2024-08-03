package Javacorecode.jdk8;

import java.util.Arrays;

public class Sum2NumsToATargetNumberTest2 {
    // System.out.println("current number="  + numbers[i] + " , requiredNumber = " + reqNumber);
    static int[] findNumsThatSumToTargetNum(int[] numbers, int target) {
        int pointer1 = 0;
        int pointer2 = numbers.length -1;

        int[] result = new int[2];

        Arrays.sort(numbers); // sort the numbers

        while(pointer2 >= pointer1) {
            int sum = numbers[pointer1] + numbers[pointer2];
            if(sum == target) {
                result[0] = numbers[pointer1] ;
                result[1] = numbers[pointer2] ;
                break;
            }

            //if sum is greater than the target
            if(sum > target) {
                pointer2--; //move pointer2 to the left to reduce the sum
            }

            //if sum is less than the target
            if(sum < target) {
                pointer1++; //move pointer1 to the right to increase the sum
            }
        }
        return result;
    }
}
