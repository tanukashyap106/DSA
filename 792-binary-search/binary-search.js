/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var search = function(nums, target) {
    let l=0;
    let r=nums.length-1;
    while(r>=l){
    let middle=Math.floor((r+l)/2);
    if(nums[middle]===target){
        return middle;
    }
    else if(target>nums[middle]){
        l=middle+1;
    }
    else{
    r=middle-1;
    }}
    return -1;

};