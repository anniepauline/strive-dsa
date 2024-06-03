class recurse {
    public static void main(String[] args) {
        // f(0);
        // printName("Annie", 0);
        // oneToN(1,100);
        // nToOne(1, 100);
        // sumFirstNnums(5,0);
        // System.out.println( fibonacci(7));

        // int arr[] = { 1, 2, 3, 4, 2 };
        // int[] result = reverseArrayFun(0, arr);
        // for (int i = 0; i < result.length; i++) {
        // System.out.print(result[i] + " ");
        // }

        // String pal = "madam";
        // System.out.println("Is Palindrome? " + chkPalindrome(pal, 0, pal.length() -
        // 1));

        // System.out.println(factorial(5));
    }

    public static void f(int count) {
        if (count == 4) {
            return;
        }
        count++;
        System.out.println(count);
        f(count);
    }

    // print name 5 times
    public static void printName(String name, int count) {
        if (count == 5) {
            return;
        }
        count++;
        System.out.println(name);
        printName(name, count);
    }

    public static void oneToN(int start, int end) {
        if (start == end) {
            return;
        }
        start++;
        System.out.println(start);
        oneToN(start, end);
    }

    public static void nToOne(int start, int end) {
        if (end == start) {
            return;
        }
        System.out.println(end);
        end--;
        nToOne(start, end);
    }

    public static void sumFirstNnums(int num, int sum) {
        if (num == 0) {
            System.out.println(sum);
            return;
        }

        sumFirstNnums(num - 1, sum + num);
    }

    public static int sumFirstNnumsFun(int num) {
        if (num == 0) {
            return 0;
        }
        return num + sumFirstNnumsFun(num - 1);
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int[] reverseArray(int left, int right, int arr[]) {
        if (left >= right) {
            return arr;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = arr[temp];
        return reverseArray(left + 1, right - 1, arr);
    }

    public static int[] reverseArrayFun(int i, int arr[]) {
        if (i >= arr.length / 2) {
            return arr;
        }
        int temp = arr[i];
        arr[i] = arr[arr.length - i - 1];
        arr[arr.length - i - 1] = arr[temp];
        return reverseArrayFun(i + 1, arr);
    }

    public static boolean chkPalindrome(String S, int start, int end) {
        if (start == end)
            return true;

        if (S.charAt(start) != S.charAt(end))
            return false;
        if (start < end + 1)
            return chkPalindrome(S, start + 1, end - 1);
        return true;

    }

    public static int factorial(int n) {
        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }
}