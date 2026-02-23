//https://www.geeksforgeeks.org/problems/count-nodes-of-linked-list/1


class Node {
  public:
    int data;
    Node *next;

    Node(int x) {
        data = x;
        next = nullptr;
    }
};


class Solution {
  public:
    int getCount(Node* head) {
        Node* temp = head;
        int count = 0;
        while(temp)
        {
            temp = temp -> next;
            count++;
        }
        return count;
    }
};