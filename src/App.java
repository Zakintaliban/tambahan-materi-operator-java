public class App {
    public static void main(String[] args) throws Exception {
                // operasi shift (2 dipangkat dengan angka yang di shift, contoh jika 6 maka 2 pangkat 6)
                int x = 10;
                System.out.println(x<<6);//10*2^6=10*64=640  
                System.out.println(x>>2);//10/2^2=10/4=2
        
                // operasi logical (&&, ||) dan bitwise (&, |)
                int i=10;  
                int j=5;  
                int k=20; 
                int l=20;
                int m=10;
                int n=40; 
                System.out.println(i<j&&i++<k);//false && true = false  
                System.out.println(i);//10 karena kondisi kedua tidak di cek
                System.out.println(i<j&i++<k);//false && true = false  
                System.out.println(i);//11 karena kondisi kedua di cek
                System.out.println(l>m||l++<n);//true || true = true  
                System.out.println(l);//20 karena kondisi kedua tidak di cek
                System.out.println(l>m|l++<n);//true | true = true  
                System.out.println(l);//21 karena kondisi kedua di cek
        
                // operasi ternary
                int a=10;  
                int b=5; 
                // if else konvensional
                if (a < b) {
                    System.out.println(a);
                }
                else {
                System.out.println(b);
                }
                // cara pendek untuk membuat if else atau operasi ternary
                int angkaKecil=(a<b)?a:b;  
                System.out.println(angkaKecil);
    }
}
