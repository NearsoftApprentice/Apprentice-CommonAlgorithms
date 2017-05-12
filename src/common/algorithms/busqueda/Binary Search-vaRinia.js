function binarySearch(inputArray, t) {
  var p = inputArray[parseInt(inputArray.length/2)];
  var index = inputArray.indexOf(p);
  if (t < p) {
    var i = 0;
    while (i < index) {
      if(t === (inputArray[i])) {
        return i;
      } else if (t != (inputArray[i])) {
        i++;
      }
    }
    return false;
  } else {
    while (index < (inputArray.length)) {
      if(t === (inputArray[index])) {
        return index;
      } else if (t != (inputArray[index])) {
        index++;
      }
    }
    return false;
  }
}


var l = [1, 2, 3, 5, 5, 6, 7, 8, 9, 30, 301];
binarySearch(l, 2);
