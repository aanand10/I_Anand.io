package practice;
// package required for hashset
import  java.util.*;

public class HashSetClass {
    public static void main(String[] args) {
    // creating hashset =>
        HashSet newHashSet = new HashSet();
        // we can specify type also like  HashSet<Integer> newHashSet = new HashSet<>();

        // adding elements in  hashset
        // here insertion order is not preserved
        // Note : we can't do duplicate entries in hashset

        newHashSet.add("A");
        newHashSet.add("Anand");
        newHashSet.add(10);
        newHashSet.add("Java");

        newHashSet.add("Anand"); // this will show false means this can't be added
        System.out.println("Value written when duplicate value tried to add : "+  newHashSet.add("Anand"));
        System.out.println(newHashSet);

    }
}
