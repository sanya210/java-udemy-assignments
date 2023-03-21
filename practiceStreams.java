package lambdaPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class practiceStreams {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,1,5,4,6,3,8);

        Stream<Integer> data = nums.stream();
        nums.forEach(n -> System.out.print(n+" "));
        //count returns int here
        //System.out.println(data.count());
        //stream can only be used once, here data.count()
        //or data.sorted() only one can exist
        System.out.println();
        Stream<Integer> sortedData = data.sorted();
        sortedData.forEach(n -> System.out.print(n+" "));
        System.out.println();
        Stream<Integer> data1 = nums.stream();
        Stream<Integer> mappedData = data1.map(n -> n*2);
        mappedData.forEach(n -> System.out.print(n+" "));
        System.out.println();
        advanceStream();
    }
    public static void advanceStream()
    {
        List<Integer> nums = Arrays.asList(2,1,5,4,6,3,8);
        //all in one line like pipeline
        nums.stream().sorted().map(n -> n*2).forEach(n -> System.out.println(n));
        //like a pipeline
        nums.stream()
                .filter(n -> n%2==0)
                .sorted()
                .map(n -> n*2)
                .forEach(n -> System.out.println(n));

        //sum all the elements
        int res = nums.stream()
                .filter(n -> n%2==0)
                .sorted()
                .map(n -> n*2)
                .reduce(0,(c,e)->c+e);
        System.out.println(res);
    }
}
