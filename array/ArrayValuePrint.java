import java.util.Arrays;
class ArrayValuePrint{
    public static void main(String[] args){

        String[] sampleArray = {"nibin","abin", "jose",""};

        Arrays.sort(sampleArray);

        for (int i = 0;i < sampleArray.length;i++){
            System.out.println(sampleArray[i]);   

        }

             
    }
}