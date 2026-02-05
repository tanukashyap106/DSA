/**
 * @param {string[]} tokens
 * @return {number}
 */
var evalRPN = function(s) {
    let stack=[];

    for(let i=0;i<s.length;i++){
        if(s[i]=="+" || s[i]=="-" || s[i]=="*"||s[i]=="/"){
           let a=stack.pop();
           let b=stack.pop();
           let ans=eval(`${b} ${s[i]} ${a}`);
           stack.push(Math.trunc(ans));
        }
        else {
            stack.push(s[i]);
        }
    }
    return Number(stack.pop());
};