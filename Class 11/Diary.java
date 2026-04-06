 class Diary {
    String[] Q;  // Array to store addresses
    int size;    // Maximum capacity of the array
    int start;   // Index of the front end
    int end;     // Index of the rear end
    Diary(int max) {
        size = max;
        Q = new String[size];
        start = 0;
        end = 0;
    }
    void pushadd(String n) {
        if (end < size) {
            Q[end++] = n;
            System.out.println("Address added: " + n);
        } else {
            System.out.println("NO SPACE: Diary is full.");
        }
    }
    String popadd() {
        if (start < end) {
            String removedAddress = Q[start++];
            return removedAddress;
        } else {
            System.out.println("Underflow");
            return "?????";
        }
    }
    void show() {
        if (start == end) {
            System.out.println("Diary is empty.");
        } else {
            System.out.println("Addresses in the Diary:");
            for (int i = start; i < end; i++) {
                System.out.println(Q[i]);
            }
        }
    }
    public static void main(String[] args) {
        Diary myDiary = new Diary(5);  // Create a diary with a maximum capacity of 5 addresses
        myDiary.pushadd("123 Main St");
        myDiary.pushadd("456 Elm St");
        myDiary.pushadd("789 Oak St");
        myDiary.show();
        System.out.println("Removed Address: " + myDiary.popadd());
        System.out.println("Removed Address: " + myDiary.popadd());
        myDiary.show();
    }
}
