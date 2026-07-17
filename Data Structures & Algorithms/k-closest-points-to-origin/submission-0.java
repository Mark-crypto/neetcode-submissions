class Solution {
    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[0], b[0])
        );

        for (int[] point : points) {
            int distance = point[0] * point[0] + point[1] * point[1];
            minHeap.offer(new int[]{distance, point[0], point[1]});
        }

        int[][] result = new int[k][2];

        for (int i = 0; i < k; i++) {
            int[] curr = minHeap.poll();
            result[i][0] = curr[1];
            result[i][1] = curr[2];
        }

        return result;
    }
}