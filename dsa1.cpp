#include <iostream>
#include <queue>
#include <algorithm>
using namespace std;

// Node structure
struct Node {
    int data;
    Node* left;
    Node* right;

    Node(int value) {
        data = value;
        left = NULL;
        right = NULL;
    }
};

// 1. Insert Employee ID into BST
Node* Insert(Node* root, int value) {

    // Check whether tree is empty
    if (root == NULL) {
        Node* newNode = new Node(value);
        return newNode;
    }

    // Insert into left subtree
    if (value < root->data) {
        root->left = Insert(root->left, value);
    }

    // Insert into right subtree
    else if (value > root->data) {
        root->right = Insert(root->right, value);
    }

    // Duplicate value
    else {
        cout << "Duplicate Employee ID" << endl;
    }

    return root;
}

// 2. Display BST Level-wise
void LevelOrder(Node* root) {

    if (root == NULL) {
        cout << "Tree is Empty" << endl;
        return;
    }

    // Create queue
    queue<Node*> Q;

    // Insert root into queue
    Q.push(root);

    // Process nodes level by level
    while (!Q.empty()) {

        Node* current = Q.front();
        Q.pop();

        // Display current node
        cout << current->data << " ";

        // Insert left child
        if (current->left != NULL) {
            Q.push(current->left);
        }

        // Insert right child
        if (current->right != NULL) {
            Q.push(current->right);
        }
    }

    cout << endl;
}

// 3. Copy Binary Search Tree
Node* CopyTree(Node* root) {

    // Check whether node exists
    if (root == NULL) {
        return NULL;
    }

    // Create new node
    Node* newNode = new Node(root->data);

    // Copy left subtree
    newNode->left = CopyTree(root->left);

    // Copy right subtree
    newNode->right = CopyTree(root->right);

    return newNode;
}

// 4. Find Height of BST
int Height(Node* root) {

    // Empty tree has height -1
    if (root == NULL) {
        return -1;
    }

    // Find left subtree height
    int leftHeight = Height(root->left);

    // Find right subtree height
    int rightHeight = Height(root->right);

    // Return greater height + 1
    return max(leftHeight, rightHeight) + 1;
}

// 5. Display Leaf Nodes
void PrintLeafNodes(Node* root) {

    // Check whether node exists
    if (root == NULL) {
        return;
    }

    // Check whether current node is a leaf
    if (root->left == NULL && root->right == NULL) {
        cout << root->data << " ";
        return;
    }

    // Traverse left subtree
    PrintLeafNodes(root->left);

    // Traverse right subtree
    PrintLeafNodes(root->right);
}

// Main Function
int main() {

    // Create empty BST
    Node* root = NULL;
    Node* copyRoot = NULL;

    int choice;

    do {

        cout << "\n=====================================\n";
        cout << " Employee Database Analysis using BST\n";
        cout << "=====================================\n";
        cout << "1. Insert Employee IDs\n";
        cout << "2. Display Original BST (Level Order)\n";
        cout << "3. Copy BST\n";
        cout << "4. Display Copied BST (Level Order)\n";
        cout << "5. Find Height of BST\n";
        cout << "6. Display Leaf Nodes\n";
        cout << "7. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {

            // Case 1: Insert Employee IDs
            case 1: {
                int n, value;

                cout << "Enter number of employee IDs: ";
                cin >> n;

                for (int i = 1; i <= n; i++) {
                    cout << "Enter Employee ID: ";
                    cin >> value;

                    root = Insert(root, value);
                }

                break;
            }

            // Case 2: Display Original BST
            case 2:
                cout << "Original BST (Level Order): ";
                LevelOrder(root);
                break;

            // Case 3: Copy BST
            case 3:
                copyRoot = CopyTree(root);
                cout << "BST Copied Successfully" << endl;
                break;

            // Case 4: Display Copied BST
            case 4:
                cout << "Copied BST (Level Order): ";
                LevelOrder(copyRoot);
                break;

            // Case 5: Find Height
            case 5:
                cout << "Height of BST = " << Height(root) << endl;
                break;

            // Case 6: Display Leaf Nodes
            case 6:
                cout << "Leaf Nodes are: ";
                PrintLeafNodes(root);
                cout << endl;
                break;

            // Case 7: Exit
            case 7:
                cout << "Exiting Program..." << endl;
                break;

            // Invalid choice
            default:
                cout << "Invalid Choice" << endl;
        }

    } while (choice != 7);

    return 0;
}