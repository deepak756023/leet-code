class Solution {
    public List<Integer> getRow(int rowIndex) {

        if(rowIndex == 0){
            List<Integer> list = new ArrayList<>();
            list.add(1);
            return list;
        }
       List<List<Integer>> result = new ArrayList<>();

        List<Integer> initial = new ArrayList<>();
        initial.add(1);
        result.add(initial);

        for(int i = 1; i < rowIndex + 1; i++){
            List<Integer> temp = new ArrayList<>();// Creating new ArrayList everytime
            temp.add(1);
            for(int j = 1; j < i; j++){
                int value = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
                temp.add(value);
            }
            temp.add(1);
            result.add(temp);
        }
        return result.get(rowIndex);
    }
}