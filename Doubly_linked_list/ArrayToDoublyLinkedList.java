class ArrayToDoublyLinkedList{
    static class node{
        int data;
        node next;
        node back;

        node(int data1, node next1, node back1){
            this.data = data1;
            this.next = next1;
            this.back = back1;
        }
        
        node(int data1){
            data = data1;
            next = null;
            back = null;
        }
    }
    public static node ConvertArrayt0DLL(int[] arr){
        node head = new node(arr[0]);
        node prev = head;
        for(int i = 1; i < arr.length; i++){
            node temp = new node(arr[i], null, prev);
                prev.next = temp;
                prev = temp;
            }
        return head;
    }
    public static void printDLL(node head){
        node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        node head = ConvertArrayt0DLL(arr);
        printDLL(head);
    }
}