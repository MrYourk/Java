package chapter12.Homework;

/**
 * @author hoengjing
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) {
        String name = "jac";
        String pwd = "1234";
        String email = "jac@shouhu.com";
        try {
            register(name,pwd,email);
            System.out.println("注册成功");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public static void register(String name, String password, String email){

        int userLength = name.length();
        if (!(userLength >= 2 && userLength <=4)){
            throw new RuntimeException("用户长度要求长度为2或3或4");
        }
        if(!(password.length() == 6 && isDigital(password))){
            throw new RuntimeException("密码长度为6，要求全是数字");
        }
        int i = email.indexOf('@');
        int i1 = email.indexOf('.');
        if (!(i > 0 && i1 > i)){
            throw new RuntimeException("邮箱中包含@和. 并且@在.的前面");
        }
    }
    public static boolean isDigital(String str){
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++){
            if (charArray[i] < '0' || charArray[i] > '9'){//说明不是数字
                return false;
            }
        }
        return true;
    }
}



