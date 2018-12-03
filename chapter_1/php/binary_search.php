<?php

function binarySearch($arr, $item) {
	$low = 0;
	$mid = 0;
	$high = count($arr) - 1;
	$guess = 0;

	while($low <= $high) {
		$mid = $low + $high;
        $guess = $arr[$mid];
        if($guess == $item)
            return $mid;
        if($guess > $item)
            $high = $mid - 1;
        else
            $low = $mid + 1;
	}
}

$myArr = array(1, 3, 5, 7, 9, 12, 13, 16, 19, 23, 56, 57, 59, 65, 66, 68, 98, 103);
echo binarySearch($myArr, 65);

?>