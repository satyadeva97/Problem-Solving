import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Typosquatting {
  public static void main(String[] args) {
    List<String> companyDomains = new ArrayList<>();
    companyDomains.add("palantir.com");
    companyDomains.add("apple.com");
    List<String> newDomains = new ArrayList<>();
    newDomains.add("palantir.biz");
    newDomains.add("apple.org");
    newDomains.add("apple.com");
    newDomains.add("appleorchard.net");
    System.out.println(typoSquats(companyDomains, newDomains).toString());

  }

  private static List<String> typoSquats(List<String> companyDomains, List<String> newDomains) {
    Set<String> set1 = new HashSet<>();
    Set<String> set2 = new HashSet<>();
    Set<String> set3 = new HashSet<>();
    List<String> result = new ArrayList<>();
    for (int i = 0; i < companyDomains.size(); i++) {
//      System.out.println(companyDomains.toString());
      String[] nam = companyDomains.get(i).split("\\.");
//      System.out.println(Arrays.toString(nam));
      set1.add(nam[0]);
      set2.add(nam[1]);
      set3.add(companyDomains.get(i));
    }
    for (int j = 0; j < newDomains.size(); j++) {
      String[] name = newDomains.get(j).split("\\.");
      if (!set3.contains(newDomains.get(j))) {
        if (set1.contains(name[0])) {
          result.add(newDomains.get(j));
        }
      }
    }
    return result;
  }
}
