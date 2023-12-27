class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}

Node nodeA = new Node(6);
Node nodeB = new Node(3);
Node nodeC = new Node(4);
Node nodeD = new Node(2);
Node nodeE = new Node(1);

nodeA.next = nodeB;
nodeB.next = nodeC;
nodeC.next = nodeD;
nodeD.next = nodeE;

int countNodes(Node nodeA) {
    int count = 1;
    Node current = nodeA;
    while (current.next != null) {
        current = current.next;
        count += 1;
    }
    return count;
} 
