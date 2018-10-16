package Hero;

import java.util.*;
import java.util.Scanner;

public class Main {
    public int winner;
    public int MAP;
    public Main(){
        winner=0;
    }

    //---------------------------------------------------------------------------
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        Main Mainset=new Main();
        System.out.println("Please choose the MAP\n");
        Mainset.MAP=sc.nextInt();
        System.out.println("ヒーロー:A-J");
        System.out.println("Please choose the HERO\n"+"ヒーロー");
        battlefield Field=new battlefield();
        HeroA A_=new HeroA();HeroB B_=new HeroB();HeroC C_=new HeroC();HeroD D_=new HeroD();
        HeroE E_=new HeroE();HeroF F_=new HeroF();HeroG G_=new HeroG();HeroH H_=new HeroH();
        HeroI I_=new HeroI();HeroJ J_=new HeroJ();
        //----------------------------------------------------------------------------------
        for(int HeroNum=0;HeroNum<5;HeroNum++)
        {
            String player=sc.next();
            char in=player.charAt(0);
            Field.field[0][2*HeroNum+1]=in;
            switch (in){
                case'A':A_.Setlocation(0,2*HeroNum+1);break;
                case'B':B_.Setlocation(0,2*HeroNum+1);break;
                case'C':C_.Setlocation(0,2*HeroNum+1);break;
                case'D':D_.Setlocation(0,2*HeroNum+1);break;
                case'E':E_.Setlocation(0,2*HeroNum+1);break;
                case'F':F_.Setlocation(0,2*HeroNum+1);break;
                case'G':G_.Setlocation(0,2*HeroNum+1);break;
                case'H':H_.Setlocation(0,2*HeroNum+1);break;
                case'I':I_.Setlocation(0,2*HeroNum+1);break;
                case'J':J_.Setlocation(0,2*HeroNum+1);break;
            }
        }

        System.out.println("Please choose the HERO\n"+"ヒーロー");
        for(int HeroNum=0;HeroNum<5;HeroNum++)
        {
            String player=sc.next();
            char in=player.charAt(0);
            Field.field[10][2*HeroNum+1]=in;
            switch (in){
                case'A':A_.Setlocation(10,2*HeroNum+1);break;
                case'B':B_.Setlocation(10,2*HeroNum+1);break;
                case'C':C_.Setlocation(10,2*HeroNum+1);break;
                case'D':D_.Setlocation(10,2*HeroNum+1);break;
                case'E':E_.Setlocation(10,2*HeroNum+1);break;
                case'F':F_.Setlocation(10,2*HeroNum+1);break;
                case'G':G_.Setlocation(10,2*HeroNum+1);break;
                case'H':H_.Setlocation(10,2*HeroNum+1);break;
                case'I':I_.Setlocation(10,2*HeroNum+1);break;
                case'J':J_.Setlocation(10,2*HeroNum+1);break;
            }
        }


        String option;   String ch,in;
        Field.printField();
        while(Mainset.winner==0) {
            option=sc.next();
            if(option.equals("MOVE")) {
                ch = sc.next();
                int dir = sc.nextInt();
                char on = ch.charAt(0);
                switch (on){
                    case'A':A_.Move(dir,Field);break;
                    case'B':B_.Move(dir,Field);break;
                    case'C':C_.Move(dir,Field);break;
                    case'D':D_.Move(dir,Field);break;
                    case'E':E_.Move(dir,Field);break;
                    case'F':F_.Move(dir,Field);break;
                    case'G':G_.Move(dir,Field);break;
                    case'H':H_.Move(dir,Field);break;
                    case'I':I_.Move(dir,Field);break;
                    case'J':J_.Move(dir,Field);break;
                }
                Field.printField();
            }
            else if(option.equals("ATTACK")){
                ch=sc.next();  char ac=ch.charAt(0);
                in=sc.next();  char pa=in.charAt(0);
                switch (ac){
                    case 'A':{
                        switch (pa){
                            case'B':A_.Attacking(B_);B_.ShowInfo();break;
                            case'C':A_.Attacking(C_);C_.ShowInfo();break;
                            case'D':A_.Attacking(D_);D_.ShowInfo();break;
                            case'E':A_.Attacking(E_);E_.ShowInfo();break;
                            case'F':A_.Attacking(F_);F_.ShowInfo();break;
                            case'G':A_.Attacking(G_);G_.ShowInfo();break;
                            case'H':A_.Attacking(H_);H_.ShowInfo();break;
                            case'I':A_.Attacking(I_);I_.ShowInfo();break;
                            case'J':A_.Attacking(J_);J_.ShowInfo();break;
                        }
                        A_.ShowInfo();
                        break;
                    }
                    case 'B':{
                        switch (pa){
                            case'A':B_.Attacking(A_);A_.ShowInfo();break;
                            case'C':B_.Attacking(C_);C_.ShowInfo();break;
                            case'D':B_.Attacking(D_);D_.ShowInfo();break;
                            case'E':B_.Attacking(E_);E_.ShowInfo();break;
                            case'F':B_.Attacking(F_);F_.ShowInfo();break;
                            case'G':B_.Attacking(G_);G_.ShowInfo();break;
                            case'H':B_.Attacking(H_);H_.ShowInfo();break;
                            case'I':B_.Attacking(I_);I_.ShowInfo();break;
                            case'J':B_.Attacking(J_);J_.ShowInfo();break;
                        }
                        B_.ShowInfo();
                        break;
                    }
                    case 'C':{
                        switch (pa){
                            case'B':C_.Attacking(B_);B_.ShowInfo();break;
                            case'A':C_.Attacking(A_);A_.ShowInfo();break;
                            case'D':C_.Attacking(D_);D_.ShowInfo();break;
                            case'E':C_.Attacking(E_);E_.ShowInfo();break;
                            case'F':C_.Attacking(F_);F_.ShowInfo();break;
                            case'G':C_.Attacking(G_);G_.ShowInfo();break;
                            case'H':C_.Attacking(H_);H_.ShowInfo();break;
                            case'I':C_.Attacking(I_);I_.ShowInfo();break;
                            case'J':C_.Attacking(J_);J_.ShowInfo();break;
                        }
                        C_.ShowInfo();
                        break;
                    }
                    case 'D':{
                        switch (pa){
                            case'B':D_.Attacking(B_);B_.ShowInfo();break;
                            case'C':D_.Attacking(C_);C_.ShowInfo();break;
                            case'A':D_.Attacking(A_);A_.ShowInfo();break;
                            case'E':D_.Attacking(E_);E_.ShowInfo();break;
                            case'F':D_.Attacking(F_);F_.ShowInfo();break;
                            case'G':D_.Attacking(G_);G_.ShowInfo();break;
                            case'H':D_.Attacking(H_);H_.ShowInfo();break;
                            case'I':D_.Attacking(I_);I_.ShowInfo();break;
                            case'J':D_.Attacking(J_);J_.ShowInfo();break;
                        }
                        D_.ShowInfo();
                        break;
                    }
                    case 'E':{
                        switch (pa){
                            case'B':E_.Attacking(B_);B_.ShowInfo();break;
                            case'C':E_.Attacking(C_);C_.ShowInfo();break;
                            case'D':E_.Attacking(D_);D_.ShowInfo();break;
                            case'A':E_.Attacking(A_);A_.ShowInfo();break;
                            case'F':E_.Attacking(F_);F_.ShowInfo();break;
                            case'G':E_.Attacking(G_);G_.ShowInfo();break;
                            case'H':E_.Attacking(H_);H_.ShowInfo();break;
                            case'I':E_.Attacking(I_);I_.ShowInfo();break;
                            case'J':E_.Attacking(J_);J_.ShowInfo();break;
                        }
                        E_.ShowInfo();
                        break;
                    }
                    case 'F':{
                        switch (pa){
                            case'B':F_.Attacking(B_);B_.ShowInfo();break;
                            case'C':F_.Attacking(C_);C_.ShowInfo();break;
                            case'D':F_.Attacking(D_);D_.ShowInfo();break;
                            case'E':F_.Attacking(E_);E_.ShowInfo();break;
                            case'A':F_.Attacking(A_);A_.ShowInfo();break;
                            case'G':F_.Attacking(G_);G_.ShowInfo();break;
                            case'H':F_.Attacking(H_);H_.ShowInfo();break;
                            case'I':F_.Attacking(I_);I_.ShowInfo();break;
                            case'J':F_.Attacking(J_);J_.ShowInfo();break;
                        }
                        F_.ShowInfo();
                        break;
                    }
                    case 'G':{
                        switch (pa){
                            case'B':G_.Attacking(B_);B_.ShowInfo();break;
                            case'C':G_.Attacking(C_);C_.ShowInfo();break;
                            case'D':G_.Attacking(D_);D_.ShowInfo();break;
                            case'E':G_.Attacking(E_);E_.ShowInfo();break;
                            case'F':G_.Attacking(F_);F_.ShowInfo();break;
                            case'A':G_.Attacking(A_);A_.ShowInfo();break;
                            case'H':G_.Attacking(H_);H_.ShowInfo();break;
                            case'I':G_.Attacking(I_);I_.ShowInfo();break;
                            case'J':G_.Attacking(J_);J_.ShowInfo();break;
                        }
                        G_.ShowInfo();
                        break;
                    }
                    case 'H':{
                        switch (pa){
                            case'B':H_.Attacking(B_);B_.ShowInfo();break;
                            case'C':H_.Attacking(C_);C_.ShowInfo();break;
                            case'D':H_.Attacking(D_);D_.ShowInfo();break;
                            case'E':H_.Attacking(E_);E_.ShowInfo();break;
                            case'F':H_.Attacking(F_);F_.ShowInfo();break;
                            case'G':H_.Attacking(G_);G_.ShowInfo();break;
                            case'A':H_.Attacking(A_);A_.ShowInfo();break;
                            case'I':H_.Attacking(I_);I_.ShowInfo();break;
                            case'J':H_.Attacking(J_);J_.ShowInfo();break;
                        }
                        H_.ShowInfo();
                        break;
                    }
                    case 'I':{
                        switch (pa){
                            case'B':I_.Attacking(B_);B_.ShowInfo();break;
                            case'C':I_.Attacking(C_);C_.ShowInfo();break;
                            case'D':I_.Attacking(D_);D_.ShowInfo();break;
                            case'E':I_.Attacking(E_);E_.ShowInfo();break;
                            case'F':I_.Attacking(F_);F_.ShowInfo();break;
                            case'G':I_.Attacking(G_);G_.ShowInfo();break;
                            case'H':I_.Attacking(H_);H_.ShowInfo();break;
                            case'A':I_.Attacking(A_);A_.ShowInfo();break;
                            case'J':I_.Attacking(J_);J_.ShowInfo();break;
                        }
                        I_.ShowInfo();
                        break;
                    }
                    case 'J':{
                        switch (pa){
                            case'B':J_.Attacking(B_);B_.ShowInfo();break;
                            case'C':J_.Attacking(C_);C_.ShowInfo();break;
                            case'D':J_.Attacking(D_);D_.ShowInfo();break;
                            case'E':J_.Attacking(E_);E_.ShowInfo();break;
                            case'F':J_.Attacking(F_);F_.ShowInfo();break;
                            case'G':J_.Attacking(G_);G_.ShowInfo();break;
                            case'H':J_.Attacking(H_);H_.ShowInfo();break;
                            case'I':J_.Attacking(I_);I_.ShowInfo();break;
                            case'A':J_.Attacking(A_);A_.ShowInfo();break;
                        }
                        J_.ShowInfo();
                        break;
                    }
                }
            }
        }
    }
}
