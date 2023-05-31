import java.util.Scanner;

public class game3 {
    // String arr[][] = new String[5][5];
    public static void main(String[] args) {
        String arr[][] = new String[5][5];

        // xox = new xox();
        int i = 0, j = 0, n = 10;

        Scanner sc = new Scanner(System.in);
        System.out.println("*****************************");
        System.out.println("                             WELCOME TO THE GAME TIC TAC TOE");
        System.out.println("*****************************");
        System.out.println("                             Lets begin the game................");
        // for(r=0;r<5;r++)
        // for(c=0;c<5;c++)
        // {
        // if(c==1||c==3)
        // arr[r][c]="|";}

        // for(r=0;r<5;r++)
        // for(c=0;c<5;c++)
        // {
        // if(r==1||r==3)
        // arr[r][c]="__";}
        for (int r = 0; r < 5; r++)
            for (int c = 0; c < 5; c++) {
                if (c == 1 || c == 3)
                    arr[r][c] = "|";
            }
        for (int r = 0; r < 5; r++)
            for (int c = 0; c < 5; c++) {
                if ((r == 1 || r == 3) && (c == 0 || c == 2 || c == 4))
                    arr[r][c] = "-";
            }
        for (int r = 0; r < 5; r++)
            for (int c = 0; c < 5; c++) {
                if ((r == 1 || r == 3) && (c == 1 || c == 3))
                    arr[r][c] = "+";
            }
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                if ((r == 0 && (c == 0 || c == 2 || c == 4)) || (r == 2 && (c == 0 || c == 2 || c == 4))
                        || (r == 4 && (c == 0 || c == 2 || c == 4))) {
                    ++i;
                    String s = String.valueOf(i);
                    arr[r][c] = s;
                }
            }
        }
        for (int r = 0; r < 5; r++) {
            for (int sp = 0; sp < 40; sp++) {
                System.out.print(" ");
            }
            for (int c = 0; c < 5; c++) {
                System.out.print(arr[r][c]);
            }
            System.out.println();
        }
        System.out.println("                       note down the above mentioned positions");
        System.out.println(
                "if you miss the position or enter position already taken you might lose your chance and might lose the game");
        System.out.println("                       so,play carefully ALL THE BEST.........");
        System.out.println("*****************************");
        System.out.println("  Enter your name ");
        System.out.print("   user 1 = ");
        String l = sc.next();
        System.out.print("   user 2 = ");
        String m = sc.next();
        System.out.println("*****************************");
        System.out.println("select the charcters to play");
        System.out.print(l + " = ");
        String a = sc.next();
        System.out.print(m + " = ");
        String b = sc.next();
        // int j=0;

        int ar[] = new int[50];
        la:
        // int k = 1;
        for (j = 1; j < n; j++) {
            if (j % 2 != 0) {
                System.out.print((l + " select the position ="));
                int d = sc.nextInt();
                if (d > 9) {
                    System.out.println("                     invalid position...you lost your chance");
                    System.out.println("*************************");
                    ++n;
                    continue la;
                }
                // for (i = 0; i < 9; i++) {
                // System.out.println(ar[i]);
                // }
                for (int k = 0; k < 50; k++) {
                    if (ar[k] == d) {
                        System.out.println("                position is alredy taken.....you lost your chance");
                        System.out.println("***********************");
                        ++n;
                        continue la;
                    }
                }
                ar[j - 1] = d;
                // for (i = 0; i < 9; i++) {
                // System.out.println(ar[i]);
                // }
                if (d < 10 && d > 0) {
                    if (d == 1) {
                        arr[0][0] = a;
                    }
                    if (d == 2) {
                        arr[0][2] = a;
                    }
                    if (d == 3) {
                        arr[0][4] = a;
                    }
                    if (d == 4) {
                        arr[2][0] = a;
                    }
                    if (d == 5) {
                        arr[2][2] = a;
                    }
                    if (d == 6) {
                        arr[2][4] = a;
                    }
                    if (d == 7) {
                        arr[4][0] = a;
                    }
                    if (d == 8) {
                        arr[4][2] = a;
                    }
                    if (d == 9) {
                        arr[4][4] = a;
                    }
                    // if (d > 9) {
                    // System.out.println("invalid position");
                    // }
                    // continue la;
                    for (int r = 0; r < 5; r++) {
                        for (int sp = 0; sp < 40; sp++) {
                            System.out.print(" ");
                        }
                        for (int c = 0; c < 5; c++) {
                            System.out.print(arr[r][c]);
                        }
                        System.out.println();
                    }
                    System.out.println("*************************");
                    if (((arr[0][0] == a) && (arr[0][2] == a) && (arr[0][4] == a))
                            || ((arr[2][0] == a) && (arr[2][2] == a) && (arr[2][4] == a))
                            || ((arr[4][0] == a) && (arr[4][2] == a) && (arr[4][4] == a))
                            || ((arr[0][0] == a) && (arr[2][0] == a) && (arr[4][0] == a))
                            || ((arr[0][2] == a) && (arr[2][2] == a) && (arr[4][2] == a))
                            || ((arr[0][4] == a) && (arr[2][4] == a) && (arr[4][4] == a))
                            || ((arr[0][0] == a) && (arr[2][2] == a) && (arr[4][4] == a))
                            || ((arr[4][0] == a) && (arr[2][2] == a) && (arr[0][4] == a)))

                    {
                        System.out.println("                          " + l + " won");
                        System.out.println("***********************");
                        break;
                    }
                    if (((arr[0][0] == b) && (arr[0][2] == b) && (arr[0][4] == b))
                            || ((arr[2][0] == b) && (arr[2][2] == b) && (arr[2][4] == b))
                            || ((arr[4][0] == b) && (arr[4][2] == b) && (arr[4][4] == b))
                            || ((arr[0][0] == b) && (arr[2][0] == b) && (arr[4][0] == b))
                            || ((arr[0][2] == b) && (arr[2][2] == b) && (arr[4][2] == b))
                            || ((arr[0][4] == b) && (arr[2][4] == b) && (arr[4][4] == b))
                            || ((arr[0][0] == b) && (arr[2][2] == b) && (arr[4][4] == b))
                            || ((arr[4][0] == b) && (arr[2][2] == b) && (arr[0][4] == b))) {
                        System.out.println("                         " + m + " won");
                        System.out.println("***********************");
                        break;
                    }
                }
            } else {
                System.out.print((m + " select the position ="));
                int g = sc.nextInt();
                if (g > 9) {
                    System.out.println("                        invalid position...you lost your chance");
                    System.out.println(
                            "****************************");
                    ++n;
                    continue la;
                }
                // for (i = 0; i < 9; i++) {
                // System.out.println(ar[i]);
                // }
                for (int k = 0; k < 50; k++) {
                    if (ar[k] == g) {
                        System.out.println(
                                "                      position is alredy tgaken...........you lost your chance");
                        System.out.println("***********************");
                        n++;
                        continue la;
                    }
                }
                ar[j - 1] = g;

                if (g < 10 && g > 0) {
                    if (g == 1) {
                        arr[0][0] = b;
                    }
                    if (g == 2) {
                        arr[0][2] = b;
                    }
                    if (g == 3) {
                        arr[0][4] = b;
                    }
                    if (g == 4) {
                        arr[2][0] = b;
                    }
                    if (g == 5) {
                        arr[2][2] = b;
                    }
                    if (g == 6) {
                        arr[2][4] = b;
                    }
                    if (g == 7) {
                        arr[4][0] = b;
                    }
                    if (g == 8) {
                        arr[4][2] = b;
                    }
                    if (g == 9) {
                        arr[4][4] = b;
                    }
                    // if (g > 9) {
                    // System.out.println("invalid position");
                    // continue la;
                    // }
                    // continue la;
                    for (int r = 0; r < 5; r++) {
                        for (int sp = 0; sp < 40; sp++) {
                            System.out.print(" ");
                        }
                        for (int c = 0; c < 5; c++) {
                            System.out.print(arr[r][c]);
                        }
                        System.out.println();
                    }
                    System.out.println("*************************");
                    if (((arr[0][0] == a) && (arr[0][2] == a) && (arr[0][4] == a))
                            || ((arr[2][0] == a) && (arr[2][2] == a) && (arr[2][4] == a))
                            || ((arr[4][0] == a) && (arr[4][2] == a) && (arr[4][4] == a))
                            || ((arr[0][0] == a) && (arr[2][0] == a) && (arr[4][0] == a))
                            || ((arr[0][2] == a) && (arr[2][2] == a) && (arr[4][2] == a))
                            || ((arr[0][4] == a) && (arr[2][4] == a) && (arr[4][4] == a))
                            || ((arr[0][0] == a) && (arr[2][2] == a) && (arr[4][4] == a))
                            || ((arr[4][0] == a) && (arr[2][2] == a) && (arr[0][4] == a))) {
                        System.out.println("                           " + l + "won");
                        System.out.println("***********************");
                        break;
                    }
                    if (((arr[0][0] == b) && (arr[0][2] == b) && (arr[0][4] == b))
                            || ((arr[2][0] == b) && (arr[2][2] == b) && (arr[2][4] == b))
                            || ((arr[4][0] == b) && (arr[4][2] == b) && (arr[4][4] == b))
                            || ((arr[0][0] == b) && (arr[2][0] == b) && (arr[4][0] == b))
                            || ((arr[0][2] == b) && (arr[2][2] == b) && (arr[4][2] == b))
                            || ((arr[0][4] == b) && (arr[2][4] == b) && (arr[4][4] == b))
                            || ((arr[0][0] == b) && (arr[2][2] == b) && (arr[4][4] == b))
                            || ((arr[4][0] == b) && (arr[2][2] == b) && (arr[0][4] == b))) {
                        System.out.println("                          " + m + " won");
                        System.out.println("***********************");
                        break;
                    }
                }

            }
        }
        // if((arr[0][0] == arr[0][2] == arr[0][4] == a) || (arr[2][0] == arr[2][2] ==
        // arr[2][4] == a)
        // || (arr[4][0] == arr[4][2] == arr[4][4] == a) || (arr[0][0] == arr[2][0] ==
        // arr[4][0] == a)
        // || (arr[0][2] == arr[2][2] == arr[4][2] == a) || (arr[0][4] == arr[2][4] ==
        // arr[4][4] == a)
        // || (arr[0][0] == arr[2][2] == arr[4][4] == a) || (arr[0][4] == arr[2][2] ==
        // arr[4][0] == a))
        // if (((arr[0][0] == a) && (arr[0][2] == a) && (arr[0][4] == a))
        // || ((arr[2][0] == a) && (arr[2][2] == a) && (arr[2][4] == a))
        // || ((arr[4][0] == a) && (arr[4][2] == a) && (arr[4][4] == a))
        // || ((arr[0][0] == a) && (arr[2][0] == a) && (arr[4][0] == a))
        // || ((arr[0][2] == a) && (arr[2][2] == a) && (arr[4][2] == a))
        // || ((arr[0][4] == a) && (arr[2][4] == a) && (arr[4][4] == a))
        // || ((arr[0][0] == a) && (arr[2][2] == a) && (arr[4][4] == a))
        // || ((arr[4][0] == a) && (arr[2][2] == a) && (arr[0][4] == a)))

        // {
        // System.out.println(" wins");
        // System.out.println("*********");
        // }
        // if (((arr[0][0] == b) && (arr[0][2] == b) && (arr[0][4] == b))
        // || ((arr[2][0] == b) && (arr[2][2] == b) && (arr[2][4] == b))
        // || ((arr[4][0] == b) && (arr[4][2] == b) && (arr[4][4] == b))
        // || ((arr[0][0] == b) && (arr[2][0] == b) && (arr[4][0] == b))
        // || ((arr[0][2] == b) && (arr[2][2] == b) && (arr[4][2] == b))
        // || ((arr[0][4] == b) && (arr[2][4] == b) && (arr[4][4] == b))
        // || ((arr[0][0] == b) && (arr[2][2] == b) && (arr[4][4] == b))
        // || ((arr[4][0] == b) && (arr[2][2] == b) && (arr[0][4] == b))) {
        // System.out.println("user 2 wins");
        // System.out.println("*********");
        // } else {
        // System.out.println("no one as won");
        // System.out.println("*********");
        // }
        if (j > 9) {
            System.out.println("                               the game as ended as a tie");
            System.out.println("***************************");
        }
        System.out.println("                                   well played both");
        System.out.println("*****************************");
    }
}