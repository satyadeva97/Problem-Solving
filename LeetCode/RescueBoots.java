//public class RescueBoots {
//
//  public int numRescueBoats(int[] people, int limit) {
//
//    Arrays.sort(people);
//    int count = 0;
//    int j = people.length - 1;
//    int i = 0;
//    while( i <= j) {
//      if (people[i] + people[j] <= limit)  {
//        i++;
//      }
//      j--;
//      count++;
//    }
//
//    return i == j ? count : count++;
//
//  }
//}
