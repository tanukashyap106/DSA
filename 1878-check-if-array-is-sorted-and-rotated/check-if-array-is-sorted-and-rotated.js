/**
 * @param {number[]} nums
 * @return {boolean}
 */
var check = function(nums) {
    let n=nums.length;
    let count=0;
    for(let i=0;i<nums.length;i++){
        if(nums[i]>nums[i+1]){
            count++;
        }}
         if(nums[0]<nums[n-1]){
            count++;
        }
    
    return count<=1;
    
    
};