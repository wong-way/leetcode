package solution;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by DELL on 2018-06-08.
 */
public class Solution797 {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<List<Integer>>> result = new ArrayList<>();
        for (int i = 0; i < graph.length; i++) {
            List<List<Integer>> list = new ArrayList<>();
            result.add(list);
        }
        for (int i = 0; i < graph.length; i++) {
            int source = i;
            for (int j = 0; j < graph[i].length; j++) {
                int target = graph[i][j];
                if (source == 0) {
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(source);
                    temp.add(target);
                    result.get(target).add(temp);
                } else {
                    for (int k = 0; k < result.get(source).size(); k++) {
                        List<Integer> temp = new ArrayList<Integer>();
                        temp.addAll(result.get(source).get(k));
                        temp.add(target);
                        result.get(target).add(temp);
                    }
                }

            }
        }
        return result.get(graph.length - 1);
    }

    public List<List<Integer>> allPathsSourceTarget1(int[][] graph) {
        return allPathsFromSource(graph, 0);
    }

    public List<List<Integer>> allPathsFromSource(int[][] graph, int source) {
        List<List<Integer>> result = new ArrayList<>();
        if (source == graph.length - 1) {
            List temp = new ArrayList();
            temp.add(source);
            result.add(temp);

            return result;
        }
        for (int i = 0; i < graph[source].length; i++) {
            List<List<Integer>> part = allPathsFromSource(graph, graph[source][i]);
            for (int j = 0; j < part.size(); j++) {
                List temp = new ArrayList();
                temp.add(source);
                temp.addAll(part.get(j));
                result.add(temp);
            }

        }
        return result;
    }

    public List<List<Integer>> allPathsSourceTarget2(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        path.add(0);
        dfsSearch(graph, 0, res, path);

        return res;
    }

    private void dfsSearch(int[][] graph, int node, List<List<Integer>> res, List<Integer> path) {
        if (node == graph.length - 1) {
            res.add(new ArrayList<Integer>(path));
            return;
        }

        for (int nextNode : graph[node]) {
            path.add(nextNode);
            dfsSearch(graph, nextNode, res, path);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {

        int[][] graph = new int[][]{{1,2}, {3}, {3}, {}};
        Solution797 solution = new Solution797();
        System.out.println(solution.allPathsSourceTarget(graph));

    }
}
