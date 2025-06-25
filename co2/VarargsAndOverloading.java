class Calculator {
    public double add(int a, int b) {
        return a + b;
    }

    public double add(int... numbers) {
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}

class VarargsAndOverloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println(c.add(1, 2));                
        System.out.println(c.add(1, 2, 3));             
        System.out.println(c.add(1, 2, 3, 4, 5, 6));    
    }
}
