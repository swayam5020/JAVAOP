class Stack {
    String[] st;  // Array to hold names
    int size;     // Maximum capacity of the string array
    int top;      // Index of the topmost element of the stack
    int ctr;      // Counter to count the number of elements of the stack
    // Default constructor
    Stack() {
        size = 10;  // Default size
        st = new String[size];
        top = -1;
        ctr = 0;
    }
    // Constructor to initialize size and top
    Stack(int cap) {
        size = cap;
        st = new String[size];
        top = -1;
        ctr = 0;  
    }
    // Push a name onto the stack
    void pushname(String n) {
        if (top < size - 1) {
            st[++top] = n;
            ctr++;
            System.out.println("Pushed: " + n);
        } else {
            System.out.println("OVERFLOW: Stack is full.");
        }
    }
    // Remove a name from the top of the stack and return it
    String popname() {
        if (top >= 0) {
            String poppedName = st[top--];
            ctr--;
            return poppedName;
        } else {
            System.out.println("UNDERFLOW: Stack is empty.");
            return null;
        }
    }
    // Display the elements of the stack
    void display() {
        if (ctr == 0) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements:");
            for (int i = 0; i <= top; i++) {
                System.out.println(st[i]);
            }
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack(5);  // Create a stack with a maximum capacity of 5
        stack.pushname("Alice");
        stack.pushname("Bob");
        stack.pushname("Charlie");
        stack.pushname("David");
        stack.display();
        System.out.println("Popped: " + stack.popname());
        System.out.println("Popped: " + stack.popname());
        stack.display();
        stack.pushname("Eve");
        stack.display();
    }
}
