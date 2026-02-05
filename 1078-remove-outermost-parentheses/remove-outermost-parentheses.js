/**
 * @param {string} s
 * @return {string}
 */
var removeOuterParentheses = function(s) {
    let stack=[];
    let res="";
    for(let i=0;i<s.length;i++){
        if(s[i]==="("){
            stack.push(s[i]);
            let l=stack.length;
            if(l>1){
                res+=s[i];
            }

        }else{
            let l=stack.length;
            if(l>1){
                res+=s[i];
            }
            stack.pop();
        }
    }
    return res;
    
};