class Power2 extends Number {
    int Z;

    Power2(int x, int n) {
        super(x, n);
        Z = 0;
    }

    void calc() {
        Z = 1;
        for (int i = 0; i < N; i++) {
            Z *= X;
        }
    }
    
    void show2() {
        show1();
        System.out.println("X^N: " + Z);
     }

    public static void main(String[] args) {
        // Create an object of the Power class
        
        Power2 power2Obj = new Power2(2, 3);

        // Calculate the power
        power2Obj.calc();

        // Display the details
        power2Obj.show2();
    }
}