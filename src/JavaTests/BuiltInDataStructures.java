package JavaTests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

/*
Java.util.collection ---
classes. 
List, Map and Set.
static methods (important ones to me)
-- binary search(list, key, comparator) //list has to be sorted in ascending order
-- frequency (collection, object)
-- sort(list, comparator)
-- swap(list, i, j)

classes 
list (interface)
-- add(element) //adds to the end of the list
-- add(element, index) 
-- clear
-- contains(element)
-- get(index)
-- indexOf(element)
-- isEmpty()
-- remove(index)
-- size
-- toArray()

arrayList(array based implementation of list. keeps adding element. when needed, expand the array into a new and bigger one. 
unsynchronized. other than that similar
to the vector class. get, set, size runs on constant time)

vector (synchronized list. similar to arraylist)

LinkedList
doubly linked list implemenatation, not synchronized.
can be used as linked list, stack or queue
methods (all methods in the abstract list is included)
-- addFirst
-- addList
-- getFirst
-- getLast
-- peek //retrieves but does not remove
-- peekFirst //
-- peekLast
-- poll  //retrive and remove the first
-- pollFirst
-- pollLast
-- pop // pop element when the list represents a stack
-- push

Stack

methods
-- peek
-- pop
-- push
-- empty
-- search(element)


**************************
Set(interface)
methods
-- add(element) //adds the element if it already is not present there
-- clear   //clears all the element
-- contains(object)
-- isEmpty
-- remove(object)

HashSet
constant time operation (add, remove, contains, size). Order of the elements are not gurranted (they can be of any order).

methods (see the methods of the abstract list)

TreeSet
elements are sorted. add, remove, contains operations are log n time. 

methods
-- descendingIterator
-- first() // returns the first element in the sorted set. smallest
-- last() // returns the highest element of the set
-- pollFirst() // retrieves and removes the first
-- pollLast() // retrieves and removes the last

Priority Queue

Implements queue interface. works as a min heap. elements are ordered as natural ordering or by the comparator provided. 
head is the least element. 
peek, poll, remove works on the head of the queue. 
methods
-- add
-- clear
-- contains(object)
-- peek //retrieve but not remove
-- poll //retrieve and remove
-- remove
-- remove (object) //remove the element if present
-- size
-- toArray

Map (Interface)
all the keys are unique.

methods
-- clear
-- containsKey(key)
-- containsValue(value)
-- isEmpty
-- keySet   // returns the Set with all the keys
-- put(key, value)
-- remove(key)
-- size()
-- values()  // returns the Collection of all the values. note duplicate values are maintained by the Collection

HashMap
hash table based implementation of the map. performance depends on initial size and load factor. 
increases its capacity by 2 if load factor reaches .75 and rehashes every element into the new table.
if many key-value pair to be stored, initilize the hashmap with a large value to avoid unnecessary rehashes.
accepts NULL keys and NULL values. 

methods (all the methods of the map interface)

TreeMap
RedBlack Tree (Balanced Binary Tree) based implementation. Map is sorted according to the natural ordering. 
guarrented log n time operation for containsKey, get, put and remove method.

method
-- all method of map
-- descendingKeySet
-- firstEntry // the first or least key
-- lastEntry // the last or the highest key
-- pollFirstEntry
-- pollLastEntry
*/
public class BuiltInDataStructures {
    public static void main(String args[]){
        //useArrayList();
        //useSets();
        //usePriorityQueue();
        //useHashMap();
        //useTreeMap();
        implementedAlogrithms();
    }//end of method
    
    public static void useTreeMap(){
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        tm.put(100, 10);
        tm.put(36, 6);
        tm.put(1, 1);
        tm.put(25, 5);
        
        for(Integer key : tm.keySet()){
            System.out.println(key + " : " + tm.get(key));
        }//end for
    }//end of method
    
    public static void useHashMap(){
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(1, 1);
        hm.put(2, 100);
        hm.put(3, 20);
        
        if(hm.containsKey(3)){
            int val = hm.get(3);
            System.out.println("value of 3 " + val);
        }//end if
        
        hm.remove(3);
        System.out.println("Is 3 containted in the list? " + hm.containsKey(3));
        
        for(Integer key : hm.keySet()){
            System.out.println(key + " : " + hm.get(key));
        }//end for
    }//end of method
    
    public static void usePriorityQueue(){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
            
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);
        pq.add(0);
        
        if(pq.contains(4)){
            pq.remove(4);
        }//end if
        
        
        
        Iterator<Integer> itr = pq.iterator();
        
        //note the output will not be sorted
        // the output 0 1 3 2. because we are not extacting just going through it
        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
        
        pq.peek(); //peek the least elem
        pq.poll(); //remove the least elem
        System.out.println();
        
    }//end of method
    
    
    
    public static void useArrayList(){
        ArrayList<Integer> arl = new ArrayList<Integer>();
        arl.add(1);
        arl.add(2);
        arl.add(3);
        for(int i = 0; i < arl.size(); i++){
            System.out.print(arl.get(i) + " ");
        }
        System.out.println();
        
        Vector<Integer> v = new Vector<>();
       
    }//end of method
    
    public static void useLinkedList(){
        //use as a linkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.addLast(2);
        linkedList.addFirst(3);
        
        //use as a stack
        //Stack<Integer> stack = new Stack<>();
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        stack.pop();
        
        //use as a queue
        LinkedList<Integer> queue = new LinkedList<>();
        queue.addLast(1);
        queue.addLast(2);
        
        queue.getFirst();
        queue.getFirst();
    }//end of method
    
    public static void useStack(){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        
        stack.pop();
        stack.empty();
        stack.clear();
    }//end of method
    
    public static void useSets(){
        //hashset
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        if(hashSet.contains(3)){
            hashSet.remove(3);
        }//end if
        Iterator<Integer> itr = hashSet.iterator();
        while(itr.hasNext()){
            int key = itr.next();
        }//end while
        hashSet.clear();
        
        //using tree set
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(4);
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);
        
        System.out.println("tree set contains 1?" + treeSet.contains(1));
        System.out.println("first element " + treeSet.first());
        System.out.println("treeset last element " + treeSet.last());
        
        treeSet.pollFirst();
        treeSet.pollLast();
    }//end of method
    
    static void implementedAlogrithms(){
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 10; i > 0; i--){
            list.add(i);
        }
        
        list.sort(new Comparator<Integer>(){
            public int compare(Integer t, Integer t1){
                return t - t1;
            }
        });
        
        int b = Collections.binarySearch(list, 7);
        System.out.println("binary search " + b);
    }
}//end of class

