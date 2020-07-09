package Week13.StreamProgram3;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class App 
{
   

	public static void main( String[] args )
    {
		List<String> words = Arrays.asList("abc", "bvfg", "aba", "abcd", "aaa","vbg");

        List<String> result = words.stream().filter(word -> word.length()== 3)
                .collect(Collectors.toList());

        List<String> result1 = result.stream().filter(word -> word.startsWith("a"))
                .collect(Collectors.toList());
System.out.println("Answer:");
        result1.forEach(word -> System.out.println(word));

		
    }
}

