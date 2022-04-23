/*
 * @lc app=leetcode id=690 lang=java
 *
 * [690] Employee Importance
 */

// @lc code=start
/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    HashMap<Integer,Employee> mp;
    int res = 0;
    public int getImportance(List<Employee> employees, int id) {
        mp = new HashMap<>();
        for(Employee e : employees) {
            mp.put(e.id, e);
        }

        res = 0;
        solve(id);
        return res;
    }

    void solve(int id) {
        Employee e = mp.get(id);
        res+=e.importance;

        for(int x : e.subordinates) {
            solve(x);
        }
    }
}
// @lc code=end

