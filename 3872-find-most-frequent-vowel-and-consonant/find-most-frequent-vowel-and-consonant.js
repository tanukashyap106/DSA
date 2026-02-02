/**
 * @param {string} s
 * @return {number}
 */
var maxFreqSum = function(s) {
    let map={};
    for(let i=0;i<s.length;i++){
        if(!map[s[i]]){
            map[s[i]]=1;
        }
        else{
            ++map[s[i]];
        }
    
    }
    let a=['a','e','i','o','u']
    let maxvowel=0;
    let maxconsonant=0;
    for(let i=0;i<s.length;i++){
        if(a.includes(s[i])){
            if(map[s[i]]>maxvowel){
                maxvowel=map[s[i]];
            }
        }
        else{
            if(map[s[i]]>maxconsonant){
                maxconsonant=map[s[i]];
            }
        }
    }
    return maxvowel+maxconsonant;
};