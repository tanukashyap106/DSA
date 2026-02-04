/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var rotate = function(nums, k) {
    let n=nums.length;
    k=k%n;
    let start=0;
    let end=n-1;
    while(start<end){
        [nums[start],nums[end]]=[nums[end],nums[start]];
        start++;
        end--;
    }
    start=0;
    end=k-1;
    while(start<end){
        let temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
        start++;
        end--;
    }
    start=k;
    end=n-1;
    while(start<end){
        let temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
        start++;
        end--;
    }

};