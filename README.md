# Java Basic to Advance Concepts

What I've done so far in Java Programming.
Here all the basic to advance concepts are implemented by me.


## Lessons Learned

- How Iteration in java works.
```bash
  Iterator<String> it = arrl1.iterator();
```
Where it belongs.
```bash
  import java.util.Iterator;
```

- How ArrayLIst in java works.
```bash
  ArrayList<String> arrl1 = new ArrayList<>();
        arrl1.add("BMW");
        arrl1.add("Tesla");
        arrl1.add("Farrari");
```
Where it belongs.
```bash
  import java.util.ArrayLIst;
```

- How HashSet in java works.
```bash
  HashSet<String> HS = new HashSet<>();

        HS.add("BMW");
        HS.add("Farrari");
        HS.add("Tesla");
        HS.add("You poor");
```
Where it belongs.
```bash
  import java.util.HashSet;
```

- How Wrapper Class in java works. I've used it already.
```bash
 ArrayList<Integer> myNumbers = new ArrayList<Integer>();
```
Example
```bash
  Integer myInt = 5;
    Double myDouble = 5.99;
    Character myChar = 'A';
    System.out.println(myInt);
    System.out.println(myDouble);
    System.out.println(myChar);
```
How can we Implement Singly LinkedList in Java
```bash
  class ListNodeNew{
    int val;
    ListNodeNew next;
    ListNodeNew(){
    }
    ListNodeNew(int val){
        this.val = val;
    }
    ListNodeNew(int val,ListNodeNew next){
        this.val = val;
        this.next = next;
    }
}
```

How can we Implement Binary Tree in Java
```bash
  class TreeNodeNew {
    int val;
    TreeNodeNew left;
    TreeNodeNew right;
    TreeNodeNew() {

    }
    TreeNodeNew(int val) {
        this.val = val;
    }
    TreeNodeNew(int val, TreeNodeNew left, TreeNodeNew right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
```
So on----------  
**You are requested to see all of the concepts and codes.**

