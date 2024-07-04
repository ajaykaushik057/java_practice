#include <stdio.h>
#include <stdlib.h>

// Define the structure for a node
struct node {
    int data;
    struct node *left, *right;
};

// Function prototype for create
struct node* create();

int main() {
    struct node *root;
    root = create();
    // Additional code to handle the created tree can be added here
    return 0;
}

struct node* create() {
    struct node *temp;
    int data;
    int choice;

    temp = (struct node *)malloc(sizeof(struct node));
    if (!temp) {
        printf("Memory allocation failed\n");
        exit(1);
    }

    printf("Press 0 to exit\n");
    printf("Press 1 for new node\n");
    printf("Enter your choice: ");
    scanf("%d", &choice);

    if (choice == 0) {
        return NULL;  // Return NULL instead of 0 for a proper pointer type
    } else {
        printf("Enter the data: ");
        scanf("%d", &data);
        temp->data = data;

        printf("Enter the left child of %d\n", data);
        temp->left = create();

        printf("Enter the right child of %d\n", data);
        temp->right = create();

        return temp;
    }
}

