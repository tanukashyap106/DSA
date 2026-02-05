/**
 * @param {number[]} nums
 * @return {number[]}
 */
var constructTransformedArray = function(nums) {
    let n=nums.length;
    let result=[];
    for(let i=0;i<n;i++){
            let step=(i+nums[i])%n;
            if(step<0){
                step+=n;
            } 
    result[i]=nums[step];
    }
    return result;
};