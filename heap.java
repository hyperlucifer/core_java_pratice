package day50;
/*
 * def->heap is a complete binary tree that satisfies a heap's property
 * 
 * in a complete binary tree all the nodes must have 2 childern nodes except the last node
 * but the position must start from left 
 * 
 * there are 2 types of heap 
 * 1)max heap
 * the heap property of the max heap is that its childern(of the root node) would always be smaller than itself.
 * 2)min heap 
 * the childern in the tree will be graeter then the node itself.
 * 
 * we will denote heap as a array that's why we use complete binery tree
 * 
 * if its complete tree then ,,if it has n nodes then its heigh will be log n.
 * if its not a complete binary tree then its heigh will be more then log n
 * 
 * to denote heap in array we will start from index 1 consider 0th index is null
 * 
 * fill the array like 
 * root->left->right
 * 
 * if we have to find the parent node from the given node in the array then 
 * just divide its index by 2.
 * 
 * as we came to 3 ,so divide it by 2, 3/2=1
 * then its index of the parent node is 1; 
 * this condition is false for root node
 * 
 * if we want its left child then just multiply its index with 2 ==i*2
 * if we want its right child then just multiply its index with 2 and add 1==i*2+1
 * 
 * for inserting
 * if we want to insert a element then insert it in the last index of the array or the left most
 * postion in the tree 
 * the check if the clild node is greater then parent node ,,if yes then swap parent and child node
 * then check this condition with the swaped node's parent 
 * do this until the node is in its correct position 
 * 
 * for deleting 
 * we always delete the root in the heap 
 * therefore delete the root node and insert the last node in the first(first index) place
 * now check which of the two childern is larger ,,and check if the root is smaller then that 
 * child,if yes then swap the larger node with root.
 * w  
 */
public class heap {
    private int[] heap;
    private int size;
    private int maxSize;

    public heap(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        this.heap = new int[maxSize + 1]; // Heap is 1-indexed
        heap[0] = Integer.MAX_VALUE; // Initialize the root with a large value
    }

    // Function to return the index of the parent of a node
    private int parent(int pos) {
        return pos / 2;
    }

    // Function to return the index of the left child of a node
    private int leftChild(int pos) {
        return (2 * pos);
    }

    // Function to return the index of the right child of a node
    private int rightChild(int pos) {
        return (2 * pos) + 1;
    }

    // Function to check if a node is a leaf node
    private boolean isLeaf(int pos) {
        return pos > (size / 2) && pos <= size;
    }

    // Function to swap two nodes of the heap
    private void swap(int fpos, int spos) {
        int tmp;
        tmp = heap[fpos];
        heap[fpos] = heap[spos];
        heap[spos] = tmp;
    }

    // Function to insert a new element into the heap
    public void insert(int element) {
        if (size >= maxSize) {
            System.out.println("Heap is full");
            return;
        }
        heap[++size] = element; // Insert the new element at the end
        int current = size;

        // Percolate up the newly added element
        while (heap[current] > heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    // Function to heapify a subtree rooted at node i
    private void maxHeapify(int pos) {
        if (isLeaf(pos)) {
            return;
        }
        if (heap[pos] < heap[leftChild(pos)] || heap[pos] < heap[rightChild(pos)]) {
            if (heap[leftChild(pos)] > heap[rightChild(pos)]) {
                swap(pos, leftChild(pos));
                maxHeapify(leftChild(pos));
            } else {
                swap(pos, rightChild(pos));
                maxHeapify(rightChild(pos));
            }
        }
    }

    // Function to delete an element from the heap
    public int delete() {
        int popped = heap[1]; // Remove the root element
        heap[1] = heap[size--]; // Replace the root with the last element
        maxHeapify(1); // Heapify the root node
        return popped;
    }

    public static void main(String[] args) {
        heap maxHeap = new heap(10);
        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(17);
        maxHeap.insert(10);
        maxHeap.insert(84);
        maxHeap.insert(19);
        maxHeap.insert(6);
        maxHeap.insert(22);
        maxHeap.insert(9);
        System.out.println("Max heap:");
        for (int i = 1; i <= maxHeap.size / 2; i++) {
            System.out.print(" Parent : " + maxHeap.heap[i] + " Left Child : " + maxHeap.heap[2 * i] +
                             " Right Child :" + maxHeap.heap[2 * i + 1]);
            System.out.println();
        }
        System.out.println("The max val is " + maxHeap.delete());
    }
}
