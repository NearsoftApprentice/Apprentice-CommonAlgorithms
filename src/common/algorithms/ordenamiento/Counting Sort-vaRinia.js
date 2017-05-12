function countingSort(inputArray, maxVal) {
  var containers = [];
  var sortedArray = [];
  var k = 0;
  var l = 0;
  for (j = 0; j < maxVal+1; j++){
    containers[j] = 0;
  }
  for(i = 0; i < inputArray.length; i++) {
    containers[(inputArray[i])] = (containers[inputArray[i]]) + 1;
  }
  //console.log("Conteo de elementos: " + containers);
  while (l < inputArray.length) {
    if(containers[k] === 0) {
      k++;
    } else {
    sortedArray[l] = k;
    containers[k] = containers[k] - 1;
    l++;
    }
  }
  return sortedArray;
}

var a = [9 ,11, 4, 5, 5, 3, 2, 4, 4, 4, 9, 10, 11, 10, 1];

countingSort(a, 11);
