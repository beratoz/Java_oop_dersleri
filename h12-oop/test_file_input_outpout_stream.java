import java.io.*;

public class test_file_input_outpout_stream {
      public static void main(String[] args) throws FileNotFoundException, IOException {
            /*
             * FileOutputStream output = new FileOutputStream("deneme.txt");
             * for (int i = 0; i < 10; i++) {
             * output.write(i);
             * }
             * output.close();
             * 
             * FileInputStream input = new FileInputStream("deneme.txt");
             * int value;
             * while ((value = input.read()) != -1) {
             * System.out.print(value + " ");
             * }
             * input.close();
             */
            /*
             * String dataToWrite = "bu bir ifleWirter ve fileReader ornegidir";
             * FileWriter writer = new FileWriter("deneme2.txt");
             * writer.write(dataToWrite);
             * writer.close();
             * FileReader reader = new FileReader("deneme2.txt");
             * int character;
             * 
             * while ((character = reader.read()) != -1) {
             * System.out.print((char) character);
             * }
             * reader.close();
             */
            String inputfilepath = "C:\\Users\\USER\\Desktop\\oop-uni\\h12-oop\\Ataturk.txt";
            String outputfilepath = "C:\\Users\\USER\\Desktop\\oop-uni\\h12-oop\\Ataturk2.txt";
            BufferedReader reader = new BufferedReader(new FileReader(inputfilepath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputfilepath));

            String line;

            while ((line = reader.readLine()) != null) {
                  writer.write(line);
                  writer.newLine();// alt satır için
            }
            reader.close();
            writer.close();

      }
}
