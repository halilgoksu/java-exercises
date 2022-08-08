public class ReverseString {
    public static void main(String[] args) {



//-------------------String Reverse--------------------------------
        String[] str = {"halil","Revature","Java"};
        for(int i=0;i<3;i++){
            System.out.println(reverse(str[i]));
        }

    }

    public static String reverse(String str){
        return new StringBuilder(str)
                .reverse()
                .toString();

    }



}
