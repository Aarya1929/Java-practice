package lab_exams_13;
import java.io.BufferedReader;  
import java.io.FileReader;
import java.util.Scanner;  
  
public class file 
{  
    public static void main(String[] args) throws Exception {  
        String line;  
        int count = 0;  
        Scanner sc = new Scanner(System.in);
  
        String fname=null;//C:\\Users\\yogit\\OneDrive\\Desktop\\S.Y.B.Tech. Sem 2\\data.txt
        
        System.out.println("Enter file Destination:");
        fname = sc.nextLine(); 
        //Opens a file in read mode  
        FileReader file = new FileReader(fname);  
        BufferedReader br = new BufferedReader(file);  
  
        //Gets each line till end of file is reached  
        while((line = br.readLine()) != null) {  
            //Splits each line into words  
            String words[] = line.split(" ");  
            //Counts each word  
            count = count + words.length;  
  
        }  
  
        System.out.println("Number of words present in given file: " + count);  
        br.close();  
    }  
}  
