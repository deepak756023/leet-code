class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // int count = 0;
        // int max = 0;
        // for(int i = 0; i < flowerbed.length; i++){
        //     if(flowerbed[i] == 0){
        //         count++;
        //         if(max < count){
        //             max = count;
        //         }

        //     }else{
        //         count = 0;
        //     }
        // }
        // if(max >= 2 * n + 1){
        //     return true;
        // }
        // if(flowerbed[0] == 0 || flowerbed[flowerbed.length-1] == 0 && max >= 2 * n){
        //     return true;
        // }
        // return false;

        int len = flowerbed.length;
        if(len == 1){
            if((flowerbed[0] == 0 && (n == 1 || n == 0)) || flowerbed[0] == 1 && n == 0){
                return true;
            }else{
                return false;
            }
        }

    if (len >= 2 && flowerbed[0] == 0 && flowerbed[1] == 0) {
        flowerbed[0] = 1;
        n--;
    }

    for (int i = 1; i < len - 2 && n > 0; i++) {
        if (flowerbed[i] == 0 && flowerbed[i + 1] == 0 && flowerbed[i + 2] == 0) {
            flowerbed[i + 1] = 1;
            n--;
            i++; 
        }
    }

    if (len >= 2 && flowerbed[len - 2] == 0 && flowerbed[len - 1] == 0) {
        if (flowerbed[len - 1] == 0) {
            flowerbed[len - 1] = 1;
            n--;
        }
    }

    return n <= 0;

    }
}