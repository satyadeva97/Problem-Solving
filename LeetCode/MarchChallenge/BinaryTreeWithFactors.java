class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        
        Map<Integer, Integer> map = new HashMap<>();
        int mod = 1000000007;
        Arrays.sort(arr);
        map.put(arr[0], 0);
        long[] dp = new long[arr.length];
        Arrays.fill(dp, 1);
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j>= 0; j--) {
                if (arr[i] % arr[j] == 0 && map.containsKey(arr[i] / arr[j])) {
                    dp[i] = (dp[i] + (dp[j] * dp[map.get(arr[i] / arr[j])]) % mod) % mod;
                }
                
            }
            map.put(arr[i], i);
        }
        long result = 0;
        for (long x: dp) {
            result = (result + x) % mod;
        }
        return (int) result;
        
    }
}
