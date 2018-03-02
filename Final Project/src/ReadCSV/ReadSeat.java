/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReadCSV;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author andyg
 */
public class ReadSeat {
    String[][] myArray;
   
    public String[][] setUpMyCsvArray(){
        myArray=new String[60][3];
        Scanner scanIn=null;
        int Rowc=0;
        String InputLine="";
        String xfileLocation;
        xfileLocation="src\\ReadCSV\\seat.csv";
        
        try
        {
            scanIn=new Scanner(new BufferedReader(new FileReader(xfileLocation)));    //读取.csv文件
            while(scanIn.hasNextLine()){
                InputLine=scanIn.nextLine();
                String[] InArray=InputLine.split(",");
                for(int x=0;x<InArray.length;x++){
                    myArray[Rowc][x]=InArray[x];
                    
                }
                Rowc++;
            }
        }catch(Exception e){
            System.out.println(e);        }
        return myArray;
    
}
}