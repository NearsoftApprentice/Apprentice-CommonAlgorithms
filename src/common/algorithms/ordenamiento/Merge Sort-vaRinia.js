function mergeSort(array1, array2) {
  var len = array1.length + array2.length;
  len = len;
  var array3 = new Array(len);
  for(i = 0; i <= len; i++) {
    if (array1.length === 0) {
      while (array2.length > 0) {
        array3[i] = array2[0];
        array2.shift();
        i++;
      }
    } else if (array2.length === 0) {
      while (array1.length > 0) {
        array3[i] = array1[0];
        array1.shift();
        i++;
      }
    } else if(array1[0] < array2[0]) {
      array3[i] = array1[0];
      array1.shift();
    } else {
      array3[i] = array2[0];
      array2.shift();
    }
  }
  return array3;
}

var l = [1, 5, 8, 12, 35, 40, 50, 60, 300, 301];
var r = [0, 3, 10, 15, 20, 21, 22, 51, 500, 600, 700];

mergeSort(l,r);
