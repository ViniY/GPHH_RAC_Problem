package CCGP_RAC;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
public class dataPrepare {
    public ArrayList<String> data = new ArrayList<>();
    private String filePath;
    public dataPrepare(String filePath){
        this.filePath = filePath;
        this.data = Reader(filePath);
        preprocess();
    }

    public ArrayList<String> Reader(String filePath){
//        int counter= 0;
        ArrayList<String> lines = new ArrayList<>();
        try
        {
            File file=new File(filePath);    //creates a new file instance
            FileReader fr=new FileReader(file);   //reads the file
            BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream
            StringBuffer sb=new StringBuffer();    //constructs a string buffer with no characters
            String line;
            while((line=br.readLine())!=null)
            {
//                counter++;
//                if (counter<60) System.out.println(line);
                line = line + " \n";
                sb.append(line);      //appends line to string buffer

                lines.add(line);
//                sb.append("\n");     //line feed
            }
            fr.close();    //closes the stream and release the resources
//            System.out.println("Contents of File: ");
//            System.out.println(sb.toString());   //returns a string that textually represents the object
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        return lines;
    }


    public void preprocess(){
        ArrayList<String> lines = this.data;
        int count = 0;
        for(int i =0; i < lines.size(); i++){
            String line = lines.get(i);
            if (line.charAt(0) == ';'){
                count++;
                System.out.println(line);
            }
        }
        ArrayList<String> titles = new ArrayList<>();


    }

    public static void main(String[] args) {
        String file = args[0];
        dataPrepare dp = new dataPrepare(file);
//        System.out.println(file);

    }

}


