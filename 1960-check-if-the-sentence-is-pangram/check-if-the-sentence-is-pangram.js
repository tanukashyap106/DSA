/**
 * @param {string} sentence
 * @return {boolean}
 */
var checkIfPangram = function(sentence) {
    let set=new Set();
    for(let i=0;i<sentence.length;i++){
        set.add(sentence[i]);
    }
    if(set.size===26) return true;
    else 
    return false;
    
};