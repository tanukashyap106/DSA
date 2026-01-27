/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxConsecutiveOnes = function(nums) {
    let Currentcount=0;
    let Maxcount=0;
    for(let i=0;i<nums.length;i++){
        if(nums[i]===1){
            Currentcount++;
         }
        else{
        Maxcount=Math.max(Currentcount,Maxcount);
        Currentcount=0;
        }
        
    }
    
    return Math.max(Currentcount,Maxcount);
};