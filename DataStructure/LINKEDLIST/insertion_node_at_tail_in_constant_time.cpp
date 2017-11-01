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
Takes a list and a data value and creates a new link with the given data and
pushes it onto the front of the list. The head node is passed by reference here.
*/
void push(struct Node** headRef, int data)
{
    // Allocate the new node in the heap and set its data
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = data;

	// Set the .next pointer of the new node to point to the current
	// first node of the list.
    newNode->next = *headRef;

    // Change the head pointer to point to the new node, so it is
	// now the first node in the list.
    *headRef = newNode;
}

// Function to construct a linked list from given set of keys
// using local references
struct Node* constructList(int keys[], int n)
{
    struct Node* head = NULL;
    struct Node** lastPtrRef = &head; // Start out pointing to the head pointer

	for (int i = 0; i < n; i++)
    {
        push(lastPtrRef, keys[i]); // Add node at the last pointer in the list
        lastPtrRef= &((*lastPtrRef)->next); // Advance to point to the new last pointer
    }

    // head == {key[0], key[1], key[2], key[3]};
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
