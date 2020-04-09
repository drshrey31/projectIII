public class LinkedList<T extends Comparable<T>> implements List<T> {

    private Node<T> head;
    private int lsCounter;
    private boolean isSorted = true;

    public LinkedList(){
        head = new Node<T>(null);
        lsCounter = 0;
    }

    @Override
    public boolean add(T element) {
        Node end, chq;
        if (element == null){
            return false;
        }
        else{
            if (head == null){
                head = new Node(element);
            }
            else{
                end = head.getNext();
                chq = head;
                while (end != null){
                    System.out.println("Inside add(element) loop");
                    chq = end;
                    end = end.getNext();
                }
                Node last = new Node(element);
                chq.setNext(last);
                lsCounter +=1;
                return true;
            }
        }
//        Node end, ptr;
//        if (head == null){
//            head = new Node(index,value);
//        }
//        else{
//            end = head.getNext();
//            ptr = head;
//            while (end != null){
//                System.out.println("Inside loop");
//                ptr = end;
//                end = end.getNext();
//            }
//            Node final1 = new Node(index,value);
//            ptr.setNext(final1);
//        }
    }

    @Override
    public boolean add(int index, T element) {
        Node end, chq;
        if (element == null){
            return false;
        }
        else{
            if (head == null){
            head = new Node(index, element);
            }
        else{
            end = head.getNext();
            chq = head;
            while (end != null){
                System.out.println("Inside add(index, element) loop");
                chq = end;
                end = end.getNext();
            }
            Node last = new Node(index, element);
            chq.setNext(last);
            lsCounter +=1;
            return true;
            }
        }
    }
//        Node end, ptr;
//        if (head == null){
//            head = new Node(index,value);
//        }
//        else{
//            end = head.getNext();
//            ptr = head;
//            while (end != null){
//                System.out.println("Inside loop");
//                ptr = end;
//                end = end.getNext();
//            }
//            Node final1 = new Node(index,value);
//            ptr.setNext(final1);
//        }

    }

    @Override
    public void clear() {
        Node end, chq;
        end = head;
        while (end != null){
            System.out.println("Inside clear loop");
            chq = end;
            end = end.getNext();
        }
        if (lsCounter > 0) {
            head = null;
            // set last element to null
        }
        chq = null;
        lsCounter = 0;
    }

    @Override
    public boolean contains(T element) {
        Node tempHead = head;
        while (tempHead != null) {
            if (element.equals(tempHead.getData())) {
                return true;
            }
            tempHead = tempHead.getNext();
            }
        return false;
    }

    @Override
    public T get(int index) {
        //return null;
        Node end, ptr;
        int counter = index;
        end = head.getNext();
        ptr = head;
        while (end != null && counter != 0) {
            System.out.println("Inside get loop");
            ptr = end;
            end = end.getNext();
            counter--;
        }
        if (end == null && counter != 0) {
            System.out.println("out of range");
            return null;
        }
        return ptr.getData();
    }

    @Override
    public int indexOf(T element) {
        this.sort(isSorted);
        int counter = 0;
        Node tempHead = head;
        while (tempHead != null) {
            if (element.equals(tempHead.getData())) {
                return counter;
            }
            tempHead = tempHead.getNext();
            counter++;
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    @Override
    public int lastIndexOf(T element) {
       this.sort(isSorted);
       return 0;
    }

    @Override
    public T set(int index, T element) {
        T prevEle;

        Node end, ptr;
        int counter = index;
        end = head.getNext();
        ptr = head;
        while (end != null && counter != 0) {
            System.out.println("Inside set loop");
            ptr = end;
            end = end.getNext();
            counter--;
        }
        if (end == null && counter != 0) {
            System.out.println("out of range");
            return null;
        }
        prevEle = ptr.getData();

        Node newVal = new Node(element);
        ptr = newVal;

        /*
         * Replace the element at index with element and return the
         * element that was previously at index. If index is
         * out-of-bounds or element is null, do nothing with element
         * and return null.
         */

        // functions to use: get(index),

        return prevEle;
    }

    @Override
    public int size() {
        int syze;
        Node end, ptr;
        if (head == null){
            return 0;
        }
        else{
            end = head.getNext();
            ptr = head;
            while (end != null){
                System.out.println("Inside loop");
                ptr = end;
                end = end.getNext();
                syze++;
            }
        }
        return syze;
        /*
         * Return the number of elements in the list. For example, if
         * 4 elements added to a list, size will return 4, while the
         * last index in the list will be 3.
         */
    }

    @Override

    //    Do not use an array or ArrayList to sort the elements.
//    You are required to sort the values using only the linked list data structure.
//    You can move nodes or swap values but you cannot use an array to store values while sorting.
//
//    Depending on your implementation, remember that after sorting,
//    the former first node may not be the current first node.

    public void sort(boolean order) {
        /*
         * Sort the elements of the list. If order is true, sort the
         * list in increasing (alphabeticaly) order. If order is
         * false, sort the list in decreasing (reverse alphabetical)
         * order. Note: only set isSorted to true if sorted in ASCENDING
         * order.
         * If isSorted is true, and the order is true, do NOT resort.
         * Hint: Since T extends Comparable, you will find it useful
         * to use the public int compareTo(T o) method.
         */


//        public class linkedList {
//            node head = null;
//
//            // node a, b;
//            static class node {
//                int val;
//                node next;
//
//                public node(int val) {
//                    this.val = val;
//                }
//            }
//
//            Node sortedMerge(Node a, Node b) {
//                Node result = null;
//                /* Base cases */
//                if (a == null)
//                    return b;
//                if (b == null)
//                    return a;
//
//                /* Pick either a or b, and recur */
//                if (a.getData() <= b.getData()) {
//                    result = a;
//                    result.setNext(sortedMerge(a.next, b));
//                } else {
//                    result = b;
//                    result.setNext(sortedMerge(a, b.next));
//                }
//                return result;
//            }
//
//            Node mergeSort(Node h) {
//                // Base case : if head is null
//                if (h == null || h.next == null) {
//                    return h;
//                }
//
//                // get the middle of the list
//                node middle = getMiddle(h);
//                node middleNext = middle.getNext();
//
//                // set the next of middle node to null
//                middle.setNext(null);
//
//                // Apply mergeSort on left list
//                node left = mergeSort(h);
//
//                // Apply mergeSort on right list
//                node right = mergeSort(middleNext);
//
//                // Merge the left and right lists
//                node sortedList = sortedMerge(left, right);
//                return sortedList;
//            }
//
//            // Utility function to get the middle of the linked list
//            public static node getMiddle(node head) {
//                if (head == null)
//                    return head;
//
//                node prev = head, end = head.getNext();
//
//                while (end != null) {
//                    prev = end;
//                    end = end.getNext();
//                }
//                return prev;
//            }
//
//            void push(T new_data) {
//                /* allocate node */
//                node new_node = new node(new_data);
//
//                /* link the old list off the new node */
//                new_node.setNext(head);
//
//                /* move the head to point to the new node */
//                head = new_node;
//            }
//        }

    }
    @Override
    public boolean remove(T element) {
        return false;

        // step 1: search for the element
        // step 2: remove element, return true
        // step 3: ???
        // step 4: profit

//        void removeEntry(T element) {
//            lsCounter--;
//            if (lsCounter == 0) {first = null; last = null;}
//            else
//                {
//                    if (e == first) {
//                         first = e.next;
//                         e.next.previous = null;
//                    }
//                    else if (e == last) {
//                      last = e.previous;
//                      e.previous.next = null;
//                    }
//                   else {
//                       e.next.previous = e.previous;
//                       e.previous.next = e.next;
//                   }
//             }
//        }
    }

    @Override
    public T remove(int index) {
        return null;
    }
}
