import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class findIntersectionValues {
    //给你两个下标从 0 开始的整数数组 nums1 和 nums2 ，它们分别含有 n 和 m 个元素。
    //
    //请你计算以下两个数值：
    //
    //统计 0 <= i < n 中的下标 i ，满足 nums1[i] 在 nums2 中 至少 出现了一次。
    //统计 0 <= i < m 中的下标 i ，满足 nums2[i] 在 nums1 中 至少 出现了一次。
    //请你返回一个长度为 2 的整数数组 answer ，按顺序 分别为以上两个数值。

    public int[] hashSet(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int x : nums1) {
            set1.add(x);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for (int x : nums2) {
            set2.add(x);
        }
        int[] ans = new int[2];
        for (int x : nums1) {
            if(set2.contains(x)){
                ans[0] ++;
            }
        }
        for (int x : nums2) {
            if(set1.contains(x)){
                ans[1] ++;
            }
        }
        return ans;
    }
}
