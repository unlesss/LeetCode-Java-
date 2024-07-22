package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    //LC131
    //Given a string s, partition s such that every substring of the partition is a palindrome
    //Return all possible palindrome partitioning of s.

    private final List<List<String>> ans = new ArrayList<>();
    private final List<String> path = new ArrayList<>();
    private String s;

    public List<List<String>> backTrackingFromAnswerPerspective(String s) {
        this.s = s;
        dfs(0);
        return ans;
    }

    private boolean isPalindrome(int left, int right) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }

    private void dfs(int i) {
        if (i == s.length()) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int j = i; j < s.length(); ++j) {
            if (isPalindrome(i, j)) {
                path.add(s.substring(i, j + 1)); //subString() : from arg1 to arg2 - 1
                dfs(j + 1);
                path.removeLast();
            }
        }
    }

}
