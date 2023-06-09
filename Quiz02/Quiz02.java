public class Quiz02 {
    static void snail(int count){

        int total = count * count;
        int array[][] = new int [count][count];

        int i = 0;
        int j = 0;
        int n = 1;

        while(n<total){
            System.out.println("위쪽");
            for(int j=0; j < count; j++){
                array[i][j] = n++;
                System.out.println(" i값은 : " +i +" j값은 : " +j + " 값은 : "+array[i][j]);
            }
            // i는 0, j 는 3의 값을 가진다. (0,3)
            j = j -1;
            System.out.println("오른쪽");
            for(int i = i + 1; i < count; i++){
                array[i][j] = n++;
                System.out.println("i값은 : "+i+"j값은 : "+ j + "값은 : "+array[i][j]);
            }
            // i 는 3, j는 2의 값을 가진다. (3,2)
            i = i-1;
            System.out.println("아래쪽");
            for(int j = j-1; j >=0; j--){
                array[i][j] =n++;
                System.out.println("i값은 : " + i +"j값은 : "+j + " 값은 :" + array[i][j]);
            }
            // i는 2, j 는 -1의 값을 가진다 (2,-1)
            j = j+1;
            for(int i = i-1; i>0; i--){
                array[i][j] = n++;
                System.out.println("i값은 : "+i+ "j값은 : "+j+"값은 : "+array[i][j]);
            }
            // i는 0, j는 0의 값을 가진다. (0,0)
            i = i+1;
            System.out.println("중앙");
            for (int j = j+1; j<2; j++){
                array[i][j] = n++;
                System.out.println("i값은 : "+i+"j값은 : "+j+"값은 : "+array[i][j]);
            }
        }

        for(int a = 0; a < count ; a++){
            for(int b = 0; b < count; b++){
                System.out.print(array[a][b]+" ");
            }

            System.out.println();
        }
}


