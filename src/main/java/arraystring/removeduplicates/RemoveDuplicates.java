package arraystring.removeduplicates;

public class RemoveDuplicates {

    //{3, 2, 2, 3}

    public static int removeDuplicates1(int[] nums) {

        int[] newArray = new int[nums.length];
        int k = 0;
        if (nums.length == 1) {
            k++;
            return k;
        } else {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] != nums[i + 1]) {
                    newArray[k++] = nums[i];
                }
            }

            newArray[k++] = nums[nums.length - 1];

            for (int x : newArray) {
                System.out.print(x + " ");
            }
            System.out.println();

            for (int j = 0; j < k; j++) {
                nums[j] = newArray[j];
            }

            for (int x : nums) {
                System.out.print(x + " ");
            }

            return k;
        }
    }




}



