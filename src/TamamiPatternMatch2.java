import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class TamamiPatternMatch2 {
   public static void main(String[] args) {
      String userAgent = new String("IP:127.17.011.12 ENV=Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/63.0.3239.132 Safari/537.36");
      String endStringToFind = "ENV=";
      String startStringToFind = ":";
      String userAgentToFind = "=";

      int endIndexOfIP = userAgent.indexOf(endStringToFind);
      int startIndexOfIP = userAgent.indexOf(startStringToFind);
      int startIndexOfUserAgent = userAgent.indexOf(userAgentToFind);


      System.out.printf("Start Index of: %d", startIndexOfIP);
      System.out.println();
      System.out.printf("End Index of: %d", endIndexOfIP);
      System.out.println();
      System.out.printf("User Agent Index of: %d", startIndexOfUserAgent);
      System.out.println();

      int startIndex = startIndexOfIP + 1; // 3
      int endIndex = endIndexOfIP - 1; // 12
      int startUserAgentIndex = startIndexOfUserAgent + 1;

      String strLetter = userAgent.substring(startIndex, endIndex);
      String strUserAgent = userAgent.substring(startUserAgentIndex);


      System.out.println();
      System.out.printf("Final output: %s", strLetter);

      System.out.println();
      System.out.printf("User Agent output: %s", strUserAgent);
   }
};



