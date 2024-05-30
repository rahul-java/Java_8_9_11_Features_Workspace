import java.util.Random;
import java.util.stream.Stream;

public class GenerateMethodTest {

	public static void main(String[] args) {
		
		//Stream.generate(()->new Random().nextInt()).forEach(n->System.out.println(n));
		Stream.generate(()->new Random().nextInt()).limit(5).forEach(n->System.out.println(n));
		Stream.generate(()->100).limit(5).forEach(n->System.out.println(n));
	}
}
