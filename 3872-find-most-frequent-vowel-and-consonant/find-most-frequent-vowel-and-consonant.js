/**
 * @param {string} s
 * @return {number}
 */
var maxFreqSum = function(s) {
    let map={};
    for(let i=0;i<s.length;i++){
        map[s[i]]=!map[s[i]] ? 1 : ++map[s[i]];
    }
    let a=['a','e','i','o','u']
    let maxvowel=0;
    let maxconsonant=0;
    let mapkey=Object.keys(map);
    for(let i=0;i<mapkey.length;i++){
        if(a.includes(mapkey[i])){
            maxvowel=Math.max(maxvowel,map[mapkey[i]]);
        }
        else{
            maxconsonant=Math.max(maxconsonant,map[mapkey[i]]);
        }
    }
    return maxconsonant+ maxvowel;
};