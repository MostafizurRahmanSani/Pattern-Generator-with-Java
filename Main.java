import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> names1 = new ArrayList<>();
        
        names1.add("AFIYA");
        names1.add("Nasim");
        names1.add("Jubed");
        names1.add("MAHIN");
        names1.add("LABON");
        names1.add("MASUM");
        names1.add("ROBIN");
        names1.add("ANIKA");
        names1.add("ANISA");
        names1.add("RAYAS");
        names1.add("LABIB");
        names1.add("FADIL");

        ArrayList<String> names2 = new ArrayList<>();
        
        names2.add("ASIFA");
        names2.add("NIL  ");
        names2.add("JAMIL");
        names2.add("MARUF");

        ArrayList<String> names3 = new ArrayList<>();
        
        names3.add("     ");
        names3.add("  NUS");
        names3.add("     ");
        names3.add("  NIL");


        ArrayList<String> names4k = new ArrayList<>();
        
        names4k.add("RIA  ");
        names4k.add("SHAMS");
        names4k.add("FAHIM");
        names4k.add("KAMAL");

        System.out.println("");
        System.out.println("");



        int one = 0, onel = 0;
        int idx = 0;
        for(int i = 1; i < 36; i++){

            if(i > 24){
      
                if((i-1) % 6 == 0){
                    System.out.print(names4k.get(idx).charAt(0));
                    idx++;   
                }else if((i+1) % 6 == 0){
                    System.out.print(names4k.get(idx).charAt(0));
                    System.out.print("  ");
                    idx++;
                }else{
                    System.out.print(" ");
                }
            }else{
                if(i % 6 == 0){ 
                    System.out.print("   ");
                    one++;
                    onel = 0;
                    continue;
                }
                System.out.print(names1.get(one).charAt(onel));
                onel++;

            }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
        }


        
        System.out.println("");



        int two = 0, twol = 1;
        idx = 0;
        for(int i = 1; i < 36; i++){
            if(i == 25){
                System.out.print("   ");
            }
            if(i > 24){
                if(i == 34){
                    System.out.print(names4k.get(idx).charAt(1));
                    break;
                }
                if((i-1) % 6 == 0){
                    System.out.print(names4k.get(idx).charAt(1));
                    idx++;
                  //  i++;      
                }else if((i+1) % 6 == 0){
                    System.out.print(names4k.get(idx).charAt(1));
                    System.out.print("  ");
                    idx++;
                }else{
                    System.out.print(" ");
                }
            }

            if(i < 24){
                if(i == 1){
                    System.out.print(names2.get(two).charAt(twol));
                    continue;
                }
                
                if(i % 6 == 0){ 
                    System.out.print("   ");
                    System.out.print(names2.get(two).charAt(twol));
                    i++;
                }else if((i+1) % 6 == 0){
                    System.out.print(names3.get(two).charAt(twol));
                    two++;
                }else{
                    System.out.print(" ");
                }
            }
                
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
        }

        System.out.println("");


        onel = 0;
        one--;
        for(int i = 1; i < 36; i++){

            if(i == 30){
                System.out.print("   ");
            }

            if(i > 30){
                System.out.print(names4k.get(2).charAt(2) + " ");
                System.out.print(names4k.get(3).charAt(2));
                break;
            }
            if(i < 30){
                if(i == 1){
                    System.out.print(names2.get(0).charAt(2));
                    System.out.print("    ");
                    i = 5;
    
                    continue;
                }
                
                if(i % 6 == 0){ 
                    System.out.print("   ");
                    one++;
                    onel = 0;
                    continue;
                }
                System.out.print(names1.get(one).charAt(onel));
                onel++;

            } 

            
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
        }

        System.out.println("");


        two = 0;
        twol = 3;
        idx = 0;
        for(int i = 1; i < 36; i++){

            if(i == 25){
                System.out.print("   ");
            }
            if(i > 24){
                if(i == 34){
                    System.out.print(names4k.get(idx).charAt(1));
                    break;
                }
                if((i-1) % 6 == 0){
                    System.out.print(names4k.get(idx).charAt(3));
                    idx++;
                  //  i++;      
                }else if((i+1) % 6 == 0){
                    System.out.print(names4k.get(idx).charAt(3));
                    System.out.print("  ");
                    idx++;
                }else{
                    System.out.print(" ");
                }
            }

            if(i < 24){
                if(i == 1){
                    System.out.print(names2.get(two).charAt(twol));
                //  two++;
                    continue;
                }
                
                if(i % 6 == 0){ 
                    System.out.print("   ");
                    System.out.print(names2.get(two).charAt(twol));
                    i++;
                }else if((i+1) % 6 == 0){
                    System.out.print(names3.get(two).charAt(twol));
                    two++;
                }else{
                    System.out.print(" ");
                }
            }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
        }



        System.out.println("");

        one++;
        onel = 0;
        idx = 0;
        for(int i = 1; i < 36; i++){
            if(i == 24){
                System.out.print("   ");
            }

            if(i > 24){
      
                if((i-1) % 6 == 0){
                    System.out.print(names4k.get(idx).charAt(4));
                    idx++;   
                }else if((i+1) % 6 == 0){
                    System.out.print(names4k.get(idx).charAt(4));
                    System.out.print("  ");
                    idx++;
                }else{
                    System.out.print(" ");
                }
            }
            if(i < 24){
                if(i % 6 == 0){ 
                    System.out.print("   ");
                    one++;
                    onel = 0;
                    continue;
                }
                System.out.print(names1.get(one).charAt(onel));
                onel++;

            } 
            
            
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
        }


        System.out.println("");
        System.out.println("");
    }
}

