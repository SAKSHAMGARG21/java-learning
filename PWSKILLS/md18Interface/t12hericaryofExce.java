import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// checked and unchecked Exception
// -> checked is compiler check exception on complietime
// -> uncheck is check exception runtime
// runtime class is unchecked 
// ioexception class is checked
public class t12hericaryofExce {
    public static void main(String[] args) {
        // int res=7/0;// unchecked

        BufferedReader bc= new BufferedReader(new InputStreamReader(System.in));
        try{
            String str=bc.readLine(); // checked
            System.out.println(str);
        }
        catch(IOException e){
            // System.out.println("err",e);
            e.printStackTrace();
        }

    }
}
