/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var minRemoval = function(nums, k) {
    nums.sort((a,b)=>a-b);
    let n=nums.length;
    let right=0;
    let max=0;
    for(let i=0;i<n;i++){
        while(right<n && nums[right]<=nums[i]*k){
            right++;
        }
        max=Math.max(max,right-i);
    }
    return n-max;
};