package lambdaStudent;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GeneratingStudent {
    public static List<Student> generateStudents() {  // Պետք է լինի public static
        Random random = new Random();
        List<String> names = List.of("Gago", "Vazgen", "Ara", "Any", "Jhon", "Dayneris", "Nane",
                "Artashes", "Arman", "Anna", "Karen", "Sona", "David", "Mariam", "Ani",
                "Nare", "Aram", "Suren");

        return IntStream.range(0, 20)
                .mapToObj(i -> new Student(
                        names.get(random.nextInt(names.size())),
                        random.nextInt(5) + 18,  // Տարիքը 18-22
                        random.nextDouble() * 40 + 50,  // Գնահատականը 50-90
                        String.valueOf(2002 + random.nextInt(6)) // Ծննդյան տարին 2002-2007
                ))
                .collect(Collectors.toList());
    }
}