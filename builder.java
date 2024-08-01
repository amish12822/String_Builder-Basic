// String Builder

/**
 * builder
 */
public class builder {

    public static void declaration(){

        // string builder syntax -
        StringBuilder sb = new StringBuilder("Amish");
        System.out.println(sb);
    }



    public static void GetACharacterfromIndex(){

        StringBuilder sb = new StringBuilder("Amish");

        // set char / access char
        System.out.println(sb.charAt(0));
    }



    public static void SetaCharacteratIndex(){

        StringBuilder sb = new StringBuilder("Amish");

        // Get Char / Exchange char
        sb.setCharAt(0, 'R');

        System.out.println(sb);
    }



    public static void InsertaCharacteratSomeIndex(){

        StringBuilder sb = new StringBuilder("Amish");

        // insert new char
        sb.insert(0, 'K');

        System.out.println(sb);
    }



    public static void DeletecharatsomeIndex(){

        StringBuilder sb = new StringBuilder("Amish");

        // delete exist char
        sb.delete(2, 3);

        System.out.println(sb);
    }



    public static void Appendachar(){

        StringBuilder sb = new StringBuilder("Amish");

        // Append means to add something at the end.
        sb.append("Kumar");

        System.out.println(sb);
    }



    public static void PrintLengthofString(){

        StringBuilder sb = new StringBuilder("Amish");

        // find length of stringBuilder
        System.out.println(sb.length());
    }





    public static void main(String[] args) {
        
        // declaration();

        // GetACharacterfromIndex();

        // SetaCharacteratIndex();

        // InsertaCharacteratSomeIndex();

        // DeletecharatsomeIndex();

        // Appendachar();

        // PrintLengthofString();
    }
}