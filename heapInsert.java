package day50;

public class heapInsert {
    int heap[];
    int size;
    int maxsize;

    heapInsert(int max) {
        maxsize = max;
        heap = new int[maxsize + 1];
        size = 0;
        heap[0] = Integer.MAX_VALUE;
    }

    int parent(int pos) {
        return pos / 2;
    }

    int leftChild(int pos) {
        return (pos * 2);
    }

    int rightChild(int pos) {
        return (pos * 2 + 1);
    }

    boolean isLeaf(int pos) {
        return pos > (size / 2) && pos <= size;
    }

    void swap(int fpos, int spos) {
        int t = heap[fpos];
        heap[fpos] = heap[spos];
        heap[spos] = t;
    }

    void insert(int element) {
        if (size >= maxsize) {
            System.out.println("the heap is full");
            return;
        }
        heap[++size] = element;
        int current = size;
        while (heap[current] > heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    void display() {
        for (int i = 0; i < heap.length; i++) {
            System.out.println(heap[i]);
        }
    }

    public static void main(String[] args) {
        heapInsert hp = new heapInsert(5);
        hp.insert(12);
        hp.insert(7);
        hp.insert(2);
        hp.insert(1);
        hp.display();
    }
}
