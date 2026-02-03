/**
 * @param {string} s
 * @return {number}
 */
function secondHighest(s) {
    let f=-1;
    let sec=-1;
    for(let i=0;i<s.length;i++){
        if(s[i]>='0' && s[i]<='9'){
            let val=Number(s[i]);
            if(val>f){
                sec=f;
                f=val
            }
            else if(val>sec && val<f){
                sec=val;
            }
        }
    }
    return sec;
    
}
