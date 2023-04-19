/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    let output = init;
    for(let n of nums){
        output = fn(output, n);
    }
    return output;
};