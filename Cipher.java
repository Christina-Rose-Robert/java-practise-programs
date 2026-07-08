//Cryptography
import java.util.*;
public class Cipher
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Press 1 to encrypt a message.");
        System.out.println("Press 2 to decrypt a message.");
        int choice1 = sc.nextInt();
        switch (choice1)
        {
            case 1: //encrypt();
            System.out.println("\nSelect one of the ciphers listed below by pressing their respective serial number.");
            System.out.println("1. Caesar cipher");
            System.out.println("2. Playfair cipher");
            System.out.println("3. Vigenère cipher");
            System.out.println("4. Substitution cipher");
            System.out.println("5. Pig Latin cipher");
            System.out.println("6. AES cipher");
            System.out.println("7. Atbash cipher");
            System.out.println("8. Beufort cipher");
            System.out.println("9. Straddle Checkerboard cipher");
            System.out.println("10. ROT13 cipher");
            int choice2 = sc.nextInt();
            switch(choice2)
            {
                case 1: caesarCipher(); break;
                case 2: playfairCipher(); break;
                case 3: vigenereCipher(); break;
                case 4: substituitionCipher(); break;
                case 5: piglatinCipher(); break;
                case 6: aesCipher(); break;
                case 7: atbashCipher(); break;
                case 8: beaufortCipher(); break;
                case 9: straddlecheckerboardCipher(); break;
                case 10:rot13Cipher(); break;
            }
            break;
            
            case 2: decrypt();
                    break;
                    
            default:System.out.println("\nInvalid input.");
        }
    }
    public static void caesarCipher()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("\nEnter the message you wish to encrypt: ");
        String s = sc.nextLine();
        System.out.println("\nEnter a key: ");
        int n = sc.nextInt();
        int l = s.length();
        int encryptedCharacter1 = 0;
        String encryptedCharacter2 = "";
        int decryptedCharacter1 = 0;
        String decryptedCharacter2 = "";
        for(int i = 0; i < l; i++)
        {
            char ch = s.charAt(i); 
            if(ch == ' ')
            {
                System.out.print(ch);
                encryptedCharacter2 = encryptedCharacter2 + ch;
            }
            else
            {
                encryptedCharacter1 = ch + n;
                encryptedCharacter2 = encryptedCharacter2 + (char)(encryptedCharacter1);
                System.out.print((char)(encryptedCharacter1));
            }
        }
        System.out.println();
        /*System.out.println("\nDo you wish to decrypt the same message?");
        String decision = sc.next();
        if(decision.equalsIgnoreCase("yes"))
        {
            encryptedCharacter2 += " ";
            for(int i = 0; i < encryptedCharacter2.lastIndexOf(" "); i++)
            {
                char ch = encryptedCharacter2.charAt(i);
                if(ch == ' ')
                {
                    System.out.print(ch);
                }
                else
                {
                    decryptedCharacter1 = ch - n;
                    decryptedCharacter2 = decryptedCharacter2 + (char)(decryptedCharacter1);
                    System.out.print((char)(decryptedCharacter1));
                }
            }   
        }*/
    }
    public static void playfairCipher()
    {
       Scanner sc = new Scanner (System.in); 
       
    }
    public static void vigenereCipher()
    {
       Scanner sc = new Scanner (System.in);
       System.out.println("\nEnter the message you wish to encrypt: ");
       String str = sc.nextLine();
       System.out.println("\nEnter a one-word key: ");
       String key = sc.next();
       int length = str.length();
       String encryptedString = "";
       int a = 0;
       int b = 1;
       int c = 2;
       int d = 3;
       int e = 4;
       int f = 5;
       int g = 6;
       int h = 7;
       int i = 8;
       int j = 9;
       int k = 10;
       int l = 11;
       int m = 12;
       int n = 13;
       int o = 14;
       int p = 15;
       int q = 16;
       int r = 17;
       int s = 18;
       int t = 19;
       int u = 20;
       int v = 21;
       int w = 22;
       int x = 23;
       int y = 24;
       int z = 25;
       String duplicate = "";
       for(int index1 = 0; index1 < length; index1++)
       {
           for(int index2 = 0; index2 < key.length(); index2++)
           {
               char ch =  key.charAt(index2);
               duplicate = encryptedString + ch;
           }
       }
       for(int index3 = 0; index3 < length; index3++)
       {
           char ch1 = str.charAt(index3);
           for(int index4 = 0; index4 < key.length(); index4++)
           {
               char ch2 = key.charAt(index4);
               //encryptedString = ch1 + ((int)ch2 + (int)ch1);
               
           }
       }
    }
    public static void substituitionCipher()
    {
                
    }
    public static void piglatinCipher()
    {
                
    }
    public static void aesCipher()
    {
                
    }
    public static void atbashCipher()
    {
                
    }
    public static void beaufortCipher()
    {
                
    }
    public static void straddlecheckerboardCipher()
    {
                
    }
    public static void rot13Cipher()
    {
                
    }
    
    public static void decrypt()
    {
        
    }
}