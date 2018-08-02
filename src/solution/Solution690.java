package solution;

import util.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution690 {
    public int getImportance(List<Employee> employees, int id) {
        int importance = 0;
        int i ;
        for (i = 0; i < employees.size(); i++) {
            if (employees.get(i).id == id) break;
        }
        Employee boos = employees.get(i);
        importance += boos.importance;
        for (i = 0; i < boos.subordinates.size(); i++) {
            int subordinate = boos.subordinates.get(i);
            importance += getImportance(employees, subordinate);
        }
        return importance;
    }
}
