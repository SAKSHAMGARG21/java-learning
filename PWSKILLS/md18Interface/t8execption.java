// what is execption?
// -> execption is runtime error 
public class t8execption {
    public static void main(String[] args) {
        
        int a=6;
        int b=0;

        int res=0;
        int arr[]= {1,2,3,4};
        String str=null;
        try { 
            res= a/b; // if exp throw by this line then execution stops here of try block
            System.out.println("in try block");
            System.out.println(arr[5]);; 
            // System.out.println(str);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero"+e);
        } 
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(arr[arr.length-1]);
            System.out.println("stay in limits"+e);
        }
        catch (Exception e) {
            // TODO: handle exception
            System.out.println("Somthing went wrong.."+e);
        }

        System.out.println(res);
        System.out.println("buy");
    }
}
