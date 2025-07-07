import java.io.*;


class UsingBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter something: ");
        String input = bf.readLine();
        System.out.println("You entered: " + input);
    }
}
