package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class letterCombinations {
    //给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
    //
    //给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
    //
    //"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"

    private static final String[] MAPPING = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    private final List<String> res = new ArrayList<>();
    private char[] digits, path;

    public List<String> simpleDFS(String digits) {
        int l = digits.length();
        if (l == 0) {
            return List.of();
        }
        this.digits = digits.toCharArray();
        path = new char[l];
        dfs(0);
        return res;
    }

    private void dfs(int i) {
        if (i == digits.length) {
            res.add(new String(path));
            return;
        }
        for (char c : MAPPING[digits[i] - '0'].toCharArray()) {
            path[i] = c;
            dfs(i + 1);
        }
    }
}
