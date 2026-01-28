/**
 * @param {number} n
 * @return {boolean}
 */
var isPowerOfFour = function(n) {
    if(n===1) return true;
    else if(n<1||n%4!==0) return false;
    return isPowerOfFour(n/4);
};