package StringBuilder;

public class main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        // System.out.println(sb);
        // System.out.println(sb.charAt((0)));
        
        // sb.setCharAt(0, 'p'); //replace char from the char on index 
        // sb.insert(0,'S'); //insert char at that index
        // sb.delete(2, 4); //delete  char inbetween range
        // System.out.println(sb);
        
        
        StringBuilder ch= new StringBuilder("K");
        ch.append('e');
        ch.append('s');
        ch.append('h');
        ch.append('a');
        ch.append('v');
        System.out.println(ch);
        System.out.println(ch.length());
        
        for(int i=0;i<sb.length()/2;i++){

            int front = i;
            int back = sb.length() - 1 -i ;

            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);
            
            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
        }
        System.out.println(sb);
    }
}
