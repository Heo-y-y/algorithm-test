class Solution {
    public int solution(int chicken) {
        int count = 0;
        
        // 치킨이 10보다 크거나 같을 동안
        while(chicken >= 10) {
            // 쿠폰에 나머지 할당
            int coupon = chicken % 10;
            // 치킨 수에 치킨값에 10을 나눈 값 더함
            count += chicken / 10;
            // 치킨에 쿠폰 + 치킨에 10 나눈 값 할당
            chicken = coupon + chicken / 10;
        }
        
        return count;
    }
}