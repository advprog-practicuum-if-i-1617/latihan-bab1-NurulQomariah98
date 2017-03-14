package mainpacman;

public class pacman {
    int up,down,left,right;
    int x=10,y=10,i,j,w=1,z=3,a=0,b=0,c=0;
    String [][]pacman = new String [10][10];
    
    public void right() {
        z = z + 1;
        if (w==0||w==9||z==0||z==9||w==2&&(z==2||z==3||z==6||z==7||z==8)||w==4&&(z==1||z==2||z==3||z==4)||w==5&&(z==7||z==8)||w==7&&(z==1||z==2||z==3||z==6)||w==8&&z==6){
            z = z - 1;
        }
    }
    public void left() {
        z = z - 1;
        if (w==0||w==9||z==0||z==9||w==2&&(z==2||z==3||z==6||z==7||z==8)||w==4&&(z==1||z==2||z==3||z==4)||w==5&&(z==7||z==8)||w==7&&(z==1||z==2||z==3||z==6)||w==8&&z==6){
           z = z + 1;
        }
    }
    public void up() {
        w = w - 1;
        if (w==0||w==9||z==0||z==9||w==2&&(z==2||z==3||z==6||z==7||z==8)||w==4&&(z==1||z==2||z==3||z==4)||w==5&&(z==7||z==8)||w==7&&(z==1||z==2||z==3||z==6)||w==8&&z==6){
            w = w + 1;
        }
    }
    public void down() {
        w = w + 1;
        if (w==0||w==9||z==0||z==9||w==2&&(z==2||z==3||z==6||z==7||z==8)||w==4&&(z==1||z==2||z==3||z==4)||w==5&&(z==7||z==8)||w==7&&(z==1||z==2||z==3||z==6)||w==8&&z==6){
            w = w - 1;
        }
    }
    
    public void displayMessage(){   
        for (int i=0;i<=9;i++){
            for (int j=0;j<=9;j++){
                if (i==0||i==9||j==0||j==9||i==2&&(j==2||j==3||j==6||j==7||j==8)||i==4&&(j==1||j==2||j==3||j==4)||i==5&&(j==7||j==8)||i==7&&(j==1||j==2||j==3||j==6)||i==8&&j==6){ //peta pacman
                pacman [i][j] = "#";
                }
                else if (i==5&&j==3||i==3&&j==6||i==7&&j==7){//letak makanan
                        pacman [i][j] = "+";
                }
                else{
                    pacman [i][j] = " ";
                } 
                if (i==w&&j==z){
                    pacman [i][j] = "?";//letak pacman
                }
                if (w==3&&z==6) {
                    a = 1;
                }
                else if (a > 0) {
                    pacman[3][6] = " ";
                }
                if (w==5&&z==3) {
                    b = 1;
                }
                else if (b > 0) {
                    pacman[5][3] = " ";
                }
                if (w==7&&z==7) {
                    c = 1;
                }
                else if (c > 0) {
                    pacman[7][7] = " ";
                }
                System.out.print(pacman[i][j]);
        }
            System.out.println(" ");
            if (a > 0 && b > 0 && c > 0) {
                System.out.println("Selamat anda menang.");
                System.exit(0);
    }
}
    }
}