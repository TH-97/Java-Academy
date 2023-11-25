package day03;

import java.util.Arrays;

public class ArraySearch2 {
	public static void main(String[] args) {
		
		//이진탐색 - 배열에서 반을 잘라가면서 값을 찾는 방법
		//조건 - 반드시 정렬이 되어 있어야 합니다.
		
		/*
		 * 1. 위치변수( start, end)를 처음과 끝에 지정
		 * 2. 중간값을 구함
		 * 3. 중간값이 찾는값인지 확인
		 * 4. 중간값이 찾는값보다 크다면, end를  mid-1로 내리고
		 * 5. 중간값이 찾는값보다 작으면, start  mid+1로 올림
		 */
		
		int[] arr = {1,2,3,4,5,10,20,30,50,80,100};
		
		int find = 50; //찾는값
		
		
		int start = 0;
		int end = arr.length -1; //마지막인덱스
		
		while(start <= end) { //탈출의 조건 start 와 end 가 교차지점이 생기면 반복 중
			int mid = (start + end /2);
			
			if(arr[mid] == find) { //값을 찾음
				System.out.println(find + "는" + mid + "번째에 있습니다");
				break;
			}
			
			if(arr[mid] < find) { // 중간값이 찾을값보다 작은경우
				start = mid + 1;
			} else { // 중간값이 찾을 값보다 큰경
				end = mid -1;
			}
		}
		if(start > end) { //값을 찾지 못한 조건
			System.out.println(find + "는 없습니다");
		}
		
		System.out.println("---");
		//이진 탐색 기능 - ( 찾을 배열, 찾을값 )
		System.out.println(Arrays.binarySearch(arr, 50)); //찾은 위치를 반
		System.out.println(Arrays.binarySearch(arr, 52)); // 찾을 값이 없다면 음수반
		
		
	}

}
