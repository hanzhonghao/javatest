package lintcode;

/**
 * Created by zhonghao.han on 8/2/2018.
 * 写出一个高效的算法来搜索 m × n矩阵中的值。
 * <p>
 * 这个矩阵具有以下特性：
 * <p>
 * 每行中的整数从左到右是排序的。
 * 每行的第一个数大于上一行的最后一个整数。
 * 您在真实的面试中是否遇到过这个题？
 * 样例
 * 考虑下列矩阵：
 * <p>
 * [
 * [1, 3, 5, 7],
 * [10, 11, 16, 20],
 * [23, 30, 34, 50]
 * ]
 * 给出 target = 3，返回 true
 */
public class lintcode28 {
  /**
   * @param matrix: matrix, a list of lists of integers
   * @param target: An integer
   * @return: a boolean, indicate whether matrix contains target
   */
  public boolean searchMatrix(int[][] matrix, int target) {
    // write your code here
    if (matrix == null)
      return false;
    int m = matrix.length;
    if (m == 0)
      return false;
    int n = matrix[0].length;//需要注意的地方，这不是n*n的矩阵
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++)
        if (matrix[i][j] == target)
          return true;
    }
    return false;
}

  public static void main(String args[]) {
        int[][] n = { {1,3,5,7},{10,11,16,20},{23,30,34,50} };
//    int[][] n = { { 1, 3, 5 }, { 10, 11, 16 }, { 30, 34, 50 } };
    int target = 7;
    lintcode28 lintcode28 = new lintcode28();
    boolean b = lintcode28.searchMatrix(n, target);
    System.out.println(b);
  }

}
