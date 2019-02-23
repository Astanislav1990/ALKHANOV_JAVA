package ALKHANOV;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class MyScanner {
    private InputStream inputStream;
    public MyScanner(String fileName) {
		try {
		    inputStream = new FileInputStream(fileName);
            }catch (FileNotFoundException e) {
		        throw new IllegalArgumentException(e);
            }
        }

        public  int nextInt(){
        int result = 0;
        try {
            int symbol = inputStream.read();
            while (symbol != -1){
                System.out.print((char)symbol);
                int numberAsInt = (int)symbol - '0';
                result = result *10 + numberAsInt;
                symbol = inputStream.read();
            }
            System.out.print(" - to int " + result);

        }catch (IOException e){
            throw new IllegalArgumentException(e);
        }
            return result;
    }

}
