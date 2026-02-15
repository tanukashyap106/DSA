class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> tri=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> row=new ArrayList<>(Collections.nCopies(i+1,1));
            for(int j=1;j<i;j++){
                row.set(j,tri.get(i-1).get(j-1)+tri.get(i-1).get(j));
            }
            tri.add(row);
        }
        return tri;
        
    }
}