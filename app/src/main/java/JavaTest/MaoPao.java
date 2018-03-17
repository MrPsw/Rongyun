package JavaTest;

/**
 * Created by Administrator on 2018\3\13 0013.
 */

public class MaoPao {
    public static void main(String[] args) {
    int array[]=new int[]{1,2,4,9,37,3,9};
    MaoPao(array);
        Maopao(array);
        Maopao3(array);
    }

    /**
     * 冒泡排序（复习）
     * @param array
     */
    public static void MaoPao(int array[]){
        int temp;
        for (int i = 0; i <array.length ; i++) {
            for(int j=array.length-1;j>i;j--){
                if(array[j]>array[j-1]){
                    temp=array[j-1];
                    array[j-1]=array[j];
                    array[j]=temp;
                }
            }
        }

        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]+"");
        }
    }


    public  static  void Maopao(int array[]){
        int temp;
        for(int i=array.length;i<=0;i--){
         if(array[i]<array[-1]){
             temp=array[i];
             array[-1]=temp;
             array[i]=array[-1];
         }
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]+"");
        }
    }
    private static void Maopao3(int array[]){
        int tem;
        for (int i = 0; i <array.length ; i++) {
            for(int j=array.length-1;j>i;j--){
                if(array[j-1]>array[j]){
                    tem=array[j-1];
                    array[j-1]=array[j];
                    array[j]=tem;
                }
            }
        }

        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]+"");
        }
    }

}
