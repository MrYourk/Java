package chapter12.exception_;

/**
 * @author hoengjing
 * @version 1.0
 */
public class TryCatchExercise01 {
    public static void main(String[] args) {
        System.out.println(Exception03.method());
    }

}

 class Exception03{
     public static int method(){
         int i = 1;
         try {
             i++;
             String[] names = new String[3];
             if (names[1].equals("tom")){
                 System.out.println(names[1]);
             }else {
                 names[3] = "hespdu";
             }
             return 1;
         } catch (ArrayIndexOutOfBoundsException e){
             return 2;
         } catch (NullPointerException e){//捕获
             return ++i;//不会返回
         } finally {
             ++i;
             System.out.println("i="+ i);
         }
     }
}

