public class OutputView {
    private static final String userNumberMessage = "참여할 사람은 몇 명인가요?";
    private static final String sadariNumberMessage = "최대 사다리 높이는 몇 개인가요?";
    private static final String userNamesMessage = "참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)";
    private static final String invalidUserNamesMessage = "이름의 길이가 너무 깁니다. 다시 입력하세요";
    private static final char sero = '|';
    private static final char garo = '-';
    private static final char empty = ' ';

    public static void printUserNumberMessage(){

        System.out.println(userNumberMessage);
    }

    public static void printSadariNumberMessage(){

        System.out.println(sadariNumberMessage);
    }

    public static void printGraphicalSadari(boolean[][] sadari){
        StringBuilder graphicSadari = new StringBuilder();
        for(int i = 0; i < sadari.length * sadari[0].length; i++) {
            graphicSadari.append(sero);
            graphicSadari.append( sadari[i/sadari[0].length][i% sadari[0].length] == true ? garo : empty );
            graphicSadari.append( i % sadari[0].length == sadari[0].length-1 ? sero+"\n" : "" );
        }
        System.out.println(graphicSadari);
    }

    public static void printUserNamesMessage(){
        System.out.println(userNamesMessage);
    }

    public static void printInvalidUserNamesMessage(){
        System.out.println(invalidUserNamesMessage);
    }


}