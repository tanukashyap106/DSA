/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
   let map=new Map();
    for(let i=0;i<nums.length;i++){
        let res=target-nums[i];
        if(map.has(res)){
            return [map.get(res),i];
        }
        
         map.set(nums[i],i);
         
    }
    
};