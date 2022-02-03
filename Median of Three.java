//created by esthi from ETHz Code Expert
//https://expert.ethz.ch/ide2/xKXNqteEY8kRbGuoW

class Main {
    public static void main(String[] args) {
      //this is the beginning of the code 
      
        int round = In.readInt(); //Read the number of actions
        
        for(int i=0; i<round ;i++)
            Out.println(Median(In.readInt(),In.readInt(),In.readInt()));
      // we want to print output from Median readInt, and input readInt
     
    }
    
    public static int Median(int a, int b, int c)
    {
      int min = Math.min(Math.min(a, b), c);
      //literally gets the minimum of the Math min function. 
      int max = Math.max(Math.max(a, b), c);
      //gets the maximum of the number
      if (a != min && a != max) {
        // we want to check if a does not equal to the minimum and a does not equal to maximum of a, b and c. 
        // but why do we not include the same?
        return a;
      }
      else if (b != min && b != max) {
        return b;
        // in same theory, we apply be the same as well. 
      }
      else {
        return c;
      }
}
}
