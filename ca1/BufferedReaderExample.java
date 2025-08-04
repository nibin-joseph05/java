import java.io.*;

class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter something: ");
        double input = Double.parseDouble(br.readLine());

        System.out.println("You entered: " + input);
    }
}
