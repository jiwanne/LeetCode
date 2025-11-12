class Solution {
    // 정수형 배열 int [] nums 이랑 int target 을 줄때
    // 2개의 숫자를 나타내게 리턴해라 배열끼리 add해서 target 이랑 같으면 배열 두개 좌표 나타내라

    
    
    // 예시 1 nums = [2,7,11,15] , target = 9 일때
    // output은 [0,1]

    public int[] twoSum(int[] nums, int target) {
        /*
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        */

        int [] answer = new int [2];

        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(i != j && nums[i] + nums[j] == target) {
                    answer[0] = i;
                    answer[1] = j;
                    return answer;
                }
                
            }
              
        }
        return answer;
    }
}