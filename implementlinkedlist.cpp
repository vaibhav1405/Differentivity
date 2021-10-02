#include<iostream>
#include<bits/stdc++.h>
using namespace std;
struct node
{
    int data;
    node *next;
};
void display(node *head)
{
    cout<<"The linked list is: ";
    node *temp=head;
    while(temp!=NULL)
    {
        cout<<temp->data<<"--->";
        temp=temp->next;
    }
    cout<<endl;
}
int main()
{
    cout<<"Enter 1 to insert a node\nEnter 2 to delete a node\nEnter 0 to exit"<<endl;
    int a;
    cin>>a;
    int n=0;
    node *head=NULL;
    while(a!=0)
    {
        if(a==1)
        {
            cout<<"Enter data to insert: ";
            int data;
            cin>>data;
            if(head==NULL)
            {
                node *nn=new node();
                nn->data=data;
                nn->next=NULL;
                head=nn;
            }
            else
            {
                node *temp,*nn;
                temp=head;
                while(temp->next!=NULL)
                temp=temp->next;

                nn=new struct node();
                nn->data=data;
                nn->next=NULL;
                temp->next=nn;
            }
            display(head);
            n++;
        }

        else if(a==2)
        {
            cout<<"Enter position to delete: ";
            int pos;
            cin>>pos;
            node *nn,*temp;
            if(head==NULL)
            {
                cout<<"Linked list is empty!";
            }
            nn = temp = head;
            if (pos != 1 && pos != n)
            {
                for (int i = 1; i < pos + 1; i++)
                {
                    nn = nn->next;
                    temp = nn;
                }
                nn = head;
                for (int i = 1; i < pos; i++)
                {
                    if (i == (pos - 1))
                        nn->next = temp;
                    else
                        nn = nn->next;
                }
            }
            else if (pos == 1)
            {
                head = nn->next;
            }
            else
            {
                for (int i = 1; i < n; i++)
                {
                    if (i == (n - 1))
                        nn->next = NULL;
                    else
                        nn = nn->next;
                }
            }
            display(head);
        }
        cout<<"Enter 1 to insert a node\nEnter 2 to delete a node\nEnter 0 to exit"<<endl;
        cin>>a;
    }
    return 0;
}