#include <bits/stdc++.h>
using namespace std;
class Node{    // here we can either use struct or class but class gives us more feature of oop but struct does not do that 
    public:
    int data;
    Node* next;

    public:
    Node(int data1, Node* next1)
    {
        data = data1;
        next = next1;
    }

    public:         // we can have multiple constructor and we may not pass all the parameter to all the constructor 
    Node(int data1)
    {
        data = data1;
        next = nullptr; 
    }
};
Node* ConvertArr2LL(vector<int> &arr)
{
    Node* head = new Node(arr[0]);
    Node* mover = head;
    for(int i = 1; i < arr.size(); i++)
    {
        Node* temp = new Node(arr[i]);
        mover->next = temp;
        mover = temp;
    }
    return head;
}

int lengthofLL(Node* head){
    int cnt = 0;
    Node* temp = head;
    while(temp)
    {
        temp = temp -> next;
        cnt++;
    }
    return cnt++;
}

int checkIfPresent(Node* head, int val){
    Node* temp = head;
    while(temp){
        if(temp->data == val) return 1;
        temp = temp -> next;
    }
    return 0;
}

int main()
{
    vector<int> arr = {2, 5, 8, 7};
    Node* y = new Node(arr[0], nullptr);
    cout << y << endl;
    Node z = Node(arr[0], nullptr);
    cout << z.data << endl;
    cout << z.next << endl;
    Node* head = ConvertArr2LL(arr);
    cout << head -> data << endl; 
    Node* temp = head;
    while(temp)
    {
        cout << temp -> data << " ";
        temp = temp -> next;

    }
    cout << endl;
    cout << lengthofLL(head) << endl;
    cout << checkIfPresent(head, 5);
}
