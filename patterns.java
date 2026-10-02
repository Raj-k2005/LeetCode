//patterns
public class patterns{
    public static void main(String[] args){
    pattern1(5);
    // * 
    // * * 
    // * * * 
    // * * * * 


    pattern2(4);
    // * * * * * 
    // * * * * * 
    // * * * * * 
    // * * * * * 
    // * * * * * 


    pattern3(5);
    // * * * * * 
    // * * * * 
    // * * * 
    // * * 
    // * 


    pattern4(5);
    // 0
    // 01
    // 012
    // 0123

    pattern5(5);
    // * 
    // * * 
    // * * * 
    // * * * * 
    // * * * * * 
    // * * * * 
    // * * * 
    // * * 
    // * 


    pattern6(5);
    //     *
    //    * *   
    //   * * *
    //  * * * *
    

    pattern7(5);
//     * 
//    * * 
//   * * * 
//  * * * * 
// * * * * * 
//  * * * * 
//   * * * 
//    * * 
//     * 

pattern8(5);
//     1
//    121
//   12321
//  1234321

// pattern9(5);
//      1 
//    2 1 2 
//   3 2 1 2 3 
//  4 3 2 1 2 3 4 
// 5 4 3 2 1 2 3 4 5 
//  4 3 2 1 2 3 4 
//   3 2 1 2 3 
//    2 1 2 
//     1 

    }
    static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void pattern2(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void pattern3(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void pattern4(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
         for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }


    static void pattern6(int n){
        for(int i=0;i<n;i++){
            int space = n-i;
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

      static void pattern7(int n){
        for(int i=0;i<n;i++){
            int space = n-i;
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
                int space = i;
                for(int j=0;j<space;j++){
                    System.out.print(" ");
                }
                for(int j=0;j<n-i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
    }

    static void pattern8(int n){
        for(int i=0;i<=n;i++){
            for(int space=0;space<n-i;space++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            for(int j=2;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    
    static void pattern9(int n){
        for(int i=1;i<=2*n;i++){
            int c=i>n?2*n-i:i;
            for(int space=0;space<n-c;space++){
                System.out.print(" ");
            }
            for(int j=c;j>=1;j--){
                System.out.print(j+" ");
            }
            for(int j=2;j<=c;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}