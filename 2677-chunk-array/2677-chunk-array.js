/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array[]}
 */
var chunk = function(arr, size) {
  let output = [];
  let i = 0;

  while (i < arr.length) {
    output.push(arr.slice(i, i + size));
    i += size;
  }

  return output;
    
};
