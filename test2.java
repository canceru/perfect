public int[] reOrderArray (int[] array) {
        // write code here
        int i=0;
        int j = array.length-1;
        while(i<j){
            if(i<j && (array[i] % 2) !=0){
                i++;
            }
            if(i<j && (array[j] % 2) ==0){
                j--;
            }
            int tmp = array[i];
            array[i] =array[j];
            array[j] = tmp;
            i++;
            j--;
        }
        return array;
    }