package Song;

public class Song {
    private static String[] verses;
    private  static int day;
    private String suffix;
    public final int ALL_DAYS=12;



    public Song(){
        day=1;
        suffix="st";
        verses=new String[]{
                " ",//this verse change based on day
                " A partridge in a pear tree",
                "Two turtle doves ",
                "Three French hens",
                "Four calling birds",
                "Five golden rings",
                "Six geese a-laying ",
                "Seven swans a-swimming",
                "Eight maid a-milking",
                "Nine ladies dancing ",
                "Ten lords a-leaping ",
                "Eleven pipers pipping ",
                "Twelve drummers dumming"
        };
    }

    public void getVerses(){
        //loop through all 12 days
        for (int c=0;c<ALL_DAYS;c++){
            setSuffix();
            System.out.println(getFirstVerse(c+1));

            //loop through verses from the end, and correct number of verses
            //based on that of Xmas it is
            for (int i =day;i>0;i--){
                if(i==1){
                    System.out.println("and "+ verses[i]);
                }else
                    System.out.println(verses[i]);


            }
            setDay();
            System.out.println();
        }
    }

    public String getFirstVerse(int currentDay){
        return "On the "+currentDay+ getSuffix()+ " day of Bayram my God  what is going on ";

    }

    public static void setDay(){
        day++;
    }
    public static int getDay(){
        return day;
    }

      public void setSuffix(){
        switch (day){
            case 1:
                suffix="st";
                break;
            case 2:
                suffix="nd";
                break;
            case 3:
                suffix="rd";
                break;
            default:
                suffix="th";
                break;
        }
}

public  String getSuffix(){
        return suffix;

}



}
