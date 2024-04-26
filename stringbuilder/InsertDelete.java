package stringbuilder;

public class InsertDelete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("RajeevRanjanYadav");
        System.out.println(sb);
        sb.deleteCharAt(6);
        System.out.println(sb);
        sb.delete(6,sb.length());//last index is exclusive
        System.out.println(sb);

        sb.insert(3,'j');
        sb.insert(3,78);
        System.out.println(sb);
        sb.insert(sb.length() , " 2023ca78");

        System.out.println(sb);
    }
}
