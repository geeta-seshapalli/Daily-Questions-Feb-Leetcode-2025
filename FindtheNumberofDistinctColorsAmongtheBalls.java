import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        // Map to store the current group for each element
        Map<Integer, Integer> groupMap = new HashMap<>();
        // Map to count the occurrences of each group
        Map<Integer, Integer> countMap = new HashMap<>();
      
        int queryLength = queries.length;
        int[] results = new int[queryLength];
      
        for (int i = 0; i < queryLength; ++i) {
            int element = queries[i][0];
            int newGroup = queries[i][1];
          
            // Increase the count for the new group
            countMap.merge(newGroup, 1, Integer::sum);
          
            // If the element already has a group, decrease the count of the old group
            if (groupMap.containsKey(element)) {
                int oldGroup = groupMap.get(element);
                if (countMap.merge(oldGroup, -1, Integer::sum) == 0) {
                    countMap.remove(oldGroup);
                }
            }
          
            // Update the group of the element
            groupMap.put(element, newGroup);
          
            // Store the count of different groups in the result array
            results[i] = countMap.size();
        }
      
        return results;
    }
}