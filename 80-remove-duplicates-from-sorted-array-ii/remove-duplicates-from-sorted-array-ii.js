/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    let a=2;
    for(let i=2;i<nums.length;i++){
        if(nums[i]!==nums[a-2]){
            nums[a]=nums[i];
            a++;
        }
    }
    return a;
};