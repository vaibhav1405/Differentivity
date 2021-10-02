#include <bits/stdc++.h>
using namespace std;
class Node{
    public:
    int data;
    Node *next;
};
void insert(Node** head , int val){
        Node* node = new Node();
        node->data=val;
        node->next= (*head);
        (*head)=node;
}
void middle(Node* head){
    Node* ptr1=head;
    Node* ptr2=head;
    if(head!=NULL){
        while(ptr2 !=NULL && ptr2->next!=NULL){
            ptr2=ptr2->next->next;
            ptr1=ptr1->next;
        }
        cout<<"The Middle Element of Array is "<<ptr1->data;
    }
}
bool search(struct Node* head, int x) 
{ 
    if (head == NULL) 
        return false; 
    if (head->data == x) 
        return true; 
    return search(head->next, x); 
}
void DeleteNode(Node** head,int position){
    if(*head==NULL)
    return;
    Node* temp = *head;
    if(position == 0){
        *head = temp->next;
        free(temp);
        return ;
    }
     for(int i = 0; temp != NULL && i < position - 1; i++)
        temp = temp->next;
    if (temp == NULL || temp->next == NULL)
        return;
     Node *next = temp->next->next;
    free(temp->next);
    temp->next = next;
}
void printList( Node *node)
{
    while (node != NULL)
    {
        cout << node->data << "->";
        node = node->next;
    }
}


int main()
{
    //FAST;
    Node* head = NULL;
    insert(&head,80);
    insert(&head,23);
    insert(&head,45);
    insert(&head,22);
    insert(&head,10);
    insert(&head,19);
    insert(&head,38);
    insert(&head,43);
    insert(&head,77);
    insert(&head,99);
    middle(head);
    return 0;
}