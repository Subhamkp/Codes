#include <bits/stdc++.h>
using namespace std;

// Data Structure to store a linked list node
struct Node
{
	int data;
	Node* next;
};

// Helper function to print given linked list
void printList(struct Node* head)
{
    struct Node* ptr = head;
    while (ptr)
    {
    	cout << ptr->data << " -> ";
    	ptr = ptr->next;
    }

    cout << "nullptr";
}

/*
push() in C -
Takes a list and a data value and creates a new link with the given data 
and pushes it onto the front of the list. The list is not passed in by 
its head pointer. Instead the list is passed in as a "reference" pointer 
to the head pointer -- this allows us to modify the caller's memory.

The parameter has the word "ref" in it as a reminder that this is a "reference"
(struct node**) pointer to the head pointer instead of an ordinary 
(struct node*) copy of the head pointer.

*/
void push(struct Node** headRef, int data)
{
    // Allocate the new node in the heap and set its data
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = data;

	// Set the .next pointer of the new node to point to the current
	// first node of the list.
    newNode->next = *headRef; // The '*' to dereferences back to the real head
    
    // Change the head pointer to point to the new node, so it is
	// now the first node in the list.
    *headRef = newNode;
}

// Function to construct a linked list from given set of keys
struct Node* constructList(int keys[], int n)
{
    struct Node *head = nullptr;

    // start from end of the array
	for (int i = n - 1; i >= 0; i--)
        push(&head, keys[i]);

    return head;
}

// main method
int main()
{
    // input keys
	int keys[] = {1, 2, 3, 4};
	int n = sizeof(keys)/sizeof(keys[0]);

	struct Node* head = constructList(keys, n);

	// print linked list
    printList(head);

    return 0;
}
