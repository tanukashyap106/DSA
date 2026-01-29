/**
 * @param {number[]} nums
 * @return {number[]}
 */
var sortArray = function(nums) {
    if(nums.length<=1) return nums;
    let m=Math.floor(nums.length/2);
    let left=sortArray(nums.slice(0,m));
    let right=sortArray(nums.slice(m));
    return merge(left,right);
    
};
function merge(left,right){
    let result=[];
    let i=0;
    let j=0;
    while(i<left.length && j<right.length){
        if(left[i]<right[j]){
           result.push(left[i]);
           i++;
        }
        else{
            result.push(right[j]);
            j++;
        }
    }
    return [...result,...left.slice(i),...right.slice(j)];
}