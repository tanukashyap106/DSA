/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSumTrionic = function(nums) {
    let n=nums.length;
    let result=-Infinity;

    for(let i=1;i<n-2;)
    {
        let a=i;
        let b=i;
        let net=BigInt(nums[a]);

    
    while(b<n-1 && nums[b+1]<nums[b]){
        net+=BigInt(nums[++b]);
    }
    if(b===a){
        i++;
        continue;
    }
    let c=b;
    let left=0n,right=0n;;
    let lx=-BigInt(1e16), rx=-BigInt(1e16);
    while(a-1>=0 && nums[a-1]<nums[a]){
        left+=BigInt(nums[--a]);
        if(left>lx) lx=left;
    }
    if(a===i){
        i++;
        continue;
    }
    while(b<n-1 && nums[b+1]>nums[b]){
        right+=BigInt(nums[++b]);
        if(right>rx) rx=right;
    }
    if(b===c){
        i++;
        continue;
    }
    let totalsum=Number(net+lx+rx);
    if(totalsum>result) result=totalsum;
    i=b;
}
return result;
};