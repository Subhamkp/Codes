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

// Helper function to insert a new node in the beginning of the linked list
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

// Function that takes a linked list and returns a complete copy of that list
// using local references
struct Node* CopyList(struct Node* head)
{
	struct Node* current = head; // used to iterate over the original list
	struct Node* newList = nullptr;
	struct Node** lastPtr;
	lastPtr = &newList; // start off pointing to the head itself
	
	while (current != nullptr) 
	{
		push(lastPtr, current->data); // add each node at the lastPtr
		lastPtr = &((*lastPtr)->next); // advance lastPtr
		current = current->next;
	}
	
	return newList;
}

// main method
int main()
{
    // input keys
	int keys[] = {1, 2, 3, 4};
	int n = sizeof(keys)/sizeof(keys[0]);

	// points to the head node of the linked list
	struct Node* head = nullptr;

	// construct linked list
	for (int i = n-1; i >= 0; i--)
		push(&head, keys[i]);

    // copy linked list
    struct Node* dup = CopyList(head);

	// print duplicate linked list
    printList(dup);

    return 0;
}
