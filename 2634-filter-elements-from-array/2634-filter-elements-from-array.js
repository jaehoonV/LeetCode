/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    let output = [];
    
    for(let a = 0; a < arr.length; a++){
        if(fn(arr[a], a)) output.push(arr[a]);
    }
    
    return output;
};