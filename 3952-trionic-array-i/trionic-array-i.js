/**
 * @param {number[]} nums
 * @return {boolean}
 */
var isTrionic = function(nums) {
    let n=nums.length;
    let i=0;
    while(i<n-1 && nums[i]<nums[i+1]){
        i++;
    }
    if(i===0 || i===n-1) return false;
    let x=i;
    while(i<n-1 && nums[i]>nums[i+1]){
        i++;
    }
    if(i===x || i===n-1) return false;
    let y=i;
    while(i<n-1 && nums[i]<nums[i+1]){
        i++;
    }
    return (i>y && i===n-1);
};