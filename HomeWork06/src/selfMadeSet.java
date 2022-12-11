import java.util.*;

public class selfMadeSet {
    Map<Integer, Object> mySet = new TreeMap<>();
    Object x = new Object();
    public void add(int y) {
        mySet.put(y, x);
    }
    public ArrayList printSet() {
        ArrayList<Integer> helpList = new ArrayList<>(mySet.size()) ;
        for (int a: mySet.keySet()) {helpList.add(a);}
        return helpList;
    }
//    public ArrayList reverseComparator() {
//        ArrayList<Integer> helpList = new ArrayList<>(mySet.size()) ;
//        Iterator<Integer> myIterator = mySet.keySet().iterator();
//        while (myIterator.hasNext()) {
//            helpList.add(myIterator.next());
//        }
//        Collections.sort(helpList, Collections.reverseOrder());
//        return helpList;
//    }
    }
