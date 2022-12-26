public class Madhav {
    public static void main(String[] args){
        int[] num1 = {2, 1, 1};
        int result1 = isMadhavArray(num1);
        System.out.println(result1);

        int[] num2 = {2, 1, 1, 4, -1, -1};
        int result2 = isMadhavArray(num2);
        System.out.println(result2);

        int[] num3 = {6, 2, 4, 2, 2, 2, 1, 5, 0, 0};
        int result3 = isMadhavArray(num3);
        System.out.println(result3);

        int[] num4 = {18, 9, 10, 6, 6, 6};
        int result4 = isMadhavArray(num4);
        System.out.println(result4);

        int[] num5 = {-6, -3, -3, 8, -5, -4};
        int result5 = isMadhavArray(num5);
        System.out.println(result5);

        int[] num6 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1};
        int result6 = isMadhavArray(num6);
        System.out.println(result6);

        int[] num7 = {3, 1, 2, 3, 0};
        int result7 = isMadhavArray(num7);
        System.out.println(result7);

    }

    static int isMadhavArray(int[] a){


        int firstIndex = 0;
        int lastIndex = 0;
        int n = 1;
        int Sum1 = 0;
        int sum2 = 0;
        int LengthOfArray = 1;
        int calculatedLengthOfArray = 1;


        while(LengthOfArray <= a.length){
            if(LengthOfArray == calculatedLengthOfArray){
                for(int i = firstIndex; i <= lastIndex; i++){
                    sum2 += a[i];
                }
            }else{

                return 0;
            }
            if((Sum1 == sum2) || (firstIndex == lastIndex)){
                Sum1 = sum2;
                sum2 = 0;
            }else{

                return 0;
            }
            if(LengthOfArray == a.length){

                return 1;
            }else{
                firstIndex = lastIndex + 1;
                lastIndex = firstIndex + n;
                if((firstIndex < a.length && lastIndex < a.length)){

                    n++;
                }else{

                    lastIndex = a.length - 1;
                    n = lastIndex - firstIndex;
                }
                calculatedLengthOfArray = n * (n + 1)/2;
                LengthOfArray = lastIndex + 1;
            }
        }
        return 1;
    }
}
