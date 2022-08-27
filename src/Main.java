import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String userName, password,select,newPassword;

        System.out.print("Kullanıcı Adınız : ");
        userName=input.nextLine();
        System.out.print("Şifreniz : ");
        password=input.nextLine();

        if (userName.equals("emrah")){
            if (password.equals("123456")){
                System.out.println("Giriş Başarılı");
            }else
            {
                System.out.println("şifreniz yanlıştır");
                System.out.println("şifrenizi sıfırlamakk istermisiniz\n 1- evet\n 2- hayır\n");
                select=input.nextLine();
                if (select.equals("evet")){
                    System.out.println("yeni şifreyi girin : ");
                    newPassword = input.nextLine();
                    if (newPassword.equals("123456")){
                        System.out.println("Şifre Oluşturulamadı, lütfen başka bir şifre giriniz");
                    }else
                    {
                        System.out.println("Şifre Oluşturuldu");
                    }
                }

            }

        }else
        {
            System.out.println("kullanıcı adı uyanlış");
        }


    }
}
