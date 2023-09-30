import java.util.Scanner;

public class kullaniciGirisi {
    public static void main(String[] args) {
        String userName,pass;
        Scanner giris = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz:");
        userName = giris.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        pass = giris.nextLine();
        if(userName.equals("serhat") && pass.equals("1234")){
            System.out.print("Başarıyla giriş yaptınız!");
        } else if (userName.equals("serhat") && (!(pass.equals("1234")))) {
            System.out.print("Şifreniz yanlış. Şifrenizi unuttuysanız değiştirin!");
        } else if (!(userName.equals("serhat")) && (pass.equals("1234"))) {
            System.out.print("Kullanıcı adınızı yanlış girdiniz !");
        }else {
            System.out.print("Bilgilerin tamamı yanlış tekrar deneyiniz!");
        }
    }
}