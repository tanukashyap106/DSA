/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
var merge = function(nums1, m, nums2, n) {
    let n1Copy=nums1.slice(0,m);
    let P1=0;
    let P2=0;
    for(let i=0;i<(m+n);i++){
        if(P2>=n || (P1<m && n1Copy[P1]<nums2[P2])){
            nums1[i]=n1Copy[P1];
            P1++;
        }
        else{
            nums1[i]=nums2[P2];
            P2++;
        }
    }
    
};