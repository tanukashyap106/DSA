/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
    if(s.length !== t.length) return false;
    let map=new Map();
    for(let i=0;i<s.length;i++){
    map[s[i]]=(!map[s[i]]) ? 1 : ++map[s[i]];
    }
    for(let i=0;i<t.length;i++){
        if(map[t[i]]<0 || !map[t[i]]){
            return false;
        }
        else{
            --map[t[i]];
        }
    }
    return true;
};