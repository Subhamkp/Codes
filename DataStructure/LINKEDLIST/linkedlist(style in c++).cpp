#include <bits/stdc++.h>
using namespace std;

// Data Structure to store a linked list node
struct Node
{
	int data;
	Node* next;
};

// Helper function to print given linked list
void printList(Node* head)
{
    Node* ptr = head;
    while (ptr)
    {
    	cout << ptr->data << " -> ";
    	ptr = ptr->next;
    }

    cout << "nullptr";
}

/*
Push() in C++ -- we just add a '&' to the right hand side of the head 
parameter type, and the compiler makes that parameter work by reference. 
So this code changes the caller's memory, but no extra uses of '*' are 
necessary -- we just access "head" directly, and the compiler makes that
change reference back to the caller.

The parameter has the word
"ref" in it as a reminder that this is a "reference" (struct node**) pointer to the
head pointer instead of an ordinary (struct node*) copy of the head pointer.

*/
void push(Node* &headRef, int data)
{
    // Allocate the new node in the heap and set its data
    Node* newNode = new Node;
    newNode->data = data;
    
	// Set the .next pointer of the new node to point to the current
	// first node of the list.

    // No extra use of * necessary on head -- the compiler
    // just takes care of it behind the scenes.
    newNode->next = headRef;

    // Change the head pointer to point to the new node, so it is
	// now the first node in the list.
    headRef = newNode;
}

// Function to construct a linked list from given set of keys
Node* constructList(int keys[], int n)
{
    Node *head = nullptr;

    // start from end of the array
	for (int i = n - 1; i >= 0; i--)
	{
		// Note that no extra use & necessary -- the compiler takes
    	// care of it here too. Head is being changed by these calls.
        
        push(head, keys[i]);
	}
    
    return head;
}

// main method
int main()
{
    // input keys
	int keys[] = {1, 2, 3, 4};
	int n = sizeof(keys)/sizeof(keys[0]);

	Node* head = constructList(keys, n);

	// print linked list
    printList(head);

    return 0;
}
