/**
 * @param {string} s
 * @param {number} k
 * @return {string}
 */
var reverseStr = function(s, k) {
     s=s.split("");
    for(let x=0;x<s.length;x=x+(2*k)){

        let mid =Math.floor(k/2);
        for(let j=0;j<mid;j++){
        let temp=s[x+j];
        s[x+j]=s[x+k-1-j];
        s[x+k-1-j]=temp;
        }

    }
    return s.join("");

};