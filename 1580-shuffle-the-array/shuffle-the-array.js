/**
 * @param {number[]} nums
 * @param {number} n
 * @return {number[]}
 */
var shuffle = function(nums, n) {
   let n1= nums.slice(0,n);
   let m=nums.slice(n);
   let res=[];
   for(let i=0;i<n1.length;i++){
    res.push(n1[i]);
    res.push(m[i]);

   }
 return res;
};