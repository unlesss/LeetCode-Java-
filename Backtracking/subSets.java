package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subSets {
    //给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的
    //子集（幂集）。
    //解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
    private final List<List<Integer>> res = new ArrayList<>();
    private int[] nums;
    private final List<Integer> path = new ArrayList<>();

    public List<List<Integer>> fromInput(int[] nums) {
        this.nums = nums;
        int l = this.nums.length;
        res.add(null);
        if (l == 0) {
            return res;
        }
        dfs1(0);
        return res;
    }

    private void dfs1(int i) {
        if (i == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        //如果不选当前数，直接向下dfs
        dfs1(i + 1);
        //如果选择
        //首先将当前数加入path中
        //然后再向下dfs
        path.add(nums[i]);
        dfs1(i + 1);
        //path变量长度不是固定的，需要回溯到原来的值
        path.removeLast();
    }

    public List<List<Integer>> fromAnswer(int[] nums) {
        this.nums = nums;
        dfs2(0);
        return res;
    }

    private void dfs2(int i) {
        //每次递归都需要记录答案
        res.add(new ArrayList<>(path));
        //
        if (i == nums.length) {
            return;
        }
        //枚举当前要填的数字
        for (int j = i; j < nums.length; j++) {
            path.add(nums[j]);
            dfs2(j + 1);
            path.removeLast();
        }
    }

}
