/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {
    let x1=x;
    x=Math.abs(x);

    let rev=0
    while(x>0){
        let rem=x%10;
        rev=(rev*10)+rem;
        x=Math.floor(x/10);
    }
    let l=2**31;
    if(rev<-l || l<rev) return 0;
    return (x1<0) ? -rev: rev;

    
};