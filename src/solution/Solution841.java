package solution;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 2018-06-11.
 */
public class Solution841 {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        List<Integer> visited = new ArrayList<>();
        visited.add(0);
        return visitRooms(rooms, 0, visited);
    }

    public boolean visitRooms(List<List<Integer>> rooms, int start, List<Integer> visitedRooms) {
        boolean result = false;
        if (visitedRooms.size() == rooms.size())
            return true;
        for (int room :
                rooms.get(start)) {
            if (!visitedRooms.contains(room)) {
                visitedRooms.add(room);
                result = result || visitRooms(rooms, room, visitedRooms);
            }
        }
        return result;
    }
}
