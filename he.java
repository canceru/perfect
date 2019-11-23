import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        int begin = 0;
        int end = array.length - 1;
        int sumt = 0;
        while(begin < end){
            sumt = array[begin] + array[end];
            if(sumt == sum){
                res.add(array[begin]);
                res.add(array[end]);
                return res;
            }
            if(sumt < sum){
                begin++;
            }else{
                end--;
            }
        }
        return res;
    }
}
