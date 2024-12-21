public class Main {
    public static void main(String[] args) {
        int[] apple = {1,3,2};
        int[] capacity = {4,3,1,5,2};
        int max = 0;
        int  maxIndex = 0;
        int sumOfApple = 0;
        int capacityOfBags = 0;
        int box = 0;
        for(int i = 0; i<apple.length; i++){
            sumOfApple+=apple[i];
        }
        while(sumOfApple>0){

            for(int j = 0; j<capacity.length; j++){
                if(capacity[j]>max){
                    max = capacity[j];
                    maxIndex = j;
                }
            }
           capacity[maxIndex] = 0;
            sumOfApple = sumOfApple-max;
            max=0;
            box++;
        }
        System.out.println(box);

    }
}
