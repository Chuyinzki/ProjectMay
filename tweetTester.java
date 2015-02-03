import java.util.Scanner;
 
class tweetTester {
    public static void main(String[] args){
      
Scanner scan = new Scanner(System.in);

System.out.println("Please enter a tweet:");
String tweet = scan.nextLine();
scan.close();
 
int tlength = tweet.length();
int hashtags = 0;
int attributes = 0;
int links = 0;
int count = 0;
char letter1;
 
 
System.out.println(tweet);
tweet = tweet.toLowerCase();
if(tlength > 140){
  System.out.println("Excess Characters: " + (tlength - 140));
}
else{
  while (count < tlength - 1){
    letter1 = tweet.charAt(count);
    
    if(letter1 == '#' && tweet.charAt(count + 1) != ' ' && tweet.charAt(count + 1) != '\t'){
        hashtags++;
        count++;
    }
    else if(letter1 == '@' && tweet.charAt(count + 1) != ' ' && tweet.charAt(count + 1) != '\t'){
      attributes++;
      count++;
    }
    else if(letter1 == 'h'){
      if(tweet.startsWith("http://", count)){
        links++;
        count++;
      }
      else{
        count++;
      }
    }
    else{
        count++;
      }
    }
    
    System.out.println("Length Correct");
    System.out.println("Number of Hashtags: " + hashtags);
    System.out.println("Number of Attributions: " + attributes);
    System.out.println("Number of Links: " + links);
}
}
}