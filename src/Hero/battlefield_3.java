package Hero;

public class battlefield_3 {
    public char[][]field=new char[11][11];
    public battlefield_3() {
        for (int i = 0; i < 11; i++)
            for (int j = 0; j < 11; j++)
                field[i][j] = ' ';
        field[2][4]='@';field[5][6]='*';field[8][4]='#';field[8][8]='&';field[5][8]='&';
        field[2][6]='@';field[8][3]='*';field[8][6]='#';field[2][7]='&';field[2][6]='&';
    }
}
