// https://practice.geeksforgeeks.org/problems/heap-sort/1
// Heap Sort: Time = O(N * Log N), Space = O(1)
// In-Place but Not Stable
class Solution {
    //solution 1 :-
    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void downheapify(int[] arr, int n, int idx) {
        int li = 2 * idx + 1;
        int ri = 2 * idx + 2;

        int max = idx;
        if (li < n && arr[li] > arr[max])
            max = li;
        if (ri < n && arr[ri] > arr[max])
            max = ri;

        if (max == idx)
            return;
        swap(arr, idx, max);
        downheapify(arr, n, max);
    }

    public void heapSort(int arr[], int n) {
        for (int i = n - 1; i >= 0; i--)
            downheapify(arr, n, i);

        for (int i = n - 1; i >= 0; i--) {
            swap(arr, 0, i);
            downheapify(arr, i, 0);
        }
    }

    //solution 2:-
    //  ArrayList<Integer> data = new ArrayList<>();
    
    // public void downheapify(int idx){
    //     int l = 2 * idx + 1;
    //     int r = 2 * idx + 2;
    //     int min = idx;
        
    //     if(l < data.size() && data.get(l) < data.get(min))
    //         min = l;
    //     if(r < data.size() && data.get(r) < data.get(min))
    //         min = r;
        
    //     if(min == idx) return;
    //     Collections.swap(data,idx,min);
    //     downheapify(min);
    // }

    // public int remove() {
    //   int val = data.get(0);
    //   Collections.swap(data,0,data.size()-1);
    //   data.remove(data.size()-1);
    //   downheapify(0);
    //   return val;
    // }
    
    // public void heapSort(int arr[], int n)
    // {
    //     for(int val : arr) data.add(val); // complete bonary tree.
        
    //     for(int idx = data.size()-1; idx>=0; idx--)
    //         downheapify(idx);
        
    //     int i = 0;
    //     while(data.size() > 0){
    //         arr[i] = remove();
    //         i++;
    //     }
    // }
}