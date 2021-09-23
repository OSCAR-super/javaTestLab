import java.io.IOException;

public class GetNum {
    public static void main(String[] args) throws IOException {
        ReadFileContent readFileContent=new ReadFileContent();
        System.out.println(ReadFileContent.readFileContent("C:\\Users\\34327\\IdeaProjects\\javaTest\\src\\main\\java\\TestFile.java"));
    }
}
