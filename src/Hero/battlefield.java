package Hero;

public class battlefield{
    public char[][]field=new char[11][11];
    public battlefield(){
        for(int i=0;i<11;i++)
            for(int j=0;j<11;j++)
                field[i][j]=' ';

        field[2][4]='@';field[8][4]='#';field[6][8]='*';field[5][7]='-';
        field[2][6]='@';field[8][6]='#';field[3][2]='&';field[3][9]='&';
        field[4][3]='|';field[5][3]='|';field[7][1]='|';field[8][1]='|';
        field[7][8]='|';field[8][8]='|';field[6][2]='-';field[6][7]='-';
        field[5][6]='*';field[6][6]='*';field[6][1]='*';field[6][3]='*';
        field[5][5]='&';field[7][6]='&';
    }

    public void printField(){
        for(int i=0;i<11;i++){
            for(int j=0;j<11;j++)
                System.out.print(field[i][j]+" ");
            System.out.println();
        }
    }
}
