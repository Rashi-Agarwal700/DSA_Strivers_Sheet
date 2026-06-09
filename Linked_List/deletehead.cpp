//https://www.geeksforgeeks.org/problems/delete-head-of-linked-list/1

class Node {
public:
    int data;
    Node* next;

    Node(int x) {
        data = x;
        next = nullptr;
    }
};


class Solution {
  public:
    Node *deleteHead(Node *head) {
        if (head == nullptr) {
            return nullptr;
        }

        Node* temp = head;
        head = head->next;
        delete temp;

        return head;
    }
};
