function binarySearch(arr, item) {
	let low = 0;
	let mid = null;
	let high = arr.length - 1;
	let guess = null;

	while(low <= high) {
		mid = (low +high);
        guess = arr[mid];
        if(guess == item)
            return mid
        if(guess > item)
            high = mid - 1
        else
            low = mid + 1
	}
}

myArr = [1, 3, 5, 7, 9, 12, 13, 16, 19, 23, 56, 57, 59, 65, 66, 68, 98, 103];
console.log(binarySearch(myArr, 65))