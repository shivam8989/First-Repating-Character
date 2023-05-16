package training;

public class First_RC {
    public static char firstRepeating(String str) {
        int n = str.length();

        char ans=0;
        int index = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            char temp = str.charAt(i);

            for (int j = i + 1; j < n; j++) {
                if (str.charAt(j) == temp) {
                    //if the index where it repeated is less than the index of the previously
                    //repeated character then store this character in ans variable
                    //and its index where it repeated in index variable
                    if (j < index) {
                        index = j;
                        ans = str.charAt(j);
                    }

                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(firstRepeating(str));

    }
}
